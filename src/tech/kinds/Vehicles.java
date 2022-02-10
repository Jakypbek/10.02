package tech.kinds;

import tech.Tech;

public class Vehicles extends Tech {

    private double engineSize;
    private int mileage;
    private int speed;

    public Vehicles() {
    }

    public Vehicles(int dimensions, int price, double weight, double engineSize, int mileage, int speed) {
        super(dimensions, price, weight);
        this.engineSize = engineSize;
        this.mileage = mileage;
        this.speed = speed;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "engineSize=" + engineSize +
                ", mileage=" + mileage +
                ", speed=" + speed +
                "} " + super.toString();
    }
}
