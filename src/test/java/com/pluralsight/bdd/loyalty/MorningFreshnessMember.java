package com.pluralsight.bdd.loyalty;

public class MorningFreshnessMember {
    private String name;
    private SuperSmoothieSchema schema;
    private int earnedPoint;

    public MorningFreshnessMember(String name, SuperSmoothieSchema schema) {
        this.schema =schema;
        this.name = name;
    }

    public void orders(Integer amount, String drink) {
        earnedPoint += schema.getPointFor(drink)* amount;
    }

    public Integer getPoints() {
        return earnedPoint;
    }
}
