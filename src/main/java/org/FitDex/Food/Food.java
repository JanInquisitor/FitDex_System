package org.FitDex.Food;


import org.FitDex.Ingredient;
import org.FitDex.LocationRules;
import org.FitDex.Nutrients.Fats;
import org.FitDex.Nutrients.NutritionProfile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// For now, to make the system simple. The distinct products based on locality will be distinguish primarily by the system
// by their country flag/attribute. And because their location flag is diferent they'll have the different ingredients, components and nutritional values
// that the system will warn them about

public class Food {

    private final String name;

    private String ingredientsString;

    private String location = "USA";

    private ArrayList<String> ingredients;// Later this list will hold ingredients

    private final NutritionProfile nutritionProfile;


    public Food(String name, NutritionProfile nutritionProfile) {
        this.name = name;
        this.nutritionProfile = nutritionProfile;
        ingredients = new ArrayList<>();
        ingredients.add("Brominated vegetable oil");
    }

    public void analyseFat() {

        if (nutritionProfile == null) return;

        if (nutritionProfile.getFats().getMonounsaturatedFat100g() >= 10) {
            System.out.print("This product " + "(" + name + ")" + " contains high amounts mono-unsaturated fats.");
            System.out.println(" Mono-unsaturated fat value: " + nutritionProfile.getFats().getMonounsaturatedFat100g());
        }

        if (nutritionProfile.getFat100g() >= 10) {
            System.out.print("This product " + "(" + name + ")" + " contains high amounts of fat.");
            System.out.println(" Fat value: " + nutritionProfile.getFats().getOmega6Fat100g());
        }

        if (nutritionProfile.getFats().getOmega6Fat100g() >= 10) {
            System.out.print("This product " + "(" + name + ")" + " contains high amounts of Omega-6 Fats.");
            System.out.println(" Omega-6 fats value: " + nutritionProfile.getFats().getOmega6Fat100g());
        }

    }

    public void analyse(LocationRules rules) {
        if (!Objects.equals(rules.getLocation(), location)) {
            return;
        }

        List<String> bannedIngredients = rules.getBannedIngredients();

        for (String ingredient : ingredients) {
            if (bannedIngredients.contains(ingredient)) {
                System.out.println("Warning, this product (" + this.getName() + ")" + " contains " + ingredient +", a banned ingredient in " + this.location + ".");
            }
        }

    }

    public String getName() {
        return name;
    }

    public double getFatTotal() {
        return nutritionProfile.getFat100g();
    }


}
