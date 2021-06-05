package com.simantaturja.templatemethod;

public class ChickenMushroomPizza extends Pizza {
    @Override
    public void prepareIngredients() {
        System.out.println("Preparing Ingredients!! Chicken & Mushroom");
    }

    @Override
    public void addToppings() {
        System.out.println("Adding Toppings - Olive, Sausage!");
    }

    public boolean isExtraSauce() {
        return true;
    }

    public boolean isPackPizza() {
        return true;
    }
}