package com.simantaturja.decorator;

public class Ice extends Condiments {
    private final double iceCost = 20.00;

    public Ice(Beverage beverage) {
        super(beverage);
    }

    public String details() {
        return beverage.details() + " + Ice";
    }

    public double cost() {
        return beverage.cost() + iceCost;
    }
}