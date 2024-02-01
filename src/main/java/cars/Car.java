package cars;

import java.util.Objects;

public class Car extends Vehicle {

    public Car(String mark, String model, int year) {
        super(mark, model, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return year == car.year &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, model, year);
    }

    @Override
    public String toString() {
        return "Car {" +
                "mark = " + mark + ", model = " + model +
                ", year = " + year +
                "}";
    }
}