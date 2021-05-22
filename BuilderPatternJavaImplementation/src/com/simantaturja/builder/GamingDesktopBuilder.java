package com.simantaturja.builder;

import com.simantaturja.components.*;

public class GamingDesktopBuilder implements DesktopBuilder {
    private final Desktop desktop;
    public GamingDesktopBuilder(Desktop desktop) {
        this.desktop = desktop;
    }
    @Override
    public Desktop getDesktop() {
        return desktop;
    }
    @Override
    public void assembleCasing() {
        this.desktop.setCasing(Casing.ANTEC_NX110_MID_TOWER_GAMING);
    }

    @Override
    public void assembleMotherboard() {
        this.desktop.setMotherboard(Motherboard.ASROCK_B365M_PRO4_9TH_GEN);
    }

    @Override
    public void assembleProcessor() {
        this.desktop.setProcessor(Processor.AMD_RYZEN_9_5950X_PROCESSOR);
    }

    @Override
    public void assembleRam() {
        this.desktop.setRam(Ram.CORSAIR_DOMINATOR_PLATINUM_RGB_16GB_4000MHz_DDR4);
    }

    @Override
    public void assembleGraphicsCard() {
        this.desktop.setGraphicsCard(GraphicsCard.ASUS_TUF_GAMING_GEFORCE_GTX_1650_SUPER_OC_4GB);
    }

    @Override
    public void assemblePowerSupply() {
        this.desktop.setPowerSupply(PowerSupply.COOLER_MASTER_ELITE_400_V4_230V);
    }

    @Override
    public void assembleCpuCooler() {
        this.desktop.setCpuCooler(CpuCooler.GAMDIAS_CHIONE_E2_120_LITE_RGB_LIQUID_CPU_COOLER);
    }

    @Override
    public void assembleSSD() {
        this.desktop.setSsd(SSD.GIGABYTE_AORUS_1TB_NVMe_GEN4_M2);
    }

    @Override
    public void assembleHDD() {
        this.desktop.setHdd(HDD.SEAGATE_1TB);
    }
}
