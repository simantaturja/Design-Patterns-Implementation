package com.simantaturja.components;

public enum GraphicsCard {
    MSI_GT_710_2GD3H_LP_2GB_DDR3(4700),
    ASUS_GEFORCE_GT_710_2GB_DDR5(6500),
    ASUS_PHOENIX_GEFORCE_GTX_1650_OC_EDITION_4GB_GDDR6(29900),
    ASUS_TUF_GAMING_GEFORCE_GTX_1650_SUPER_OC_4GB(36000),
    GIGABYTE_GEFORCE_GT_1030_LOW_PROFILE_2GB_DDR5(10200);
    private final double price;
    GraphicsCard(final double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
