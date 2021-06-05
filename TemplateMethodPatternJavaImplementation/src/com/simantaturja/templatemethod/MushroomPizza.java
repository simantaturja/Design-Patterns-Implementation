package com.simantaturja.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MushroomPizza extends Pizza {
    @Override
    public void prepareIngredients() {
        System.out.println("Preparing Ingredients!! Mushroom");
    }

    @Override
    public void addToppings() {
        System.out.println("Adding Toppings - Olive");
    }

    public boolean isExtraSauce() {
        String answer = null;
        System.out.println("Would you like to add extra sauce (yes/no)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null || answer.equals("no")) {
            return false;
        }
        return true;
    }

    public boolean isPackPizza() {
        return true;
    }
}
