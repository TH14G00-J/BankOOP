package entities;

public class Account {

    private final String holder;
    private final int number;
    private double balance;

    public Account(String holder, int number, double balance) {
        this.holder = holder;
        this.number = number;
        deposit(balance);
    }

    public Account(String holder, int number) {
        this.holder = holder;
        this.number = number;
    }

    public void deposit(double value) {
        if (value > 0) {
            this.balance += value;
        }else {
            System.out.println("Operation failed, negative deposits are not allowed.");
        }
    }

    public void withdraw(double value) {
        if (balance >= value + 5) {
            this.balance -= value + 5;
        }else {
            System.out.println("Operation failed! Balance not available for withdrawal.");
        }
    }

    @Override
    public String toString() {
        return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
    }
}
