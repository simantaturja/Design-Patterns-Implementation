package com.simantaturja.naive;

import com.simantaturja.components.*;

public class DesktopTelescoping {
    private final Casing casing;
    private final CpuCooler cpuCooler;
    private final GraphicsCard graphicsCard;
    private final HDD hdd;
    private final Motherboard motherboard;
    private final PowerSupply powerSupply;
    private final Processor processor;
    private final Ram ram;
    private final SSD ssd;

    public DesktopTelescoping(Casing casing,
                              CpuCooler cpuCooler,
                              GraphicsCard graphicsCard,
                              HDD hdd,
                              Motherboard motherboard,
                              PowerSupply powerSupply,
                              Processor processor,
                              Ram ram, SSD ssd) {
        this.casing = casing;
        this.cpuCooler = cpuCooler;
        this.graphicsCard = graphicsCard;
        this.hdd = hdd;
        this.motherboard = motherboard;
        this.powerSupply = powerSupply;
        this.processor = processor;
        this.ram = ram;
        this.ssd = ssd;
    }

    public String display() {
        StringBuilder spec = new StringBuilder();
        spec
                .append(casing)
                .append("\n")
                .append(graphicsCard)
                .append("\n")
                .append(processor)
                .append("\n")
                .append(motherboard)
                .append("\n")
                .append(powerSupply)
                .append("\n")
                .append(ram)
                .append("\n");
        if (ssd != SSD.NO_SSD) {
            spec.append(ssd);
            spec.append("\n");
        }
        if (hdd != HDD.NO_HDD) {
            spec.append(hdd);
            spec.append("\n");
        }
        if (cpuCooler != CpuCooler.NO_CPU_COOLER) {
            spec.append(cpuCooler);
            spec.append("\n");
        }
        return spec.toString();
    }

}
