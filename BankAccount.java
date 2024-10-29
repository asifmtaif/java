package task1;

public class BankAccount {
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1234, 50000);
        BankAccount acc2 = new BankAccount(1235, 5000);

        acc1.displayAccount();
        acc1.deposit(5000);
        acc1.withdraw(1000);

        acc2.displayAccount();
        acc2.deposit(300);
        acc2.withdraw(700);
    }
}
