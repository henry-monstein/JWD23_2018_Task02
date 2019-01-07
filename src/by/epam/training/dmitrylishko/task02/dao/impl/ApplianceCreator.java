package by.epam.training.dmitrylishko.task02.dao.impl;

import by.epam.training.dmitrylishko.task02.entity.Appliance;
import by.epam.training.dmitrylishko.task02.entity.Laptop;
import by.epam.training.dmitrylishko.task02.entity.Oven;
import by.epam.training.dmitrylishko.task02.entity.Refrigerator;
import by.epam.training.dmitrylishko.task02.entity.Speakers;
import by.epam.training.dmitrylishko.task02.entity.TabletPC;
import by.epam.training.dmitrylishko.task02.entity.VacuumCleaner;
import by.epam.training.dmitrylishko.task02.entity.criteria.SearchCriteria;


public class ApplianceCreator {
    private ApplianceCreator( ) {}

    public static Appliance createAppliance(String line) {
        String[] parametres = line.split("[:;\\s,=]+");
        Appliance appliance = null;
        switch (parametres[0]) {
            case "Oven":
                appliance = createOven(parametres);
                break;
            case "Laptop":
                appliance = createLaptop(parametres);
                break;
            case "Refrigerator":
                appliance = createRefrigerator(parametres);
                break;
            case "VacuumCleaner":
                appliance = createVacuumCleaner(parametres);
                break;
            case "TabletPC":
                appliance = createTabletPC(parametres);
                break;
            case "Speakers":
                appliance = createSpeakers(parametres);
                break;
        }
        return appliance;
    }

    private static Appliance createOven(String[] parametres) {
        int i = 0;
        for (; i < parametres.length; i++) {
            if (parametres[i].equalsIgnoreCase(SearchCriteria.Oven.POWER_CONSUMPTION.toString())) {
                break;
            }
        }
        Oven oven = new Oven();
        oven.setPowerConsumption(Double.valueOf(parametres[i += 1]));
        oven.setWeight(Double.valueOf(parametres[i += 2]));
        oven.setCapacity(Double.valueOf(parametres[i += 2]));
        oven.setDepth(Double.valueOf(parametres[i += 2]));
        oven.setHeight(Double.valueOf(parametres[i += 2]));
        oven.setWidth(Double.valueOf(parametres[i += 2]));
        return oven;
    }

    private static Laptop createLaptop(String[] parametres) {
        int i = 0;
        for (; i < parametres.length; i++) {
            if (parametres[i].equalsIgnoreCase(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())) {
                break;
            }
        }
        Laptop laptop = new Laptop();
        laptop.setBatteryCapacity(Double.valueOf(parametres[i += 1]));
        laptop.setOS(parametres[i += 2]);
        laptop.setMemoryRom(Double.valueOf(parametres[i += 2]));
        laptop.setSystemMemory(Double.valueOf(parametres[i += 2]));
        laptop.setCPU(Double.valueOf(parametres[i += 2]));
        laptop.setDisplayInchs(Double.valueOf(parametres[i += 2]));
        return laptop;
    }

    private static Appliance createRefrigerator(String[] parametres) {
        int i = 0;
        for (; i < parametres.length; i++) {
            if (parametres[i].equalsIgnoreCase(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())) {
                break;
            }
        }
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setPowerConsumption(Double.valueOf(parametres[i += 1]));
        refrigerator.setWeight(Double.valueOf(parametres[i += 2]));
        refrigerator.setFreezerCapacity(Double.valueOf(parametres[i += 2]));
        refrigerator.setOverallCapacity(Double.valueOf(parametres[i += 2]));
        refrigerator.setHeight(Double.valueOf(parametres[i += 2]));
        refrigerator.setWidth(Double.valueOf(parametres[i += 2]));
        return refrigerator;
    }

    private static Appliance createVacuumCleaner(String[] parametres) {
        int i = 0;
        for (; i < parametres.length; i++) {
            if (parametres[i].equalsIgnoreCase(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString())) {
                break;
            }
        }
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.setPowerConsumption(Double.valueOf(parametres[i += 1]));
        vacuumCleaner.setFilterType(parametres[i += 2].charAt(0));
        vacuumCleaner.setBagType(parametres[i += 2]);
        vacuumCleaner.setWandType(parametres[i += 2]);
        vacuumCleaner.setMotorSpeedRegulation(Double.valueOf(parametres[i += 2]));
        vacuumCleaner.setCleaningWidth(Double.valueOf(parametres[i += 2]));
        return vacuumCleaner;
    }

    private static Appliance createTabletPC(String[] parametres) {
        int i = 0;
        for (; i < parametres.length; i++) {
            if (parametres[i].equalsIgnoreCase(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())) {
                break;
            }
        }
        TabletPC tabletPC = new TabletPC();
        tabletPC.setBatteryCapacity(Double.valueOf(parametres[i += 1]));
        tabletPC.setDisplayInchs(Double.valueOf(parametres[i += 2]));
        tabletPC.setMemoryRom(Double.valueOf(parametres[i += 2]));
        tabletPC.setFlashMemoryCapacity(Double.valueOf(parametres[i += 2]));
        tabletPC.setColor(parametres[i += 2]);
        return tabletPC;
    }

    private static Appliance createSpeakers(String[] parametres) {
        int i = 0;
        for (; i < parametres.length; i++) {
            if (parametres[i].equalsIgnoreCase(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())) {
                break;
            }
        }
        Speakers speakers = new Speakers();
        speakers.setPowerConsumption(Double.valueOf(parametres[i += 1]));
        speakers.setNumberOfSpeakers(Integer.valueOf(parametres[i += 2]));
        String[] frequencyRange = parametres[i += 2].split("[-]+");
        speakers.setLowFrequencyRange(Double.valueOf(frequencyRange[0]));
        speakers.setTopFrequencyRange(Double.valueOf(frequencyRange[1]));
        speakers.setCordLength(Double.valueOf(parametres[i += 2]));
        return speakers;
    }
}
