package org.FitDex.Nutrients;

import java.util.Map;

// I might, just might, add all these into single hashmap in the Food object. Maybe...
public class NutritionProfile {

    BioactiveCompounds compounds;

    Carbohydrates carbohydrates;

    Fats fats;

    Minerals minerals;

    Proteins proteins;

    Vitamins vitamins;

    public double acidity100g;

    public double salt100g;

    public double sugars100g;

    public double behenicAcid100g;

    public double bicarbonate100g;

    public double cholesterol100g;

    public double cocoa100g; // maybe this should be an ingredient. Is cocoa a nutrient?

    public double energyFromFat100g;

    public double energykcal100g;

    public double energyKj100g;

    public double energy_100g;

    public double erucicAcid100g;

    public double erythritol100g;

    public double fruitsVegetablesNutsDried100g;

    public double fruitsVegetablesNutsEstimateFromIngredients100g;

    public double fruitsVegetablesnutsEstimate100g;

    public double fruitsVegetablesNuts100g;

    public double glycemicIndex100g;

    public double meadAcid100g;

    public double melissicAcid100g;

    public double montanicAcid100g;

    public double nutritionScoreFr100g;

    public double nutritionScoreUk100g;

    public double pantothenicAcid100g;

    public double ph100g;

    public double phylloquinone100g;

    public double polyols100g;

    public double waterHardness100g;

    public double calories;        // optional

    public double fat;             // (g) optional

    final int gramsSize = 100;

    final int milSize = 100;


    public NutritionProfile(
            BioactiveCompounds compounds,
            Carbohydrates carbohydrates,
            Fats fats, Minerals minerals,
            Proteins proteins,
            Vitamins vitamins) {
        this.compounds = compounds;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.minerals = minerals;
        this.proteins = proteins;
        this.vitamins = vitamins;
    }

    public NutritionProfile() {
    }

    public int getGramsSize() {
        return gramsSize;
    }

    public int getMilSize() {
        return milSize;
    }

    public double getAcidity100g() {
        return acidity100g;
    }

    public double getSalt100g() {
        return salt100g;
    }

    public double getSugars100g() {
        return sugars100g;
    }


    public double getBehenicAcid100g() {
        return behenicAcid100g;
    }


    public double getBicarbonate100g() {
        return bicarbonate100g;
    }


    public double getCholesterol100g() {
        return cholesterol100g;
    }

    public double getCocoa100g() {
        return cocoa100g;
    }


    public double getEnergyFromFat100g() {
        return energyFromFat100g;
    }

    public double getEnergykcal100g() {
        return energykcal100g;
    }

    public double getEnergyKj100g() {
        return energyKj100g;
    }

    public double getEnergy_100g() {
        return energy_100g;
    }

    public double getErucicAcid100g() {
        return erucicAcid100g;
    }

    public double getErythritol100g() {
        return erythritol100g;
    }

    public double getFruitsVegetablesNutsDried100g() {
        return fruitsVegetablesNutsDried100g;
    }

    public double getFruitsVegetablesNutsEstimateFromIngredients100g() {
        return fruitsVegetablesNutsEstimateFromIngredients100g;
    }

    public double getFruitsVegetablesnutsEstimate100g() {
        return fruitsVegetablesnutsEstimate100g;
    }

    public double getFruitsVegetablesNuts100g() {
        return fruitsVegetablesNuts100g;
    }

    public double getGlycemicIndex100g() {
        return glycemicIndex100g;
    }

    public double getMeadAcid100g() {
        return meadAcid100g;
    }

    public double getMelissicAcid100g() {
        return melissicAcid100g;
    }


    public double getMontanicAcid100g() {
        return montanicAcid100g;
    }

    public double getNutritionScoreFr100g() {
        return nutritionScoreFr100g;
    }

    public double getNutritionScoreUk100g() {
        return nutritionScoreUk100g;
    }

    public double getPantothenicAcid100g() {
        return pantothenicAcid100g;
    }

    public double getPh100g() {
        return ph100g;
    }

    public double getPhylloquinone100g() {
        return phylloquinone100g;
    }

    public double getPolyols100g() {
        return polyols100g;
    }

    public double getWaterHardness100g() {
        return waterHardness100g;
    }

    public double getCalories() {
        return calories;
    }

    public double getFat() {
        return fat;
    }

    public BioactiveCompounds getCompounds() {
        return compounds;
    }

    public Carbohydrates getCarbohydrates() {
        return carbohydrates;
    }

    public Fats getFats() {
        return fats;
    }

    public Minerals getMinerals() {
        return minerals;
    }

    public Proteins getProteins() {
        return proteins;
    }

    public Vitamins getVitamins() {
        return vitamins;
    }

    public void setCarbohydrates(Map<String, Double> valuesMap) {

    }

    public void setFats(Map<String, Double> valuesMap) {

    }

    public void setMinerals(Map<String, Double> valuesMap) {

    }

    public void setProteins(Map<String, Double> valuesMap) {

    }

    public void setVitamins(Map<String, Double> valuesMap) {

    }

}
