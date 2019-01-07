package by.epam.training.dmitrylishko.task02.main;

import by.epam.training.dmitrylishko.task02.entity.Appliance;

public class PrintApplianceInfo {
    public static void print(Appliance appliance) {
        if (appliance != null) {
            System.out.println("Find some results\n" + appliance.getOptions());
        } else {
            System.out.println("The search has not given any results!");
        }
    }
}
