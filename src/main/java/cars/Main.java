package cars;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "Q8", 2024);
        Car car2 = new Car("Toyota", "Land Cruiser", 2020);
        Car car3 = new Car("Жигули", "ВАЗ-2101", 1977);

        System.out.println(car1.equals(car2));
        System.out.println(car2.equals(car3));
        System.out.println(car1.equals(car3));
        System.out.println(car1.hashCode() == car2.hashCode());
        System.out.println(car2.hashCode() == car3.hashCode());
        System.out.println(car1.hashCode() == car3.hashCode());
        System.out.println(car1.equals(null));
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
