package com.simantaturja.naive;

import com.simantaturja.components.*;

public class RunnerBean {
    public static void main(String... args) {
        DesktopBean desktopBean = new DesktopBean();
        desktopBean.setCasing(Casing.ANTEC_NX110_MID_TOWER_GAMING);
        desktopBean.setCpuCooler(CpuCooler.GAMDIAS_CHIONE_E2_120_LITE_RGB_LIQUID_CPU_COOLER);
        desktopBean.setGraphicsCard(GraphicsCard.ASUS_GEFORCE_GT_710_2GB_DDR5);
        desktopBean.setHdd(HDD.SEAGATE_1TB);
        desktopBean.setProcessor(Processor.AMD_RYZEN_9_5950X_PROCESSOR);
        desktopBean.setRam(Ram.CORSAIR_DOMINATOR_PLATINUM_RGB_16GB_4000MHz_DDR4);
        desktopBean.setMotherboard(Motherboard.GIGABYTE_GA_H110M_DDR4);
        desktopBean.setPowerSupply(PowerSupply.ANTEC_ATOM_350W);
        desktopBean.setSsd(SSD.GIGABYTE_120GB);
        System.out.println(desktopBean.display());

    }
}
