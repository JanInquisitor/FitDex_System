package org.FitDex.Nutrients;

import org.FitDex.Interfaces.Nutrition;

public class NutritionBuilder implements Nutrition {
    private NutritionalValues values;

    public NutritionBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.values = new NutritionalValues();
    }

    @Override
    public Nutrition setAcidity100g(double acidity_100g) {
        values.acidity100g = acidity_100g;
        return this;
    }

    @Override
    public Nutrition setSalt100g(double salt100g) {
        values.salt100g = salt100g;
        return this;
    }

    @Override
    public Nutrition setSugars100g(double sugars100g) {
        return this;
    }

    @Override
    public Nutrition setAlcohol100g(double alcohol100g) {
        values.alcohol100g = alcohol100g;
        return this;
    }

    @Override
    public Nutrition setAlphaLinolenicAcid100g(double alphaLinolenicAcid100g) {
        values.alphaLinolenicAcid100g = alphaLinolenicAcid100g;
        return this;
    }

    @Override
    public Nutrition setArachidicAcid100g(double arachidicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setArachidonicAcid100g(double arachidonicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setBehenicAcid100g(double behenicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setBetaCarotene100g(double betaCarotene100g) {
        values.betaCarotene100g = betaCarotene100g;
        return this;
    }

    @Override
    public Nutrition setBetaGlucan100g(double betaGlucan100g) {
        values.betaGlucan100g = betaGlucan100g;
        return this;
    }

    @Override
    public Nutrition setBicarbonate100g(double bicarbonate100g) {
        values.bicarbonate100g = bicarbonate100g;
        return this;
    }

    @Override
    public Nutrition setBiotin100g(double biotin100g) {
        return this;
    }

    @Override
    public Nutrition setButyricAcid100g(double butyricAcid100g) {
        return this;
    }

    @Override
    public Nutrition setCaffeine100g(double caffeine100g) {
        values.caffeine100g = caffeine100g;
        return this;
    }

    @Override
    public Nutrition setCalcium100g(double calcium100g) {
        return this;
    }

    @Override
    public Nutrition setCapricAcid100g(double capricAcid100g) {
        return this;
    }

    @Override
    public Nutrition setCaproicAcid100g(double caproicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setCaprylicAcid100g(double caprylicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setCarbohydrates100g(double carbohydrates100g) {
        values.carbohydrates100g = carbohydrates100g;
        return this;
    }

    @Override
    public Nutrition setCarnitine100g(double carnitine100g) {
        return this;
    }

    @Override
    public Nutrition setCasein100g(double casein100g) {
        return this;
    }

    @Override
    public Nutrition setCeroticAcid100g(double ceroticAcid100g) {
        return this;
    }

    @Override
    public Nutrition setChloride100g(double chloride100g) {
        return this;
    }

    @Override
    public Nutrition setChlorophyl100g(double chlorophyl100g) {
        return this;
    }

    @Override
    public Nutrition setCholesterol100g(double cholesterol100g) {
        return this;
    }

    @Override
    public Nutrition setCholine100g(double choline100g) {
        return this;
    }

    @Override
    public Nutrition setChromium_100g(double chromium_100g) {
        return this;
    }

    @Override
    public Nutrition setCocoa100g(double cocoa100g) {
        return this;
    }

    @Override
    public Nutrition setCollagenMeatProteinRatio100g(double collagenMeatProteinRatio100g) {
        return this;
    }

    @Override
    public Nutrition setCopper_100g(double copper_100g) {
        return this;
    }

    @Override
    public Nutrition setDihomoGammaLinolenicAcid100g(double dihomoGammaLinolenicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setDocosahexaenoicAcid100g(double docosahexaenoicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setEicosapentaenoicAcid100g(double eicosapentaenoicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setElaidicAcid100g(double elaidicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setEnergyFromFat100g(double energyFromFat100g) {
        return this;
    }

    @Override
    public Nutrition setEnergykcal100g(double energykcal100g) {
        return this;
    }

    @Override
    public Nutrition setEnergyKj100g(double energyKj100g) {
        return this;
    }

    @Override
    public Nutrition setEnergy_100g(double energy_100g) {
        return this;
    }

    @Override
    public Nutrition setErucicAcid100g(double erucicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setErythritol100g(double erythritol100g) {
        return this;
    }

    @Override
    public Nutrition setFat100g(double fat100g) {
        return this;
    }

    @Override
    public Nutrition setFiber100g(double fiber100g) {
        return this;
    }

    @Override
    public Nutrition setFluoride100g(double fluoride100g) {
        return this;
    }

    @Override
    public Nutrition setFolates100g(double folates100g) {
        return this;
    }

    @Override
    public Nutrition setFructose100g(double fructose100g) {
        return this;
    }

    @Override
    public Nutrition setFruitsVegetablesNutsDried100g(double fruitsVegetablesNutsDried100g) {
        return this;
    }

    @Override
    public Nutrition setFruitsVegetablesNutsEstimateFromIngredients100g(double fruitsVegetablesNutsEstimateFromIngredients100g) {
        return this;
    }

    @Override
    public Nutrition setFruitsVegetablesnutsEstimate100g(double fruitsVegetablesnutsEstimate100g) {
        return this;
    }

    @Override
    public Nutrition setFruitsVegetablesNuts100g(double fruitsVegetablesNuts100g) {
        return this;
    }

    @Override
    public Nutrition setGammaLinolenicAcid100g(double gammaLinolenicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setGlucose_100g(double glucose_100g) {
        return this;
    }

    @Override
    public Nutrition setGlycemicIndex100g(double glycemicIndex100g) {
        return this;
    }

    @Override
    public Nutrition setGondoicAcid100g(double gondoicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setInositol100g(double inositol100g) {
        return this;
    }

    @Override
    public Nutrition setInsolubleFiber100g(double insolubleFiber100g) {
        return this;
    }

    @Override
    public Nutrition setIodine100g(double iodine100g) {
        return this;
    }

    @Override
    public Nutrition setIron100g(double iron100g) {
        return this;
    }

    @Override
    public Nutrition setLactose100g(double lactose100g) {
        return this;
    }

    @Override
    public Nutrition setLauricAcid100g(double lauricAcid100g) {
        return this;
    }

    @Override
    public Nutrition setLignocericAcid100g(double lignocericAcid100g) {
        return this;
    }

    @Override
    public Nutrition setLinoleicAcid100g(double linoleicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setMagnesium100g(double magnesium100g) {
        return this;
    }

    @Override
    public Nutrition setMaltodextrins100g(double maltodextrins100g) {
        return this;
    }

    @Override
    public Nutrition setMaltose100g(double maltose100g) {
        return this;
    }

    @Override
    public Nutrition setManganese100g(double manganese100g) {
        return this;
    }

    @Override
    public Nutrition setMeadAcid100g(double meadAcid100g) {
        return this;
    }

    @Override
    public Nutrition setMelissicAcid100g(double melissicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setMolybdenum100g(double molybdenum100g) {
        return this;
    }

    @Override
    public Nutrition setMonounsaturatedFat100g(double monounsaturatedFat100g) {
        values.monounsaturatedFat100g = monounsaturatedFat100g;
        return this;
    }

    @Override
    public Nutrition setMontanicAcid100g(double montanicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setMyristicAcid100g(double myristicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setNervonicAcid100g(double nervonicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setNitrate100g(double nitrate100g) {
        return this;
    }

    @Override
    public Nutrition setNucleotides100g(double nucleotides100g) {
        return this;
    }

    @Override
    public Nutrition setNutritionScoreFr100g(double nutritionScoreFr100g) {
        return this;
    }

    @Override
    public Nutrition setNutritionScoreUk100g(double nutritionScoreUk100g) {
        return this;
    }

    @Override
    public Nutrition setOleicAcid100g(double oleicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setOmega3Fat100g(double omega3Fat100g) {
        return this;
    }

    @Override
    public Nutrition setOmega6Fat100g(double omega6Fat100g) {
        return this;
    }

    @Override
    public Nutrition setOmega9Fat100g(double omega9Fat100g) {
        return this;
    }

    @Override
    public Nutrition setPalmiticAcid100g(double palmiticAcid100g) {
        return this;
    }

    @Override
    public Nutrition setPantothenicAcid100g(double pantothenicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setPh100g(double ph100g) {
        return this;
    }

    @Override
    public Nutrition setPhosphorus100g(double phosphorus100g) {
        return this;
    }

    @Override
    public Nutrition setPhylloquinone100g(double phylloquinone100g) {
        return this;
    }

    @Override
    public Nutrition setPolyols100g(double polyols100g) {
        return this;
    }

    @Override
    public Nutrition setPolyunsaturatedFat100g(double polyunsaturatedFat100g) {
        values.polyunsaturatedFat100g = polyunsaturatedFat100g;
        return this;
    }

    @Override
    public Nutrition setPotassium100g(double potassium100g) {
        return this;
    }

    @Override
    public Nutrition setProteins100g(double proteins100g) {
        return this;
    }

    @Override
    public Nutrition setSaturatedfat100g(double saturatedfat100g) {
        values.saturatedfat100g = saturatedfat100g;
        return this;
    }

    @Override
    public Nutrition setSelenium100g(double selenium100g) {
        return this;
    }

    @Override
    public Nutrition setSerumProteins100g(double serumProteins100g) {
        return this;
    }

    @Override
    public Nutrition setSilica100g(double silica100g) {
        return this;
    }

    @Override
    public Nutrition setSodium100g(double sodium100g) {
        return this;
    }

    @Override
    public Nutrition setSolubleFiber100g(double solubleFiber100g) {
        return this;
    }

    @Override
    public Nutrition setStarch100g(double starch100g) {
        return this;
    }

    @Override
    public Nutrition setStearicAcid100g(double stearicAcid100g) {
        return this;
    }

    @Override
    public Nutrition setSucrose100g(double sucrose100g) {
        return this;
    }

    @Override
    public Nutrition setSulphate100g(double sulphate100g) {
        return this;
    }

    @Override
    public Nutrition setTaurine100g(double taurine100g) {
        return this;
    }

    @Override
    public Nutrition setTransFat100g(double transFat100g) {
        return this;
    }

    @Override
    public Nutrition setUnsaturatedFat100g(double unsaturatedFat100g) {
        return this;
    }

    @Override
    public Nutrition setVitaminA_100g(double vitaminA_100g) {
        return this;
    }

    @Override
    public Nutrition setVitaminB12_100g(double vitaminB12_100g) {
        return this;
    }

    @Override
    public Nutrition setVitaminB1_100g(double vitaminB1_100g) {
        return this;
    }

    @Override
    public Nutrition setVitaminB2_100g(double vitaminB2_100g) {
        return this;
    }

    @Override
    public Nutrition setVitaminB6_100g(double vitaminB6_100g) {
        return this;
    }

    @Override
    public Nutrition setVitaminB9_100g(double vitaminB9_100g) {
        return this;
    }

    @Override
    public Nutrition setVitaminC_100g(double vitaminC_100g) {
        return this;
    }

    @Override
    public Nutrition setVitaminD_100g(double vitaminD_100g) {
        return this;
    }

    @Override
    public Nutrition setVitaminE_100g(double vitaminE_100g) {
        return this;
    }

    @Override
    public Nutrition setVitaminK_100g(double vitaminK_100g) {
        return this;
    }

    @Override
    public Nutrition setVitaminK2_100g(double vitaminK2_100g) {
        return this;
    }

    @Override
    public Nutrition setVitaminPP_100g(double vitaminPP_100g) {
        return this;
    }

    @Override
    public Nutrition setWaterHardness100g(double waterHardness100g) {
        return this;
    }

    @Override
    public Nutrition setZinc100g(double zinc100g) {
        return this;
    }

    @Override
    public Nutrition setCalories(double calories) {
        return this;
    }

    @Override
    public Nutrition setFat(double fat) {
        return this;
    }


    @Override
    public NutritionalValues build() {
        NutritionalValues values = this.values;
        this.reset();
        return values;
    }
}


