package ru.fedynko;

import java.util.Objects;

public class TunedDog extends Animal {

    private final int dogRegistrationNumber;

    public TunedDog(String name, int dogRegistrationNumber) {
        super(name);
        this.dogRegistrationNumber = dogRegistrationNumber;
    }

    // Какие минусы у такого подхода?
    public boolean equals_1(Object obj) {
        TunedDog dog = (TunedDog) obj;
        return dogRegistrationNumber == dog.dogRegistrationNumber;
    }

    // Добавим проверку на class. Что еще мы не учли?
    public boolean equals_2(Object obj) {
        if (getClass() != obj.getClass()) {
            return false;
        }
        TunedDog dog = (TunedDog) obj;
        return dogRegistrationNumber == dog.dogRegistrationNumber;
    }

    // Добавим проверку на тот же объект и null
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TunedDog dog = (TunedDog) obj;
        return dogRegistrationNumber == dog.dogRegistrationNumber;
    }
    /*
    // сравнение по имени
    public boolean equals_3(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    TunedDog dog = (TunedDog) obj;
    return dogRegistrationNumber == dog.dogRegistrationNumber && Objects.equals(name, dog.name);
}
     */
    public void bark() {
        System.out.println(this.name + " makes bark!" );
    }
}
