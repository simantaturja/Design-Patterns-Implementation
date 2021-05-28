package com.simantaturja.decorator;

public class Condiments implements Beverage {
    Beverage beverage;
    public Condiments(Beverage beverage) {
        this.beverage = beverage;
    }
    public String details() {
        return beverage.details();
    }
    public double cost() {
        return beverage.cost();
    }
}