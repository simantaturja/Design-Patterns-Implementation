package com.simantaturja.components;

public enum Ram {
    CORSAIR_VENGEANCE_LPX_4GB_DDR4_DRAM_2400MHz(2750),
    TEAM_ELITE_PLUS_4GB_2666Mhz_DDR4(2850),
    GSKILL_RIPJAWS_V_4GB_DD4_2666MHz(2900),
    CORSAIR_DOMINATOR_PLATINUM_RGB_16GB_4000MHz_DDR4(23999),
    GSKILL_TRIDENT_Z_NEO_RGB_32GB_DD4_3600MHz(18400),
    GSKILL_TRIDENT_Z_16GB_DDR4_3200MHz_RGB(9800);

    private final double price;
    Ram(final double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
