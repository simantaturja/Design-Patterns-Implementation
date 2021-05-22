package com.simantaturja.components;

public enum Processor {
    AMD_ATHLON_3000G_WITH_RADEON_GRAPHICS(5500),
    AMD_RYZEN_3_2200G_QUAD_CORE_PROCESSOR(8000),
    AMD_RYZEN_3_3100_DESKTOP_PROCESSOR_WRATH_COOLING_SYSTEM(9000),
    AMD_RYZEN_5_3400G_WITH_RADEON_RX_VEGA_11_GRAPHICS(17500),
    INTEL_9TH_GEN_CORE_I5_9400_PROCESSOR(18500),
    INTEL_10TH_GEN_CORE_I9_10900K_10_CORE_PROCESSOR(45000),
    INTEL_11TH_GEN_CORE_I9_11900K_ROCKET_LAKE_PROCESSOR(49000),
    AMD_RYZEN_9_5950X_PROCESSOR(78000);

    private final double price;
    Processor(final double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
