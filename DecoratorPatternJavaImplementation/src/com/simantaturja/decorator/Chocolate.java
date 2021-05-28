package com.simantaturja.decorator;

public class Chocolate extends Condiments {
    private final double chocolateCost = 20.00;
    public Chocolate(Beverage beverage) {
        super(beverage);
    }
    public String details() {
        return beverage.details() + " + Chocolate";
    }
    public double cost() {
        return beverage.cost() + chocolateCost;
    }
}