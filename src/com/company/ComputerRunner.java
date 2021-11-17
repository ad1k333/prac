package com.company;
import java.util.ArrayList;
import java.util.List;

public class ComputerRunner {

    public static void main(String[] args) {
        Processor processor = new Processor("Intel", 2);
        RAM ram = new RAM();
        CD_ROM cd_rom = new CD_ROM();
        HDD hdd = new HDD("SSD", "Micron", "256 GB");
        Computer myComp = new Computer("HomeComp", "UX303LB", "Ubuntu");

        myComp.setHardDisk(hdd);

        myComp.switchOn();
        myComp.virusTest();
        myComp.getHardDisk().printCapacity();
        myComp.switchOff();
    }
}