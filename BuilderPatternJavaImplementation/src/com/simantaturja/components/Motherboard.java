package com.simantaturja.components;

public enum Motherboard {
    GIGABYTE_GAF2A68HM_ULTRA_DURABLE_AMD(4500),
    ASROCK_HM81M_ALOY(5400),
    GIGABYTE_GA_H110M_DDR4(5100),
    GIGABYTE_H310M_8TH_GEN(6500),
    ASUS_PRIME_DDR3_MINI_ITX(5500),
    MSI_H81M_INTEL_CHIPSET(5600),
    GIGABYTE_H310M_DS2_8TH_GEN_MICRO_ATX(6500),
    ASROCK_B365M_PRO4_9TH_GEN(8500);

    private final double price;
    Motherboard(final double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
