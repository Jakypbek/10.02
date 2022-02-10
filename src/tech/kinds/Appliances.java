package tech.kinds;

import tech.Tech;

import java.time.LocalDate;

public class Appliances extends Tech {

    private LocalDate dateOfIssue;
    private boolean newTech;

    public Appliances() {
    }

    public Appliances(int dimensions, int price, double weight, LocalDate dateOfIssue, boolean newTech) {
        super(dimensions, price, weight);
        this.dateOfIssue = dateOfIssue;
        this.newTech = newTech;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public boolean isNewTech() {
        return newTech;
    }

    public void setNewTech(boolean newTech) {
        this.newTech = newTech;
    }

    @Override
    public String toString() {
        return "Appliances{" +
                "dateOfIssue=" + dateOfIssue +
                ", newTech=" + newTech +
                "} " + super.toString();
    }
}
