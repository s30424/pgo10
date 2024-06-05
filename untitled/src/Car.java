import java.util.Objects;

public class Car implements Comparable<Car> {

    private String modelName;
    private int productionYear;

    public Car(String modelName, int productionYear) {
        this.modelName = modelName;
        this.productionYear = productionYear;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }


    public int compareTo(Car otherCar) {
        return this.productionYear - otherCar.productionYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return modelName.equals(car.modelName) && productionYear == car.productionYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, productionYear);
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
