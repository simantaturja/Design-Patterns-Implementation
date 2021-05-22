package com.simantaturja.components;

public enum Casing {
    ASUS_TUF_GAMING_TOWER(1000),
    ASUS_ROG_MINI_D11(2000),
    MAXGREEN_2809BK(3000),
    MAXGREEN_2810BG_ATX(3300),
    ANTEC_NX110_MID_TOWER_GAMING(4000),
    CORSAIR_CARBIDE_SERIES_MID_TOWER_AT(5000);

    private final double price;
    Casing(final double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }

}