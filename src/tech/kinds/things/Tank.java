package tech.kinds.things;

import tech.kinds.MilitaryEqupment;

public class Tank extends MilitaryEqupment {

    private byte crewMembers;
    private int amountOfAmmunition;

    public Tank() {
    }

    public Tank(int dimensions, int price, double weight, int damage, byte degreeOfDanger, byte crewMembers, int amountOfAmmunition) {
        super(dimensions, price, weight, damage, degreeOfDanger);
        this.crewMembers = crewMembers;
        this.amountOfAmmunition = amountOfAmmunition;
    }

    public byte getCrewMembers() {
        return crewMembers;
    }

    public void setCrewMembers(byte crewMembers) {
        this.crewMembers = crewMembers;
    }

    public int getAmountOfAmmunition() {
        return amountOfAmmunition;
    }

    public void setAmountOfAmmunition(int amountOfAmmunition) {
        this.amountOfAmmunition = amountOfAmmunition;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "crewMembers=" + crewMembers +
                ", amountOfAmmunition=" + amountOfAmmunition +
                "} " + super.toString();
    }
}
