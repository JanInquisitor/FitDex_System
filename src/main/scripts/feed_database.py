import csv
import re
import sys
import datetime
import logging
from concurrent.futures import ThreadPoolExecutor
from itertools import islice

import db_session


# This is for testing only
def setup_db():
    db_user = "admin"
    db_password = "admin"
    db_host = "localhost"  # Usually "localhost" if it's on your local machine
    db_port = "5432"
    db_name = "fitdex"
    db_session.global_init(db_user, db_password, db_host, db_port, db_name)


def stop_if_hyphen_in_keys(row):
    for key in row.keys():
        if re.search(r'-', key):
            print(f"Error: Key '{key}' contains a hyphen. Stopping the program.")
            exit()


def insert_whole_data_from_csv(csv_file_path):
    # Create a session to interact with the database
    session = db_session.create_session()

    # Open the CSV file in read mode
    with open(csv_file_path, 'r', encoding='utf-8', errors='replace') as csv_file:
        # Create a CSV DictReader object with the correct delimiter and quote character
        csv_reader = csv.DictReader(csv_file, delimiter='\t', quotechar='"')

        # Iterate over the rows in the CSV file
        for row in csv_reader:
            # Convert date strings to datetime objects if needed
            if 'created_datetime' in row:
                row['created_datetime'] = datetime.datetime.strptime(row['created_datetime'], '%Y-%m-%dT%H:%M:%SZ')

            # Create an instance of your SQLAlchemy model and assign values
            row = {key: value for key, value in row.items() if not re.search(r'-', key)}
            stop_if_hyphen_in_keys(row)

            try:
                # Create an instance of your SQLAlchemy model and assign values
                product = db_session.Product(**row)

                # Add the instance to the session
                session.add(product)

                # Log successful insertion
                logging.info(f"Successfully inserted product with id {row['code']}")
            except Exception as e:
                # Log any exceptions that occur during insertion
                logging.error(f"Error inserting product with id {row['code']}: {str(e)}")

    # Commit the changes to the database
    session.commit()


def process_chunk(chunk):
    with db_session.create_session() as session:

        try:
            for row in chunk:
                # Convert date strings to datetime objects if needed
                # if 'created_datetime' in row:
                #     row['created_datetime'] = datetime.datetime.strptime(row['created_datetime'], '%Y-%m-%dT%H:%M:%SZ')

                row = {key.replace('-', '_'): value for key, value in row.items()}

                try:
                    # Create an instance of your SQLAlchemy model and assign values
                    product = db_session.Product(**row)

                    # Add the instance to the session
                    session.add(product)

                    # Log successful insertion
                    logging.info(f"Successfully inserted product with id {row['code']}")
                except Exception as e:
                    # Log any exceptions that occur during insertion with full traceback
                    logging.error(f"Error inserting product with id {row['code']}: {repr(e)}", exc_info=True)
                    logging.error(f"Problematic row values: {row}")
            # Commit the changes to the database after processing each batch
            session.commit()
            logging.info("Chunk inserted into the database.")
        except Exception as e:
            # Log any exceptions that occur during insertion
            logging.error(f"Error inserting chunk: {e.with_traceback()}")
            # Rollback changes in case of an exception
            session.rollback()
        finally:
            # Close the session
            session.close()


def insert_data_from_csv_threaded(csv_file_path):
    # Open the CSV file in read mode
    with open(csv_file_path, 'r', encoding='utf-8', errors='replace') as csv_file:
        # Create a CSV DictReader object with the correct delimiter and quote character
        csv_reader = csv.DictReader(csv_file, delimiter='\t', quotechar='"')

        # Use ThreadPoolExecutor to parallelize the processing of the CSV file
        with ThreadPoolExecutor() as executor:
            # Specify the batch size for each thread
            BATCH_SIZE = 100

            # Read the CSV file into chunks
            chunks = iter(lambda: list(islice(csv_reader, BATCH_SIZE)), [])

            # Process each batch in parallel
            for chunk in chunks:
                executor.submit(process_chunk, chunk)


if __name__ == "__main__":
    # Configure logging
    logging.basicConfig(level=logging.DEBUG,
                        format='%(asctime)s - %(levelname)s - %(message)s')
    console = logging.StreamHandler()
    console.setLevel(logging.INFO)
    logging.getLogger('').addHandler(console)

    setup_db()

    # Specify the file name
    csv_file_path = './en.openfoodfacts.org.products.csv'

    # Increase the CSV field size limit
    csv.field_size_limit(sys.maxsize)

    insert_data_from_csv_threaded(csv_file_path)
