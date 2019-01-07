package by.epam.training.dmitrylishko.task02.main;

public class Main {
    public static void main(String[] args) {
        Appliance appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria<Oven> criteriaOven = new Criteria<Oven>();
        criteriaOven.setApplianceType("Oven");
        criteriaOven.add(Oven.CAPACITY, 3);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        criteriaOven = new Criteria<Oven>();
        criteriaOven.setApplianceType("Oven");
        criteriaOven.add(Oven.HEIGHT, 200);
        criteriaOven.add(Oven.DEPTH, 300);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>();
        criteriaOven.setApplianceType("TabletPC");
        criteriaTabletPC.add(TabletPC.COLOR, "BLUE");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM, 4);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(appliance);

    }
}
