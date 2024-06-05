import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota Corolla", 2015));
        cars.add(new Car("Ford Focus", 2012));
        cars.add(new Car("Honda Civic", 2018));
        cars.add(new Car("Chevrolet Malibu", 2016));
        cars.add(new Car("BMW 3 Series", 2014));
        cars.add(new Car("Audi A4", 2017));
        cars.add(new Car("Mazda 3", 2013));
        cars.add(new Car("Volkswagen Golf", 2011));
        cars.add(new Car("Hyundai Elantra", 2019));
        cars.add(new Car("Kia Optima", 2020));

        List<T> Cars;
        Collections.sort(Cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
