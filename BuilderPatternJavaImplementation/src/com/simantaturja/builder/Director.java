package com.simantaturja.builder;

public class Director {
    private final DesktopBuilder builder;
    public Director(final DesktopBuilder builder) {
        this.builder = builder;
    }
    public void buildGamingDesktop() {
        builder.assembleCasing();
        builder.assembleMotherboard();
        builder.assembleProcessor();
        builder.assembleRam();
        builder.assembleGraphicsCard();
        builder.assemblePowerSupply();
        builder.assembleCpuCooler();
        builder.assembleSSD();
        builder.assembleHDD();
    }
    public Desktop getDesktop() {
        return builder.getDesktop();
    }
}
