package tech.kinds;

import tech.Tech;

public class MilitaryEqupment extends Tech {

    private int damage;
    private byte degreeOfDanger;

    public MilitaryEqupment() {
    }

    public MilitaryEqupment(int dimensions, int price, double weight, int damage, byte degreeOfDanger) {
        super(dimensions, price, weight);
        this.damage = damage;
        this.degreeOfDanger = degreeOfDanger;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public byte getDegreeOfDanger() {
        return degreeOfDanger;
    }

    public void setDegreeOfDanger(byte degreeOfDanger) {
        this.degreeOfDanger = degreeOfDanger;
    }

    @Override
    public String toString() {
        return "MilitaryEqupment{" +
                "damage=" + damage +
                ", degreeOfDanger=" + degreeOfDanger +
                "} " + super.toString();
    }
}
