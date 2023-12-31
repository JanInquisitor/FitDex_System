import sqlalchemy as sa
import sqlalchemy.orm as orm
from sqlalchemy.orm import Session

import datetime
import sqlalchemy as sa
import sqlalchemy.ext.declarative as dec

SqlAlchemyBase = dec.declarative_base()


class Product(SqlAlchemyBase):
    __tablename__ = "Products"

    id = sa.Column(sa.String, primary_key=True)
    code = sa.Column(sa.String)
    # created_date = sa.Column(sa.DateTime, default=datetime.datetime.now, index=True)
    url = sa.Column(sa.String)
    creator = sa.Column(sa.String)
    created_t = sa.Column(sa.String)
    created_datetime = sa.Column(sa.String)
    last_modified_t = sa.Column(sa.String)
    last_modified_datetime = sa.Column(sa.String)
    last_modified_by = sa.Column(sa.String)
    product_name = sa.Column(sa.String)
    abbreviated_product_name = sa.Column(sa.String)
    generic_name = sa.Column(sa.String)
    quantity = sa.Column(sa.String)
    packaging = sa.Column(sa.String)
    packaging_tags = sa.Column(sa.String)
    packaging_en = sa.Column(sa.String)
    packaging_text = sa.Column(sa.Text)
    rands = sa.Column(sa.String)
    brands = sa.Column("brands",sa.String)  # or sa.Text
    brands_tags = sa.Column(sa.String)
    categories = sa.Column(sa.String)
    categories_tags = sa.Column(sa.String)
    categories_en = sa.Column(sa.String)
    origins = sa.Column(sa.String)
    origins_tags = sa.Column(sa.String)
    origins_en = sa.Column(sa.String)
    manufacturing_places = sa.Column(sa.String)
    manufacturing_places_tags = sa.Column(sa.String)
    labels = sa.Column(sa.String)
    labels_tags = sa.Column(sa.String)
    labels_en = sa.Column(sa.String)
    emb_codes = sa.Column(sa.String)
    emb_codes_tags = sa.Column(sa.String)
    first_packaging_code_geo = sa.Column(sa.String)
    cities = sa.Column(sa.String)
    cities_tags = sa.Column(sa.String)
    purchase_places = sa.Column(sa.String)
    stores = sa.Column(sa.String)
    countries = sa.Column(sa.String)
    countries_tags = sa.Column(sa.String)
    countries_en = sa.Column(sa.String)
    ingredients_text = sa.Column(sa.String)
    ingredients_tags = sa.Column(sa.String)
    ingredients_analysis_tags = sa.Column(sa.String)
    allergens = sa.Column(sa.String)
    allergens_en = sa.Column(sa.String)
    traces = sa.Column(sa.String)
    traces_tags = sa.Column(sa.String)
    traces_en = sa.Column(sa.String)
    serving_size = sa.Column(sa.String)
    serving_quantity = sa.Column(sa.String)
    no_nutrition_data = sa.Column(sa.String)
    additives_n = sa.Column(sa.String)
    additives = sa.Column(sa.String)
    additives_tags = sa.Column(sa.String)
    additives_en = sa.Column(sa.String)
    nutriscore_score = sa.Column(sa.String)
    nutriscore_grade = sa.Column(sa.String)
    nova_group = sa.Column(sa.String)
    pnns_groups_1 = sa.Column(sa.String)
    pnns_groups_2 = sa.Column(sa.String)
    food_groups = sa.Column(sa.String)
    food_groups_tags = sa.Column(sa.String)
    food_groups_en = sa.Column(sa.String)
    states = sa.Column(sa.String)
    states_tags = sa.Column(sa.String)
    states_en = sa.Column(sa.String)
    brand_owner = sa.Column(sa.String)
    ecoscore_score = sa.Column(sa.String)
    ecoscore_grade = sa.Column(sa.String)
    nutrient_levels_tags = sa.Column(sa.String)
    product_quantity = sa.Column(sa.String)
    owner = sa.Column(sa.String)
    data_quality_errors_tags = sa.Column(sa.String)
    unique_scans_n = sa.Column(sa.String)
    popularity_tags = sa.Column(sa.String)
    completeness = sa.Column(sa.String)
    last_image_t = sa.Column(sa.String)
    last_image_datetime = sa.Column(sa.String)
    main_category = sa.Column(sa.String)
    main_category_en = sa.Column(sa.String)
    image_url = sa.Column(sa.String)
    image_small_url = sa.Column(sa.String)
    image_ingredients_url = sa.Column(sa.String)
    image_ingredients_small_url = sa.Column(sa.String)
    image_nutrition_url = sa.Column(sa.String)
    image_nutrition_small_url = sa.Column(sa.String)
    energy_kj_100g = sa.Column( sa.Float)
    energy_kcal_100g = sa.Column( sa.Float)
    energy_100g = sa.Column(sa.Float)
    energy_from_fat_100g = sa.Column(sa.Float)
    energy_from_fat_100g = sa.Column(sa.String)
    fat_100g = sa.Column(sa.String)
    saturated_fat_100g = sa.Column(sa.String)
    butyric_acid_100g = sa.Column(sa.String)
    caproic_acid_100g = sa.Column(sa.String)
    caprylic_acid_100g = sa.Column(sa.String)
    capric_acid_100g = sa.Column(sa.String)
    lauric_acid_100g = sa.Column(sa.String)
    myristic_acid_100g = sa.Column(sa.String)
    palmitic_acid_100g = sa.Column(sa.String)
    stearic_acid_100g = sa.Column(sa.String)
    arachidic_acid_100g = sa.Column(sa.String)
    behenic_acid_100g = sa.Column(sa.String)
    lignoceric_acid_100g = sa.Column(sa.String)
    cerotic_acid_100g = sa.Column(sa.String)
    montanic_acid_100g = sa.Column(sa.String)
    melissic_acid_100g = sa.Column(sa.String)
    unsaturated_fat_100g = sa.Column(sa.String)
    monounsaturated_fat_100g = sa.Column(sa.String)
    polyunsaturated_fat_100g = sa.Column(sa.String)
    omega_3_fat_100g = sa.Column(sa.String)
    alpha_linolenic_acid_100g = sa.Column(sa.String)
    eicosapentaenoic_acid_100g = sa.Column(sa.String)
    docosahexaenoic_acid_100g = sa.Column(sa.String)
    omega_6_fat_100g = sa.Column(sa.String)
    linoleic_acid_100g = sa.Column(sa.String)
    arachidonic_acid_100g = sa.Column(sa.String)
    gamma_linolenic_acid_100g = sa.Column(sa.String)
    dihomo_gamma_linolenic_acid_100g = sa.Column(sa.String)
    omega_9_fat_100g = sa.Column(sa.String)
    oleic_acid_100g = sa.Column(sa.String)
    elaidic_acid_100g = sa.Column(sa.String)
    gondoic_acid_100g = sa.Column(sa.String)
    mead_acid_100g = sa.Column(sa.String)
    erucic_acid_100g = sa.Column(sa.String)
    nervonic_acid_100g = sa.Column(sa.String)
    trans_fat_100g = sa.Column(sa.String)
    cholesterol_100g = sa.Column(sa.String)
    carbohydrates_100g = sa.Column(sa.String)
    sugars_100g = sa.Column(sa.String)
    added_sugars_100g = sa.Column(sa.String)
    sucrose_100g = sa.Column(sa.String)
    glucose_100g = sa.Column(sa.String)
    fructose_100g = sa.Column(sa.String)
    lactose_100g = sa.Column(sa.String)
    maltose_100g = sa.Column(sa.String)
    maltodextrins_100g = sa.Column(sa.String)
    starch_100g = sa.Column(sa.String)
    polyols_100g = sa.Column(sa.String)
    erythritol_100g = sa.Column(sa.String)
    fiber_100g = sa.Column(sa.String)
    soluble_fiber_100g = sa.Column(sa.String)
    insoluble_fiber_100g = sa.Column(sa.String)
    proteins_100g = sa.Column(sa.String)
    casein_100g = sa.Column(sa.String)
    serum_proteins_100g = sa.Column(sa.String)
    nucleotides_100g = sa.Column(sa.String)
    salt_100g = sa.Column(sa.String)
    added_salt_100g = sa.Column(sa.String)
    sodium_100g = sa.Column(sa.String)
    alcohol_100g = sa.Column(sa.String)
    vitamin_a_100g = sa.Column(sa.String)
    beta_carotene_100g = sa.Column(sa.String)
    vitamin_d_100g = sa.Column(sa.String)
    vitamin_e_100g = sa.Column(sa.String)
    vitamin_k_100g = sa.Column(sa.String)
    vitamin_c_100g = sa.Column(sa.String)
    vitamin_b1_100g = sa.Column(sa.String)
    vitamin_b2_100g = sa.Column(sa.String)
    vitamin_pp_100g = sa.Column(sa.String)
    vitamin_b6_100g = sa.Column(sa.String)
    vitamin_b9_100g = sa.Column(sa.String)
    folates_100g = sa.Column(sa.String)
    vitamin_b12_100g = sa.Column(sa.String)
    biotin_100g = sa.Column(sa.String)
    pantothenic_acid_100g = sa.Column(sa.String)
    silica_100g = sa.Column(sa.String)
    bicarbonate_100g = sa.Column(sa.String)
    potassium_100g = sa.Column(sa.String)
    chloride_100g = sa.Column(sa.String)
    calcium_100g = sa.Column(sa.String)
    phosphorus_100g = sa.Column(sa.String)
    iron_100g = sa.Column(sa.String)
    magnesium_100g = sa.Column(sa.String)
    zinc_100g = sa.Column(sa.String)
    copper_100g = sa.Column(sa.String)
    manganese_100g = sa.Column(sa.String)
    fluoride_100g = sa.Column(sa.String)
    selenium_100g = sa.Column(sa.String)
    chromium_100g = sa.Column(sa.String)
    molybdenum_100g = sa.Column(sa.String)
    iodine_100g = sa.Column(sa.String)
    caffeine_100g = sa.Column(sa.String)
    taurine_100g = sa.Column(sa.String)
    ph_100g = sa.Column(sa.String)
    fruits_vegetables_nuts_100g = sa.Column(sa.String)
    fruits_vegetables_nuts_dried_100g = sa.Column(sa.String)
    fruits_vegetables_nuts_estimate_100g = sa.Column(sa.String)
    fruits_vegetables_nuts_estimate_from_ingredients_100g = sa.Column(sa.String)
    collagen_meat_protein_ratio_100g = sa.Column(sa.String)
    cocoa_100g = sa.Column(sa.String)
    chlorophyl_100g = sa.Column(sa.String)
    carbon_footprint_100g = sa.Column(sa.String)
    carbon_footprint_from_meat_or_fish_100g = sa.Column(sa.String)
    nutrition_score_fr_100g = sa.Column(sa.String)
    nutrition_score_uk_100g = sa.Column(sa.String)
    glycemic_index_100g = sa.Column(sa.String)
    water_hardness_100g = sa.Column(sa.String)
    choline_100g = sa.Column(sa.String)
    phylloquinone_100g = sa.Column(sa.String)
    beta_glucan_100g = sa.Column(sa.Float)
    inositol_100g = sa.Column(sa.Float)
    carnitine_100g = sa.Column(sa.Float)
    sulphate_100g = sa.Column(sa.Float)
    nitrate_100g = sa.Column(sa.Float)


__factory = None


def global_init(username, password, hostname, port, database_name):
    global __factory

    if __factory:
        return

    if not username or not password or not hostname or not port or not database_name:
        raise Exception("You must specify PostgreSQL connection details.")

    # connection_string = f"postgresql://{username}:{password}@{hostname}:{port}/{database_name}"
    connection_string = f"postgresql://{hostname}:{port}/{database_name}"
    print("Connecting to DB with {}".format(connection_string))

    engine = sa.create_engine(connection_string, echo=True)
    __factory = orm.sessionmaker(bind=engine)

    # This imports the model classes so that the create_all() function has access to them to create the database tables
    SqlAlchemyBase.metadata.create_all(engine)


def create_session() -> Session:
    global __factory
    return __factory()
