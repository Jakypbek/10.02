package tech.kinds.things;

import tech.kinds.Appliances;

import java.time.LocalDate;

public class WashingMachine extends Appliances {

    private int maxRevPerMin;
    private boolean loud;

    public WashingMachine() {
    }

    public WashingMachine(int dimensions, int price, double weight, LocalDate dateOfIssue, boolean newTech, int maxRevPerMin, boolean loud) {
        super(dimensions, price, weight, dateOfIssue, newTech);
        this.maxRevPerMin = maxRevPerMin;
        this.loud = loud;
    }

    public int getMaxRevPerMin() {
        return maxRevPerMin;
    }

    public void setMaxRevPerMin(int maxRevPerMin) {
        this.maxRevPerMin = maxRevPerMin;
    }

    public boolean isLoud() {
        return loud;
    }

    public void setLoud(boolean loud) {
        this.loud = loud;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "maxRevPerMin=" + maxRevPerMin +
                ", loud=" + loud +
                "} " + super.toString();
    }
}
