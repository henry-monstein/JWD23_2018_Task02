package by.epam.training.dmitrylishko.task02.entity;

import java.util.Objects;

public class Speakers extends Appliance {
    private double powerConsumption;
    private int numberOfSpeakers;
    private double lowFrequencyRange ;
    private double topFrequencyRange;
    private double cordLength;

    public Speakers() {
    }

    public Speakers(double powerConsumption, int numberOfSpeakers, double lowFrequencyRange, double topFrequencyRange, double cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.lowFrequencyRange = lowFrequencyRange;
        this.topFrequencyRange = topFrequencyRange;
        this.cordLength = cordLength;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public double getLowFrequencyRange() {
        return lowFrequencyRange;
    }

    public void setLowFrequencyRange(double lowFrequencyRange) {
        this.lowFrequencyRange = lowFrequencyRange;
    }

    public double getTopFrequencyRange() {
        return topFrequencyRange;
    }

    public void setTopFrequencyRange(double topFrequencyRange) {
        this.topFrequencyRange = topFrequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(hashCode()!=o.hashCode()) return false;
        if (!(o instanceof Speakers)) return false;
        Speakers speakers = (Speakers) o;
        return Double.compare(speakers.powerConsumption, powerConsumption) == 0 &&
                numberOfSpeakers == speakers.numberOfSpeakers &&
                Double.compare(speakers.lowFrequencyRange, lowFrequencyRange) == 0 &&
                Double.compare(speakers.topFrequencyRange, topFrequencyRange) == 0 &&
                Double.compare(speakers.cordLength, cordLength) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), powerConsumption, numberOfSpeakers, lowFrequencyRange, topFrequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", lowFrequencyRange=" + lowFrequencyRange +
                ", topFrequencyRange=" + topFrequencyRange +
                ", cordLength=" + cordLength +
                '}';
    }
}