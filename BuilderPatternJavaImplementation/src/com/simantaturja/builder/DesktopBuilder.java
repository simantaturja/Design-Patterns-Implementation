package com.simantaturja.builder;

import com.simantaturja.components.*;

public interface DesktopBuilder {
    void assembleCasing();
    void assembleMotherboard();
    void assembleProcessor();
    void assembleRam();
    void assembleGraphicsCard();
    void assemblePowerSupply();
    void assembleCpuCooler();
    void assembleSSD();
    void assembleHDD();
    Desktop getDesktop();
}
