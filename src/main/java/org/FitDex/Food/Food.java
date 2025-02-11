package org.FitDex.Food;


import org.FitDex.Ingredient;
import org.FitDex.Nutrients.Fats;
import org.FitDex.Nutrients.NutritionProfile;

import java.util.ArrayList;

// For now, to make the system simple. The distinct products based on locality will be distinguish primarily by the system
// by their country flag/attribute. And because their location flag is diferent they'll have the different ingredients, components and nutritional values
// that the system will warn them about

// Maybe the Ingredients in the food class should be a Class or an array/list of class ingredients
public class Food {

    private final String name;

    ArrayList<Ingredient> ingredients;
    // When it's time to create the NutritionalValues of the food/product use perhaps a constructor along with the builder
    // mechanism I implemented.

    String ingredientsString;

    private final NutritionProfile nutritionProfile;

    public Food(String name, NutritionProfile nutritionProfile) {
        this.name = name;
        this.nutritionProfile = nutritionProfile;
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

    public void analyse() {

    }

    public String getName() {
        return name;
    }

    public double getFatTotal() {
        return nutritionProfile.getFat100g();
    }


}
