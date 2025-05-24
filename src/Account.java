package src;

public class Account {
    private double balance;
    private String accountNumber;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Поповнено: " + amount + " грн");
        } else {
            System.out.println("Сума для поповнення повинна бути більшою за 0");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Знято: " + amount + " грн");
        } else {
            System.out.println("Недостатньо коштів або некоректна сума");
        }
    }

    public void checkBalance() {
        System.out.println("Баланс рахунку " + accountNumber + ": " + balance + " грн");
    }
}
