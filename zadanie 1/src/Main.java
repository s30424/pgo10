import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Porsche", 2015));
        cars.add(new Car("Ford ", 2012));
        cars.add(new Car("Honda", 2018));
        cars.add(new Car("Corvette", 2016));
        cars.add(new Car("Mercedes", 2014));
        cars.add(new Car("Lamborghini", 2017));
        cars.add(new Car("Bugatti", 2013));
        cars.add(new Car("Volkswagen Passat", 2011));
        cars.add(new Car("Mustang", 2019));
        cars.add(new Car("Fs", 2020));
        Collections.sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }
        }
    }

