package org.FitDex;


import org.FitDex.Food.Food;
import org.FitDex.Nutrients.NutritionProfile;

// This class will be the main engine of analysis of the whole system. (The name is subject to change)
// Should this be a static class?
public class FoodAnalyzer {

    static void analyseFat(Food food) {
        NutritionProfile nutritionProfile = food.getNutritionalValues();
        Warning warningObject = new Warning();

        if (nutritionProfile.getFats().getMonounsaturatedFat100g() >= 10) {
            System.out.println("This product " + "(" + food.getName() + ")" + " contains high amounts mono-unsaturated fats.");
            System.out.println("Mono-unsaturated fatvalue: " + nutritionProfile.getFats().getMonounsaturatedFat100g());
        }

        if (nutritionProfile.getFat() >= 10) {
            System.out.println("This product " + "(" + food.getName() + ")" + " contains high amounts of fat.");
            System.out.println("Fat value: " + nutritionProfile.getFats().getOmega6Fat100g());
        }

        if (nutritionProfile.getFats().getOmega6Fat100g() >= 10) {
            System.out.println("This product " + "(" + food.getName() + ")" + " contains high amounts of Omega-6 Fats.");
            System.out.println("Omega-6 fats value: " + nutritionProfile.getFats().getOmega6Fat100g());
        }
    }

    static void analyseFat(Ingredient ingredient) {

    }

    static void analyseVitamin(Food food) {

    }

    static void analyseVitamin(Ingredient ingredient) {}

    static void analyseProtein(Food food) {}

    static void analyseProtein(Ingredient ingredient) {}

    static void analyseIngredients() {

    }

    static void analyseFood() {

    }

    static Warning issueWarning() {
        return new Warning();
    }


}
