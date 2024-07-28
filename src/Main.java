import Car.*;
import Customer.*;

public class Main {
    public static void main(String[] args) {
        CarRentalService rentalService = new CarRentalService();

        Car sedan = new Sedan("Toyota", "Camry", "C", "Automatic", 450, "White", 2, "Gasoline", 800, 4, true);
        Car hatchback = new Hatchback("Ford", "Focus", "B", "Manual", 350, "Red", 1, "Diesel", 600, true);
        Car suv = new SUV("Jeep", "Grand Cherokee", "D", "Automatic", 500, "Black", 3, "Gasoline", 1000, true, 3500, 29, true);

        rentalService.addCar(sedan);
        rentalService.addCar(hatchback);
        rentalService.addCar(suv);

        Customer individualCustomer = new IndividualCustomer("Eren Culhacı", "0532 123 45 67", "12345678901");
        Customer corporateCustomer = new CorporateCustomer("Koç Holding", "0212 123 45 67", "9876543210");

        System.out.println("Available cars for individual customer:");
        for (Car car : rentalService.getAvailableCars(individualCustomer)) {
            System.out.println(car.getBrand() + " " + car.getModel());
        }

        System.out.println("\nAvailable cars for corporate customer:");
        for (Car car : rentalService.getAvailableCars(corporateCustomer)) {
            System.out.println(car.getBrand() + " " + car.getModel());
        }

        System.out.println("\n10-day rental cost for hatchback car for individual customer: " + individualCustomer.getName());
        System.out.println(rentalService.rentCar(individualCustomer, hatchback, 10) + " ₺");

        System.out.println("\n5-day rental cost for SUV car for corporate customer: " + corporateCustomer.getName());
        System.out.println(rentalService.rentCar(corporateCustomer, suv, 5) + " ₺");

        System.out.println("\nMonthly rental cost for sedan car for individual customer: " + individualCustomer.getName());
        System.out.println(rentalService.rentCar(individualCustomer, sedan, 30) + " ₺");

        System.out.println("\nMonthly rental cost for hatchback car for individual customer: " + individualCustomer.getName());
        System.out.println(rentalService.rentCar(individualCustomer, hatchback, 30) + " ₺");

        System.out.println("\nMonthly rental cost for sedan car for corporate customer: " + corporateCustomer.getName());
        System.out.println(rentalService.rentCar(corporateCustomer, sedan, 30) + " ₺");

        System.out.println("\nMonthly rental cost for SUV car for corporate customer: " + corporateCustomer.getName());
        System.out.println(rentalService.rentCar(corporateCustomer, suv, 30) + " ₺");
    }
}
