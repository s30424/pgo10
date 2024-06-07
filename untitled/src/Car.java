import java.util.Objects;

public class Car implements Comparable<Car> {

    private String modelName;
    private int productionYear;

    public Car(String modelName, int productionYear) {
        this.modelName = modelName;
        this.productionYear = productionYear;
    }

    @Override
    public int compareTo(Car otherCar) {
        return this.productionYear - otherCar.productionYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
