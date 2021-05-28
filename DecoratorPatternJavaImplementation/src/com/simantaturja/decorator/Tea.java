package com.simantaturja.decorator;

public class Tea implements Beverage{
    @Override
    public String details() {
        return "Tea";
    }
    @Override
    public double cost() {
        return 50.00;
    }
}