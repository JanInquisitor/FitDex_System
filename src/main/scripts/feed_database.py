import csv
import sys

import db_session


# This is for testing only

def setup_db():
    db_user = "admin"
    db_password = "admin"
    db_host = "localhost"  # Usually "localhost" if it's on your local machine
    db_port = "5432"
    db_name = "fishingnetdb"
    db_session.global_init(db_user, db_password, db_host, db_port, db_name)


setup_db()

# Increase the CSV field size limit
csv.field_size_limit(sys.maxsize)

# Increase the CSV field size limit
csv.field_size_limit(sys.maxsize)

# Specify the file name
csv_file_name = './en.openfoodfacts.org.products.csv'

# Open the CSV file in read mode
with open(csv_file_name, 'r', encoding='utf-8', errors='replace') as csv_file:
    # Create a CSV DictReader object with the correct delimiter and quote character
    csv_reader = csv.DictReader(csv_file, delimiter='\t', quotechar='"')

    # Get the column names dynamically
    column_names = csv_reader.fieldnames
    print(column_names)

    # Iterate over the rows in the CSV file
    # for row in csv_reader:
    #     # Access each cell in the row using the column names
    #     # for column_name in column_names:
    #     #     cell_value = row[column_name]
    #     #     print(f"{column_name}: {cell_value}")
    #     print(row)
