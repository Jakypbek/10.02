package tech.kinds.things;

import tech.kinds.MilitaryEqupment;

public class Gun extends MilitaryEqupment {

    private long serialNumber;
    private byte ammoCapacity;

    public Gun() {
    }

    public Gun(int dimensions, int price, double weight, int damage, byte degreeOfDanger, long serialNumber, byte ammoCapacity) {
        super(dimensions, price, weight, damage, degreeOfDanger);
        this.serialNumber = serialNumber;
        this.ammoCapacity = ammoCapacity;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public byte getAmmoCapacity() {
        return ammoCapacity;
    }

    public void setAmmoCapacity(byte ammoCapacity) {
        this.ammoCapacity = ammoCapacity;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "serialNumber=" + serialNumber +
                ", ammoCapacity=" + ammoCapacity +
                "} " + super.toString();
    }
}
