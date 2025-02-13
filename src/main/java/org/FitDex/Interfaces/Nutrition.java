package org.FitDex.Interfaces;

import org.FitDex.Nutrients.NutritionProfile;

// I guess that in the case of the ProductBuilder pattern and the food products you can imagine the building process of the
// meals like a cooking. When creating the object that represents them you are visualizing the cooking of the food product
// or the fabrication process.
public interface Nutrition extends Fat, Mineral, Protein, Vitamin, Carbohydrates {

    void reset();

    Nutrition setAcidity100g(double acidity_100g);

    Nutrition setSalt100g(double salt100g);

    Nutrition setAlcohol100g(double alcohol100g);

    Nutrition setBetaCarotene100g(double betaCarotene100g);

    Nutrition setBicarbonate100g(double bicarbonate100g);

    Nutrition setBiotin100g(double biotin100g);

    Nutrition setCaffeine100g(double caffeine100g);

    Nutrition setCarbohydrates100g(double carbohydrates100g);

    Nutrition setCarnitine100g(double carnitine100g);

    Nutrition setChloride100g(double chloride100g);

    Nutrition setChlorophyl100g(double chlorophyl100g);

    Nutrition setCholesterol100g(double cholesterol100g);

    Nutrition setCholine100g(double choline100g);

    Nutrition setChromium_100g(double chromium_100g);

    Nutrition setCocoa100g(double cocoa100g);

    Nutrition setCopper_100g(double copper_100g);

    Nutrition setEnergyFromFat100g(double energyFromFat100g);

    Nutrition setEnergykcal100g(double energykcal100g);

    Nutrition setEnergyKj100g(double energyKj100g);

    Nutrition setEnergy_100g(double energy_100g);

    Nutrition setErythritol100g(double erythritol100g);

    Nutrition setFat100g(double fat100g);

    Nutrition setFluoride100g(double fluoride100g);

    Nutrition setFolates100g(double folates100g);

    Nutrition setFruitsVegetablesNutsDried100g(double fruitsVegetablesNutsDried100g);

    Nutrition setFruitsVegetablesNutsEstimateFromIngredients100g(double fruitsVegetablesNutsEstimateFromIngredients100g);

    Nutrition setFruitsVegetablesnutsEstimate100g(double fruitsVegetablesnutsEstimate100g);

    Nutrition setFruitsVegetablesNuts100g(double fruitsVegetablesNuts100g);

    Nutrition setGlycemicIndex100g(double glycemicIndex100g);

    Nutrition setInositol100g(double inositol100g);

    Nutrition setIodine100g(double iodine100g);

    Nutrition setIron100g(double iron100g);

    Nutrition setMagnesium100g(double magnesium100g);

    Nutrition setManganese100g(double manganese100g);

    Nutrition setMeadAcid100g(double meadAcid100g);

    Nutrition setMolybdenum100g(double molybdenum100g);

    Nutrition setNitrate100g(double nitrate100g);

    Nutrition setNucleotides100g(double nucleotides100g);

    Nutrition setNutritionScoreFr100g(double nutritionScoreFr100g);

    Nutrition setNutritionScoreUk100g(double nutritionScoreUk100g);

    Nutrition setPh100g(double ph100g);

    Nutrition setPhosphorus100g(double phosphorus100g);

    Nutrition setPhylloquinone100g(double phylloquinone100g);

    Nutrition setPolyols100g(double polyols100g);


    Nutrition setPotassium100g(double potassium100g);


    Nutrition setSelenium100g(double selenium100g);

    Nutrition setSilica100g(double silica100g);

    Nutrition setSodium100g(double sodium100g);

    Nutrition setSulphate100g(double sulphate100g);

    Nutrition setTaurine100g(double taurine100g);

    Nutrition setVitaminA_100g(double vitaminA_100g);

    Nutrition setVitaminB12_100g(double vitaminB12_100g);

    Nutrition setVitaminB1_100g(double vitaminB1_100g);

    Nutrition setVitaminB2_100g(double vitaminB2_100g);

    Nutrition setVitaminB6_100g(double vitaminB6_100g);

    Nutrition setVitaminB9_100g(double vitaminB9_100g);

    Nutrition setVitaminC_100g(double vitaminC_100g);

    Nutrition setVitaminD_100g(double vitaminD_100g);

    Nutrition setVitaminE_100g(double vitaminE_100g);

    Nutrition setVitaminK_100g(double vitaminK_100g);

    Nutrition setVitaminK2_100g(double vitaminK2_100g);

    Nutrition setVitaminPP_100g(double vitaminPP_100g);

    Nutrition setWaterHardness100g(double waterHardness100g);

    Nutrition setZinc100g(double zinc100g);

    Nutrition setCalories(double calories);

    NutritionProfile build();
}
