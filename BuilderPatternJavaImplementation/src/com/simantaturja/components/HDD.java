package com.simantaturja.components;

public enum HDD {
    WD_1TB_BLUE(3700),
    WD_1TB_PURPLE(3700),
    SEAGATE_1TB(3700),
    TOSHIBA_P300_1TB(3700),
    SEAGATE_SKYHAWK_1TB(4100),
    WD_6TB_PURPLE(13800),
    NO_HDD(0);

    private final double price;
    HDD(final double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
