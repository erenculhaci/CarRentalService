import java.util.ArrayList;
import java.util.List;

public class CarRentalService {
    private List<Car> cars;

    public CarRentalService() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getAvailableCars(Customer customer) {
        List<Car> availableCars = new ArrayList<>();
        for (Car car : cars) {
            if (customer.canRent(car)) {
                availableCars.add(car);
            }
        }
        return availableCars;
    }

    public double rentCar(Customer customer, Car car, int days) {
        if (!customer.canRent(car)) {
            throw new IllegalArgumentException("This customer cannot rent this car.");
        }

        if (car instanceof SUV && days >= 30) {
            throw new IllegalArgumentException("SUVs can only be rented daily.");
        }

        if (days > 30) {
            return car.getMonthlyRentalPrice();
        } else {
            return car.getDailyRentalPrice() * days;
        }
    }
}
