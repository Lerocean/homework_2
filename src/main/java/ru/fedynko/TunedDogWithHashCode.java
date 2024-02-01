package ru.fedynko;

import java.util.Objects;

public class TunedDogWithHashCode extends Animal {
    private final int dogRegistrationNumber;

    public TunedDogWithHashCode(String name, int dogRegistrationNumber) {
        super(name);
        this.dogRegistrationNumber = dogRegistrationNumber;
    }

    /*

    @Override
    public int hashCode() {
        return Objects.hash(dogRegistrationNumber);
    }


    @Override
    public int hashCode() {
        return Objects.hash(dogRegistrationNumber, name);
    }

     */

    @Override
    public int hashCode() {
    return Objects.hash(dogRegistrationNumber, name, breed);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TunedDogWithHashCode dog = (TunedDogWithHashCode) obj;
        return dogRegistrationNumber == dog.dogRegistrationNumber;
    }

    public void bark() {
        System.out.println(this.name + " makes bark!" );
    }
}
