package org.FitDex.Food;


import org.FitDex.Nutrients.NutritionalValues;

// For now, to make the system simple. The distinct products based on locality will be distinguish primarily by the system
// by their country flag/attribute. And because their location flag is different they'll have the different ingredients, components and nutritional values
// that the system will warn them about

public class Food {

    private String name;

    // When its time to create the NutritionalValues of the food/product use perhaps a constructor along with the builder
    // mechanism I implemented.
    private NutritionalValues nutritionalValues;

    public Food(String name, NutritionalValues nutritionalValues) {
        this.name = name;
        this.nutritionalValues = nutritionalValues;
    }

    public String getName() {
        return name;
    }


}
