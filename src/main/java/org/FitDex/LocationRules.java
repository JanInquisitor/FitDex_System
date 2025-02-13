package org.FitDex;

import java.util.ArrayList;
import java.util.List;

public class LocationRules {

    // This will be the country or locale.
    String location;

    List<String> bannedIngredients;

    public LocationRules(String location) {
        this.location = location;
        this.bannedIngredients = new ArrayList<>();
        bannedIngredients.add("Brominated vegetable oil");
    }

    public String getLocation() {
        return location;
    }

    public List<String> getBannedIngredients() {
        return bannedIngredients;
    }
}
