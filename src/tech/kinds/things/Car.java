package tech.kinds.things;

        import tech.kinds.Vehicles;

        import java.time.LocalDate;

public class Car extends Vehicles {

    private String brand;
    private LocalDate dateOfBirth;

    public Car() {
    }

    public Car(int dimensions, int price, double weight, double engineSize, int mileage, int speed, String brand, LocalDate dateOfBirth) {
        super(dimensions, price, weight, engineSize, mileage, speed);
        this.brand = brand;
        this.dateOfBirth = dateOfBirth;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                "} " + super.toString();
    }
}
