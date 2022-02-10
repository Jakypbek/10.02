package tech;

public class Tech {

    private int dimensions;
    private int price;
    private double weight;

    public Tech() {
    }

    public Tech(int dimensions, int price, double weight) {
        this.dimensions = dimensions;
        this.price = price;
        this.weight = weight;
    }

    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Tech{" +
                "dimensions=" + dimensions +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
