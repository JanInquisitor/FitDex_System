package org.FitDex.Persistence;

import org.FitDex.Food.Food;
import org.FitDex.Nutrients.NutritionProfileBuilder;
import org.FitDex.Nutrients.NutritionProfile;
import org.jetbrains.annotations.Nullable;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// This class is used for testing purposses
public class FoodDataAccess {

    private String connectionString = "jdbc:postgresql://localhost:5432/fitdex";

    private final String USER = null;

    private final String PASSWORD = null;

    Connection[] connectionPool;

    NutritionProfileBuilder nutritionProfileBuilder = new NutritionProfileBuilder();

    public FoodDataAccess() {
    }

    public ArrayList<Food> getAllProducts() throws SQLException {
        try (Connection connection = DriverManager.getConnection(this.connectionString)) {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM products;");
            try (ResultSet resultSet = statement.executeQuery()) {
                return extractManyHelper(resultSet);
            }
        }
    }

    public Food getProductsById(int id) throws SQLException {
        try (Connection connection = DriverManager.getConnection(this.connectionString);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM products WHERE code = ?")) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                return extractHelper(resultSet);
            }
        }
    }

    // This one will rarely be used tbh.
    public Food getProductSingleByName(String name) throws SQLException {
        try (Connection connection = DriverManager.getConnection(this.connectionString);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM products WHERE product_name = ?")) {
            statement.setString(1, name);
            try (ResultSet resultSet = statement.executeQuery()) {
                return extractHelper(resultSet);
            }
        }
    }

    public ArrayList<Food> getProductsByName(String name) throws SQLException {
        try (Connection connection = DriverManager.getConnection(this.connectionString);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM products WHERE product_name LIKE ?")) { // Use ILIKE for case-insensitive search
            statement.setString(1, "%" + name + "%"); // Matches anywhere in the name
            try (ResultSet resultSet = statement.executeQuery()) {
                return extractManyHelper(resultSet);
            }
        }
    }

    public Food getProductByBrand(String name) throws SQLException {
        try (Connection connection = DriverManager.getConnection(this.connectionString);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM products WHERE brands = ?")) {
            statement.setString(1, name);
            try (ResultSet resultSet = statement.executeQuery()) {
                return extractHelper(resultSet);
            }
        }
    }

    // I might make another class or method where I just toss the statement and unclog this class
    @Nullable
    private Food extractHelper(ResultSet resultSet) throws SQLException {

        if (!resultSet.next()) {
            return null;
        }

        String productName = resultSet.getString("product_name");
        double acidityContent = resultSet.getDouble("acidity_100g");
        double saltContent = resultSet.getDouble("added-salt_100g");
        double alcoholContent = resultSet.getDouble("alcohol_100g");
        double alphaLinolenicAcid = resultSet.getDouble("alpha-linolenic-acid_100g");
        double bicarbonateContent = resultSet.getDouble("bicarbonate_100g");
        double betaCaroteneContent = resultSet.getDouble("beta-carotene_100g");
        double betaGlucanContent = resultSet.getDouble("beta-glucan_100g");
        double caffeineContent = resultSet.getDouble("caffeine_100g");
        double carbohydratesContent = resultSet.getDouble("carbohydrates_100g");
        double fatMonoContent = resultSet.getDouble("monounsaturated-fat_100g");
        double fatPolyContent = resultSet.getDouble("polyunsaturated-fat_100g");
        double saturatedFatContent = resultSet.getDouble("saturated-fat_100g");
        double omega3FatsContent = resultSet.getDouble("omega-3-fat_100g");
        double omega6FatsContent = resultSet.getDouble("omega-6-fat_100g");

        String ingredientsString = resultSet.getString("ingredients_text");
        String countriesString = resultSet.getString("countries");

//        System.out.println(productName);
//        System.out.println("Carbohydrate content: " + carbohydratesContent);

        // Handle null values safely
        if (resultSet.wasNull()) {
            acidityContent = -1;
            saltContent = -1;
            alcoholContent = -1;
        }

        // Assuming NutritionBuilder is correctly set up
        NutritionProfile nutritionProfile = new NutritionProfileBuilder()
                .setAcidity100g(acidityContent)
                .setSalt100g(saltContent)
                .setAlcohol100g(alcoholContent)
                .setAlphaLinolenicAcid100g(alphaLinolenicAcid)
                .setBicarbonate100g(bicarbonateContent)
                .setBetaCarotene100g(betaCaroteneContent)
                .setBetaGlucan100g(betaGlucanContent)
                .setCaffeine100g(caffeineContent)
                .setCarbohydrates100g(carbohydratesContent)
                .setMonounsaturatedFat100g(fatMonoContent)
                .setPolyunsaturatedFat100g(fatPolyContent)
                .setOmega3Fat100g(omega3FatsContent)
                .setOmega6Fat100g(omega6FatsContent)
                .setSaturatedfat100g(saturatedFatContent).build();

        ArrayList<String> ingredients = null;
        if (ingredientsString != null) {
            String[] ingredientsArr = ingredientsString.split(",");
            ingredients = new ArrayList<>(Arrays.asList(ingredientsArr));
        }
        return new Food(productName, countriesString, ingredients, nutritionProfile);
    }

    @Nullable
    private ArrayList<Food> extractManyHelper(ResultSet resultSet) throws SQLException {
        ArrayList<Food> result = new ArrayList<>();
        if (!resultSet.next()) return null;  // Return null if no data found
        // Gotta remember that resultSet has a pointer and moving it with next determines which element is pointing to.
        while (resultSet.next()) {
            result.add(extractHelper(resultSet));
        }
        return result;
    }
}
