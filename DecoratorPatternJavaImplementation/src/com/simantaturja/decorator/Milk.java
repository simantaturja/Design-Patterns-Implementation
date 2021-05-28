package com.simantaturja.decorator;

public class Milk extends Condiments {
    private final double milkCost = 20.00;
    public Milk(Beverage beverage) {
        super(beverage);
    }
    public String details() {
        return beverage.details() + " + Milk";
    }
    public double cost() {
        return beverage.cost() + milkCost;
    }
}