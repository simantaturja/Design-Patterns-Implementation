package com.simantaturja.solution2;

public abstract class Beverage {
    private boolean milk;
    private boolean sugar;
    private boolean ice;
    private boolean chocolate;

    private final double milkPrice = 10.00;
    private final double sugarPrice = 12.00;
    private final double icePrice = 5.00;
    private final double chocolatePrice = 20.00;

    public boolean hasMilk() {
        return this.milk;
    }
    public boolean hasSugar() {
        return this.sugar;
    }
    public boolean hasIce() {
        return this.ice;
    }
    public boolean hasChocolate() {
        return this.chocolate;
    }

    // Setters for Addons
    public void setMilk(boolean milk) {
        this.milk = milk;
    }
    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }
    public void setIce(boolean ice) {
        this.ice = ice;
    }
    public void setChocolate(boolean chocolate) {
        this.chocolate = chocolate;
    }

    public double getMilkPrice() {
        return this.milkPrice;
    }
    public double getSugarPrice() {
        return this.sugarPrice;
    }
    public double getIcePrice() {
        return this.icePrice;
    }
    public double getChocolatePrice() {
        return this.chocolatePrice;
    }

    public abstract double cost();
}
