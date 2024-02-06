package fruits;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        System.out.println("Apple box weight: " + appleBox.getWeight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        System.out.println("Orange box weight: " + orangeBox.getWeight());

        System.out.println("Are the boxes equal in weight? " + appleBox.compare(orangeBox));

        Box<Apple> anotherAppleBox = new Box<>();
        appleBox.transferFruits(anotherAppleBox);
        System.out.println("Apple box weight after transfer: " + appleBox.getWeight());
        System.out.println("Another apple box weight after transfer: " + anotherAppleBox.getWeight());
    }
}