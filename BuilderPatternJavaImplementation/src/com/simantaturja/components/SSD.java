package com.simantaturja.components;

public enum SSD {
    WD_GREEN_120GB(2800),
    WD_120GB_M2(2900),
    WD_GREEN_240GB(3290),
    TWINMOS_WT_200_120GB(2200),
    GIGABYTE_120GB(2300),
    PNY_CS900_120GB(2300),
    HP_S700_120GB(2400),
    TRANSCEND_220S_2TB_M2(28500),
    SAMSUNG_970_PRO_512GB_NVMe(16000),
    GIGABYTE_AORUS_1TB_NVMe_GEN4_M2(14550),
    NO_SSD(0);

    private final double price;
    SSD(final double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
