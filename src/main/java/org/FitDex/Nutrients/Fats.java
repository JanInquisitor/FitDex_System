package org.FitDex.Nutrients;

public class Fats {

    public double arachidonicAcid100g;

    public double alphaLinolenicAcid100g; //omega3

    public double butyricAcid100g;

    public double capricAcid100g;

    public double caproicAcid100g;

    public double ceroticAcid100g;

    public double caprylicAcid100g;

    public double lauricAcid100g;

    public double myristicAcid100g;

    public double palmiticAcid100g;

    public double stearicAcid100g;

    public double oleicAcid100g;

    public double gondoicAcid100g;

    public double nervonicAcid100g;

    public double linoleicAcid100g;

    public double lignocericAcid100g;

    public double dihomoGammaLinolenicAcid100g;

    public double gammaLinolenicAcid100g;

    public double arachidicAcid100g;

    public double eicosapentaenoicAcid100g;

    public double docosahexaenoicAcid100g;

    public double elaidicAcid100g;

    public double transFat100g;

    public double monounsaturatedFat100g;

    public double polyunsaturatedFat100g;

    public double unsaturatedFat100g;

    public double saturatedFat100g;

    public double omega3Fat100g;

    public double omega6Fat100g;

    public double omega9Fat100g;


    public Fats() {
    }

    public double getTotalFat() {
        return butyricAcid100g +
                capricAcid100g +
                ceroticAcid100g +
                caprylicAcid100g +
                lauricAcid100g +
                myristicAcid100g +
                palmiticAcid100g +
                stearicAcid100g +
                oleicAcid100g +
                gondoicAcid100g +
                nervonicAcid100g +
                alphaLinolenicAcid100g +
                arachidicAcid100g +
                lauricAcid100g +
                lignocericAcid100g +
                dihomoGammaLinolenicAcid100g +
                gammaLinolenicAcid100g +
                arachidonicAcid100g +
                eicosapentaenoicAcid100g +
                docosahexaenoicAcid100g +
                elaidicAcid100g +
                transFat100g +
                monounsaturatedFat100g +
                polyunsaturatedFat100g +
                unsaturatedFat100g +
                saturatedFat100g +
                omega3Fat100g +
                omega6Fat100g +
                omega9Fat100g;
    }

    @Override
    public String toString() {
        return "Fats{saturated=" + saturatedFat100g + ", mono=" + monounsaturatedFat100g +
                ", poly=" + polyunsaturatedFat100g + ", omega3=" + omega3Fat100g + ", omega6=" + omega6Fat100g +
                ", trans=" + transFat100g + '}';
    }

    public double getButyricAcid100g() {
        return butyricAcid100g;
    }

    public double getCapricAcid100g() {
        return capricAcid100g;
    }

    public double getCaproicAcid100g() {
        return caproicAcid100g;
    }

    public double getCeroticAcid100g() {
        return ceroticAcid100g;
    }

    public double getCaprylicAcid100g() {
        return caprylicAcid100g;
    }

    public double getLauricAcid100g() {
        return lauricAcid100g;
    }

    public double getMyristicAcid100g() {
        return myristicAcid100g;
    }

    public double getPalmiticAcid100g() {
        return palmiticAcid100g;
    }

    public double getStearicAcid100g() {
        return stearicAcid100g;
    }

    public double getOleicAcid100g() {
        return oleicAcid100g;
    }

    public double getGondoicAcid100g() {
        return gondoicAcid100g;
    }

    public double getNervonicAcid100g() {
        return nervonicAcid100g;
    }

    public double getAlphaLinolenicAcid100g() {
        return alphaLinolenicAcid100g;
    }

    public double getLinoleicAcid100g() {
        return linoleicAcid100g;
    }

    public double getLignocericAcid100g() {
        return lignocericAcid100g;
    }

    public double getDihomoGammaLinolenicAcid100g() {
        return dihomoGammaLinolenicAcid100g;
    }

    public double getGammaLinolenicAcid100g() {
        return gammaLinolenicAcid100g;
    }

    public double getArachidicAcid100g() {
        return arachidicAcid100g;
    }

    public double getArachidonicAcid100g() {
        return arachidonicAcid100g;
    }

    public double getEicosapentaenoicAcid100g() {
        return eicosapentaenoicAcid100g;
    }

    public double getDocosahexaenoicAcid100g() {
        return docosahexaenoicAcid100g;
    }

    public double getElaidicAcid100g() {
        return elaidicAcid100g;
    }

    public double getTransFat100g() {
        return transFat100g;
    }

    public double getMonounsaturatedFat100g() {
        return monounsaturatedFat100g;
    }

    public double getPolyunsaturatedFat100g() {
        return polyunsaturatedFat100g;
    }

    public double getUnsaturatedFat100g() {
        return unsaturatedFat100g;
    }

    public double getSaturatedFat100g() {
        return saturatedFat100g;
    }

    public double getOmega3Fat100g() {
        return omega3Fat100g;
    }

    public double getOmega6Fat100g() {
        return omega6Fat100g;
    }

    public double getOmega9Fat100g() {
        return omega9Fat100g;
    }
}
