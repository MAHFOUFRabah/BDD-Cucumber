package com.pluralsight.bdd.loyalty;

import java.util.HashMap;
import java.util.Map;

public class SuperSmoothieSchema {
    Map<String,Integer> pointPerCategory=new HashMap<>();
    private DrinkCatalog catalog;

    public SuperSmoothieSchema(DrinkCatalog catalog) {
        this.catalog = catalog;
    }

    public void setPointCategory(String category, Integer points) {
        pointPerCategory.put(category, points);
    }

    public int getPointFor(String drink) {
        return pointPerCategory.get(categoOf(drink));
    }

    private String categoOf(String drink) {
        return catalog.getCategoryOf(drink);
    }
}
