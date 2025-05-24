package src;
public class Vehicle {
    protected String make;
    protected String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Марка: " + make);
        System.out.println("Модель: " + model);
    }
}
