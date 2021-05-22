package com.simantaturja.components;

public enum CpuCooler {
    CRYORIG_SOCKET_STR4_AMD_THREADRIPPER(600),
    GAMDIAS_CHIONE_E2_120_LITE_RGB_LIQUID_CPU_COOLER(4600),
    COOLER_MASTER_HYPER_T20(1300),
    THERMALTAKE_UX100_ARGB_LIGHTING_AIR(1500),
    ANTEC_NEPTUNE_120(5300),
    NO_CPU_COOLER(0);

    private final double price;

    CpuCooler(final double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
