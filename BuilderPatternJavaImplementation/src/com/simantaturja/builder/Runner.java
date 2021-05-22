package com.simantaturja.builder;

public class Runner {
    public static void main(String[] args) {
        Director director = new Director(new GamingDesktopBuilder(new Desktop()));
        director.buildGamingDesktop();
        Desktop desktop = director.getDesktop();
        System.out.println("Specification of the Desktop:-\n-----------\n" + desktop.display());
        System.out.println("Total Price of the Desktop: " + desktop.getTotalPrice());
    }
}
