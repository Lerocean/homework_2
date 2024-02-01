package ru.fedynko;
public abstract class Animal {
    protected final String name;
    protected String breed;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
