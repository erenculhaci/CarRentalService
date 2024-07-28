package Car;

public class Sedan extends Car {
    private static final double DISCOUNT_RATE = 0.07;
    private int numberOfDoors;
    private boolean sunroof;

    public Sedan(String brand, String model, String segment, String transmissionType, int trunkCapacity, String color, int age, String fuelType, double dailyRentalPrice, int numberOfDoors, boolean sunroof) {
        super(brand, model, segment, transmissionType, trunkCapacity, color, age, fuelType, dailyRentalPrice);
        this.numberOfDoors = numberOfDoors;
        this.sunroof = sunroof;
    }

    @Override
    public double getMonthlyRentalPrice() {
        return getDailyRentalPrice() * 30 * (1 - DISCOUNT_RATE);
    }

    public boolean hasSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
