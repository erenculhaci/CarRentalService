public class Hatchback extends Car {
    private double coefficient;
    private boolean rearSpoiler;

    public Hatchback(String brand, String model, String segment, String transmissionType, int trunkCapacity, String color, int age, String fuelType, double dailyRentalPrice, boolean rearSpoiler) {
        super(brand, model, segment, transmissionType, trunkCapacity, color, age, fuelType, dailyRentalPrice);
        this.rearSpoiler = rearSpoiler;
    }

    @Override
    public double getMonthlyRentalPrice() {
        switch (getSegment()) {
            case "A":
                coefficient = 0.9;
                break;
            case "B":
                coefficient = 0.85;
                break;
            case "C":
                coefficient = 0.8;
                break;
            case "D":
                coefficient = 0.75;
                break;
            default:
                coefficient = 1;
        }
        return getDailyRentalPrice() * 30 * coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public boolean hasRearSpoiler() {
        return rearSpoiler;
    }

    public void setRearSpoiler(boolean rearSpoiler) {
        this.rearSpoiler = rearSpoiler;
    }
}

