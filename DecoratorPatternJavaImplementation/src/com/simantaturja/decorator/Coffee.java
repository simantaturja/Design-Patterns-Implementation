package com.simantaturja.decorator;

public class Coffee implements Beverage {
    @Override
    public String details() {
        return "Coffee";
    }
    @Override
    public double cost() {
        return 100.00;
    }
}