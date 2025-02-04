package org.FitDex.Food;


import org.FitDex.Ingredient;
import org.FitDex.Nutrients.NutritionProfile;

import java.util.ArrayList;

// For now, to make the system simple. The distinct products based on locality will be distinguish primarily by the system
// by their country flag/attribute. And because their location flag is different they'll have the different ingredients, components and nutritional values
// that the system will warn them about

// Maybe the Ingredients in the food class should be a Class or an array/list of class ingredients
public class Food {

    private final String name;

    ArrayList<Ingredient> ingredients;
    // When it's time to create the NutritionalValues of the food/product use perhaps a constructor along with the builder
    // mechanism I implemented.
    private final NutritionProfile nutritionProfile;

    public Food(String name, NutritionProfile nutritionProfile) {
        this.name = name;
        this.nutritionProfile = nutritionProfile;
    }

    public String getName() {
        return name;
    }

    public NutritionProfile getNutritionalValues() {
        return nutritionProfile;
    }
}
