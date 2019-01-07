package by.epam.training.dmitrylishko.task02.entity;

import java.util.Objects;

public class Laptop extends Appliance {
    private double batteryCapacity;
    private String OS;
    private double memoryRom;
    private double systemMemory;
    private double CPU;
    private double displayInchs;

    public Laptop() {
    }

    public Laptop(double batteryCapacity, String OS, double memoryRom, double systemMemory, double CPU, double displayInchs) {
        this.batteryCapacity = batteryCapacity;
        this.OS = OS;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.CPU = CPU;
        this.displayInchs = displayInchs;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double mamoryRom) {
        this.memoryRom = mamoryRom;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCPU() {
        return CPU;
    }

    public void setCPU(double CPU) {
        this.CPU = CPU;
    }

    public double getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(double displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (hashCode() != o.hashCode()) return false;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0 &&
                Double.compare(laptop.memoryRom, memoryRom) == 0 &&
                Double.compare(laptop.systemMemory, systemMemory) == 0 &&
                Double.compare(laptop.CPU, CPU) == 0 &&
                Double.compare(laptop.displayInchs, displayInchs) == 0 &&
                Objects.equals(OS, laptop.OS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity, OS, memoryRom, systemMemory, CPU, displayInchs);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + getBatteryCapacity() +
                ", OS='" + getOS() + '\'' +
                ", memoryRom=" + getMemoryRom() +
                ", systemMemory=" + getSystemMemory() +
                ", CPU=" + getCPU() +
                ", displayInchs=" + getDisplayInchs() +
                '}';
    }
}
