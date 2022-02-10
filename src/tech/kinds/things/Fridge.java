package tech.kinds.things;

import tech.kinds.Appliances;

import java.time.LocalDate;

public class Fridge extends Appliances {

    private int capacityOfProducts;
    private double height;

    public Fridge() {
    }

    public Fridge(int dimensions, int price, double weight, LocalDate dateOfIssue, boolean newTech, int capacityOfProducts, double height) {
        super(dimensions, price, weight, dateOfIssue, newTech);
        this.capacityOfProducts = capacityOfProducts;
        this.height = height;
    }

    public int getCapacityOfProducts() {
        return capacityOfProducts;
    }

    public void setCapacityOfProducts(int capacityOfProducts) {
        this.capacityOfProducts = capacityOfProducts;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "capacityOfProducts=" + capacityOfProducts +
                ", height=" + height +
                "} " + super.toString();
    }
}
