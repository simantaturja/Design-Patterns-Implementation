package com.simantaturja.templatemethod;

public abstract class Pizza {
    public void makePizza() {
        prepareDough();
        bakeCrust();
        prepareIngredients();
        addToppings();
        if (isExtraSauce()) {
            extraSauce();
        }
        bakePizza();
        if (isPackPizza()) {
            packPizza();
        }
    }

    void prepareDough() {
        System.out.println("Preparing Pizza Dough!");
    }

    void bakeCrust() {
        System.out.println("Baking Crust!");
    }

    abstract void prepareIngredients();

    abstract void addToppings();

    void extraSauce() {
        System.out.println("Adding Extra Sauce!");
    }

    void bakePizza() {
        System.out.println("Baking Pizza!");
    }

    void packPizza() {
        System.out.println("Packing Pizza!");
    }

    boolean isPackPizza() {
        return false;
    }

    boolean isExtraSauce() {
        return false;
    }
}