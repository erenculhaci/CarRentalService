package Car;

public class SUV extends Car {
    private boolean fourWheelDrive;
    private int towingCapacity;
    private int groundClearance;
    private boolean offRoadCapability;

    public SUV(String brand, String model, String segment, String transmissionType, int trunkCapacity, String color, int age, String fuelType, double dailyRentalPrice, boolean fourWheelDrive, int towingCapacity, int groundClearance, boolean offRoadCapability) {
        super(brand, model, segment, transmissionType, trunkCapacity, color, age, fuelType, dailyRentalPrice);
    }

    @Override
    public double getMonthlyRentalPrice() {
        throw new UnsupportedOperationException("SUVs can only be rented daily.");
    }

    public boolean hasFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public int getGroundClearance() {
        return groundClearance;
    }

    public void setGroundClearance(int groundClearance) {
        this.groundClearance = groundClearance;
    }

    public boolean hasOffRoadCapability() {
        return offRoadCapability;
    }

    public void setOffRoadCapability(boolean offRoadCapability) {
        this.offRoadCapability = offRoadCapability;
    }
}
