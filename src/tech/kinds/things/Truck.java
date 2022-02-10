package tech.kinds.things;

import tech.kinds.Vehicles;

public class Truck extends Vehicles {

    private String brand;
    private boolean hasATrailer;

    public Truck() {
    }

    public Truck(int dimensions, int price, double weight, double engineSize, int mileage, int speed, String brand, boolean hasATrailer) {
        super(dimensions, price, weight, engineSize, mileage, speed);
        this.brand = brand;
        this.hasATrailer = hasATrailer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isHasATrailer() {
        return hasATrailer;
    }

    public void setHasATrailer(boolean hasATrailer) {
        this.hasATrailer = hasATrailer;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + brand + '\'' +
                ", hasATrailer=" + hasATrailer +
                "} " + super.toString();
    }
}
