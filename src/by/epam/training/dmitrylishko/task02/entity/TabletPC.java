package by.epam.training.dmitrylishko.task02.entity;

import java.util.Objects;

public class TabletPC extends Appliance {
    private double batteryCapacity;
    private double displayInchs;
    private double memoryRom;
    private double flashMemoryCapacity;
    private String color;

    public TabletPC() {
    }

    public TabletPC(double batteryCapacity, double displayInchs, double memoryRom, double flashMemoryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInchs = displayInchs;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(double displayInchs) {
        this.displayInchs = displayInchs;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (hashCode() != o.hashCode()) return false;
        if (!(o instanceof TabletPC)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.batteryCapacity, batteryCapacity) == 0 &&
                Double.compare(tabletPC.displayInchs, displayInchs) == 0 &&
                Double.compare(tabletPC.memoryRom, memoryRom) == 0 &&
                Double.compare(tabletPC.flashMemoryCapacity, flashMemoryCapacity) == 0 &&
                Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), batteryCapacity, displayInchs, memoryRom, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + getBatteryCapacity()+
                ", displayInchs=" + getDisplayInchs() +
                ", memoryRom=" + getMemoryRom() +
                ", flashMemoryCapacity=" + getFlashMemoryCapacity()+
                ", color='" + getColor() + '\'' +
                '}';
    }
}
