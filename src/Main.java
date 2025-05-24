package src;

public class Main {
    public static void main(String[] args) {
        //Завдання №1
        System.out.println("\n--- Інкапсуляція — Завдання 1 ---");
        Book myBook = new Book("Тіні забутих предків", "Михайло Коцюбинський", 1911);
        myBook.displayInfo();System.out.println("\n--- Інкапсуляція — Завдання 2 ---");

        System.out.println("\nОновлюємо назву...");
        myBook.setTitle("Тіні забутих предків (оновлено)");
         myBook.displayInfo();
        // Завдання №2

        Account myAccount = new Account("UA123456789", 1000.0);
        myAccount.checkBalance();
        myAccount.deposit(500);
        myAccount.withdraw(300);
        myAccount.withdraw(1500);
        myAccount.checkBalance();
        //Завдання №3
        System.out.println("\n--- Наслідування — Завдання 1 ---");
        Motorcycle myMotorcycle = new Motorcycle("Yamaha", "MT-07", 689);
        myMotorcycle.displayInfo();
        //Завдання №4
        System.out.println("\n--- Наслідування — Завдання 2 ---");
        Manager teamManager = new Manager("Олена Іваненко", "Менеджер проектів", 5);
        teamManager.displayInfo();
        //Завдання №5
        System.out.println("\n--- Поліморфізм — Завдання 1 ---");

        Shape shape1 = new Triangle(5, 10);
        System.out.println("Площа трикутника: " + shape1.calculateArea());

        Shape shape2 = new Square(4);
        System.out.println("Площа квадрата: " + shape2.calculateArea());
        //Завдання №6
        System.out.println("\n--- Поліморфізм — Завдання 2 ---");

        Notification notif1 = new EmailNotification();
        notif1.send();

        Notification notif2 = new SMSNotification();
        notif2.send();
        //Завдання №7
        System.out.println("\n--- Абстрактні класи — Завдання 1 ---");

        Appliance washingMachine = new WashingMachine();
        washingMachine.turnOn();

        Appliance microwave = new Microwave();
        microwave.turnOn();
        //Завдання №8
        System.out.println("\n--- Інтерфейси — Завдання 2 ---");

        Playable guitar = new Guitar();
        guitar.play();

        Playable piano = new Piano();
        piano.play();

    }
}
