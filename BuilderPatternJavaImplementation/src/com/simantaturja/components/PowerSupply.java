package com.simantaturja.components;

public enum PowerSupply {
    MAXGREEN_500_WATT(900),
    ANTEC_ATOM_350W(2250),
    ANTEC_ATOM_V450_GAMING(2600),
    THERMALTAKE_LITEPOWER_450W(3400),
    COOLER_MASTER_ELITE_400_V4_230V(3300);

    private final double price;
    PowerSupply(final double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
