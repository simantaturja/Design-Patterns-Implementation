package com.simantaturja.decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Beverage coffee = new Coffee(); // base coffee
        coffee = new Sugar(coffee); // wrap with one sugar
        coffee = new Milk(coffee); // wrap with one milk
        coffee = new Chocolate(new Chocolate(coffee)); // wrap with double chocolate
        coffee = new Ice(new Ice(coffee)); //wrap with double ice
        System.out.println(coffee.cost());
        //যদি এক লাইনে লিখতাম -
        Beverage coffee2 = new Ice(new Ice(new Chocolate(new Chocolate(new Milk(new Sugar(new Coffee()))))));
        System.out.println(coffee2.cost());
    }
}