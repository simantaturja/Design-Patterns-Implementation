package com.simantaturja.naive;

import com.simantaturja.components.*;

public class RunnerTelescoping {
    public static void main(String... args) {
        DesktopTelescoping desktopTelescoping = new DesktopTelescoping(
                Casing.ANTEC_NX110_MID_TOWER_GAMING,
                CpuCooler.GAMDIAS_CHIONE_E2_120_LITE_RGB_LIQUID_CPU_COOLER,
                GraphicsCard.ASUS_GEFORCE_GT_710_2GB_DDR5,
                HDD.SEAGATE_1TB,
                Motherboard.ASROCK_B365M_PRO4_9TH_GEN,
                PowerSupply.ANTEC_ATOM_350W,
                Processor.AMD_RYZEN_9_5950X_PROCESSOR,
                Ram.CORSAIR_DOMINATOR_PLATINUM_RGB_16GB_4000MHz_DDR4,
                SSD.GIGABYTE_120GB
        );
        System.out.println(desktopTelescoping.display());

    }
}
