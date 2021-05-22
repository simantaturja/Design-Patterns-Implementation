package com.simantaturja.builder;

import com.simantaturja.components.*;

public class Desktop {
    private Casing casing;
    private CpuCooler cpuCooler;
    private GraphicsCard graphicsCard;
    private HDD hdd;
    private Motherboard motherboard;
    private PowerSupply powerSupply;
    private Processor processor;
    private Ram ram;
    private SSD ssd;

    private double totalPrice;

    public void setCasing(Casing casing) {
        this.casing = casing;
        totalPrice += casing.getPrice();
    }

    public void setCpuCooler(CpuCooler cpuCooler) {
        this.cpuCooler = cpuCooler;
        totalPrice += cpuCooler.getPrice();
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
        totalPrice += graphicsCard.getPrice();
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
        totalPrice += hdd.getPrice();
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
        totalPrice += motherboard.getPrice();
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
        totalPrice += powerSupply.getPrice();
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
        totalPrice += processor.getPrice();
    }

    public void setRam(Ram ram) {
        this.ram = ram;
        totalPrice += ram.getPrice();
    }

    public void setSsd(SSD ssd) {
        this.ssd = ssd;
        totalPrice += ssd.getPrice();
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
    public double getTotalPrice() {
        return this.totalPrice;
    }
}
