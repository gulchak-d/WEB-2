package src;

public class Motorcycle extends Vehicle {
    private int engineCapacity;

    public Motorcycle(String make, String model, int engineCapacity) {
        super(make, model); // викликаємо конструктор Vehicle
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // викликаємо displayInfo() з Vehicle
        System.out.println("Об'єм двигуна: " + engineCapacity + " см³");
    }
}
