package com.simantaturja.naive;

import com.simantaturja.components.*;

public class DesktopBean {
    private Casing casing;
    private CpuCooler cpuCooler;
    private GraphicsCard graphicsCard;
    private HDD hdd;
    private Motherboard motherboard;
    private PowerSupply powerSupply;
    private Processor processor;
    private Ram ram;
    private SSD ssd;

    public Casing getCasing() {
        return casing;
    }

    public void setCasing(Casing casing) {
        this.casing = casing;
    }

    public CpuCooler getCpuCooler() {
        return cpuCooler;
    }

    public void setCpuCooler(CpuCooler cpuCooler) {
        this.cpuCooler = cpuCooler;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        if (motherboard != null) {
            this.processor = processor;
        } else {
            System.out.println("Place motherboard first");
        }
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        if (motherboard != null) {
            this.ram = ram;
        } else {
            System.out.println("Place motherboard first");
        }
    }

    public SSD getSsd() {
        return ssd;
    }

    public void setSsd(SSD ssd) {
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
