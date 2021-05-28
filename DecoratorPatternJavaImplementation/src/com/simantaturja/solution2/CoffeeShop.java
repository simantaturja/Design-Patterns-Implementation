package com.simantaturja.solution2;

public class CoffeeShop {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.setMilk(true);
        tea.setSugar(false);
        tea.setIce(true);
        tea.setChocolate(true);
        System.out.println("Total Price of the Tea: " + tea.cost());

        // একই ভাবে Coffee এর জন্য লিখা যাবে

        Coffee coffee = new Coffee();
        coffee.setMilk(true);
        coffee.setSugar(true);
        coffee.setIce(true);
        coffee.setChocolate(false);
        System.out.println("Total Price of the Coffee: " + coffee.cost());
    }
}
