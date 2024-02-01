package cars;

public abstract class Vehicle {
    protected final String mark;
    protected final String model;
    protected final int year;

    public Vehicle(String mark, String model, int year) {
        this.mark = mark;
        this.model = model;
        this.year = year;
    }
    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;

    }

    public int getYear() {
        return year;
    }
}
