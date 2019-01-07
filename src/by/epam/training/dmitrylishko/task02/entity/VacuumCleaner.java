package by.epam.training.dmitrylishko.task02.entity;

import java.util.Objects;

public class VacuumCleaner extends Appliance {
    private double powerConsumption;
    private char filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner() {
    }

    public VacuumCleaner(double powerConsumption, char filterType, String bagType, String wandType, double motorSpeedRegulation, double cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public char getFilterType() {
        return filterType;
    }

    public void setFilterType(char filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (hashCode() != o.hashCode()) return false;
        if (!(o instanceof VacuumCleaner)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0 &&
                filterType == that.filterType &&
                Double.compare(that.motorSpeedRegulation, motorSpeedRegulation) == 0 &&
                Double.compare(that.cleaningWidth, cleaningWidth) == 0 &&
                Objects.equals(bagType, that.bagType) &&
                Objects.equals(wandType, that.wandType);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumption=" + getPowerConsumption() +
                ", filterType=" + getFilterType() +
                ", bagType='" + getBagType() + '\'' +
                ", wandType='" + getWandType() + '\'' +
                ", motorSpeedRegulation=" + getMotorSpeedRegulation() +
                ", cleaningWidth=" + getCleaningWidth() +
                '}';
    }
}
