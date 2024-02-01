package ru.fedynko;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Шарик");

        Animal animal1 = new Dog("Шарик");
        dog1.setBreed("Такса");
        dog2.setBreed("Такса");
        animal1.setBreed("Такса");

        System.out.println(dog1.equals(dog2));

        TunedDog tunedDog_1 = new TunedDog("Шарик", 1);
        TunedDog tunedDog_2 = new TunedDog("Шарик", 2);

        System.out.println(tunedDog_1.equals(tunedDog_2)); // 1
        System.out.println(tunedDog_1.equals(tunedDog_1)); //2

        System.out.println(animal1.hashCode() == dog2.hashCode()); //3

        System.out.println(tunedDog_1.equals(dog1)); // 4
        System.out.println(tunedDog_1.equals(null)); // 5
    }
}
