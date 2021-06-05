package com.simantaturja.templatemethod;

public class PizzaMaker {
    public static void main(String[] args) {
        Pizza chickenMushroomPizza = new ChickenMushroomPizza();
        chickenMushroomPizza.makePizza();
        Pizza mushroomPizza = new MushroomPizza();
        mushroomPizza.makePizza();
    }
}
