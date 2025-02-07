package org.FitDex.Persistence;

import org.FitDex.Food.Food;
import org.FitDex.Nutrients.NutritionProfileBuilder;
import org.FitDex.Nutrients.NutritionProfile;
import org.jetbrains.annotations.Nullable;

import java.sql.*;
import java.util.ArrayList;
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

    public void printAllProducts() throws SQLException {
        try (Connection connection = DriverManager.getConnection(this.connectionString)) {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM products;");
            ResultSet resultSet = statement.executeQuery();

            // @TODO: Need to add validation for this method for when it retrieve a null value and avoid the nullPointer Exception
            while (resultSet.next()) {
                String productName = resultSet.getString("product_name");
                String code = resultSet.getString("code");
                double fatMonoContent = resultSet.getDouble("monounsaturated-fat_100g");
                double fatPolyContent = resultSet.getDouble("polyunsaturated-fat_100g");

                NutritionProfile nutritionProfile = nutritionProfileBuilder.setMonounsaturatedFat100g(fatMonoContent)
                        .setPolyunsaturatedFat100g(fatPolyContent).setAcidity100g(resultSet.getDouble("acidity_100g")).build();

//                System.out.println("code: " + code + ", name: " + food.getName() + ", mono fat content: " + food.getMonounsaturated_fat_100g() + ", acidity: " + food.getAcidity_100g() + ", poly fat content: " + fatPolyContent);
                System.out.println("Code: " + code + " Product Name: " + productName);
            }
        }
    }

    public ArrayList<Food> getAllProducts() throws SQLException {
        try (Connection connection = DriverManager.getConnection(this.connectionString)) {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM products;");
            return extractManyHelper(statement);
        }
    }

    // This will get both ingredients and foods, I'll make a dinstinction in the database eventually or have it a single
    // unit, or a field in the table that determines which is which
    public Food getProductsById(int id) throws SQLException {
        try (Connection connection = DriverManager.getConnection(this.connectionString);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM products WHERE code = ?")) {
            statement.setInt(1, id);
            return extractHelper(statement);
        }
    }

    public Food getProductByName(String name) throws SQLException {
        try (Connection connection = DriverManager.getConnection(this.connectionString);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM products WHERE name = ?")) {
            statement.setString(1, name);
            return extractHelper(statement);
        }
    }

    public ArrayList<Food> getProductsByName(String name) throws SQLException {
        try (Connection connection = DriverManager.getConnection(this.connectionString);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM products WHERE product_name ILIKE ?")) { // Use ILIKE for case-insensitive search
            statement.setString(1, "%" + name + "%"); // Matches anywhere in the name
            return extractManyHelper(statement);
        }
    }

// I might make another class or method where I just toss the statement and unclog this class
    @Nullable
    private Food extractHelper(PreparedStatement statement) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery()) {
            if (!resultSet.next()) {
                return null;  // Return null if no data found
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

            System.out.println(resultSet.getString("ingredients_text"));
//            System.out.println(resultSet.getString("ingredients_tags"));
//            System.out.println(resultSet.getString("ingredients_analysis_tags"));

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

            return new Food(productName, nutritionProfile);
        }
    }

    @Nullable
    private ArrayList<Food> extractManyHelper(PreparedStatement statement) throws SQLException {
        ArrayList<Food> result = new ArrayList<>();

        try (ResultSet resultSet = statement.executeQuery()) {

            if (!resultSet.next()) {
                return null;  // Return null if no data found
            }

            while (resultSet.next()) {
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
                        .setSaturatedfat100g(saturatedFatContent)
                        .build();

                result.add(new Food(productName, nutritionProfile));
            }
        }
        return result;
    }
}
