package src;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String position, int teamSize) {
        super(name, position); // викликаємо конструктор Employee
        this.teamSize = teamSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // виклик displayInfo() з Employee
        System.out.println("Розмір команди: " + teamSize + " осіб");
    }
}

