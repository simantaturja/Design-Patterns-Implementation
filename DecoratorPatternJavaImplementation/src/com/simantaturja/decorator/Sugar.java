package com.simantaturja.decorator;

public class Sugar extends Condiments {
    private final double sugarCost = 20.00;
    public Sugar(Beverage beverage) {
        super(beverage);
    }
    public String details() {
        return beverage.details() + " + Sugar";
    }
    public double cost() {
        return beverage.cost() + sugarCost;
    }
}