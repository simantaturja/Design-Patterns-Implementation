package com.simantaturja.solution2;

public class Tea extends Beverage{
    @Override
    public double cost() {
        double totalPrice = 0.0;
        if (hasMilk()) totalPrice += getMilkPrice();
        if (hasSugar()) totalPrice += getSugarPrice();
        if (hasIce()) totalPrice += getIcePrice();
        if (hasChocolate()) totalPrice += getChocolatePrice();
        return totalPrice;
    }
}
