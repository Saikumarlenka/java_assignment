package oops_2;

// Custom exception class
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(double balance, double withdrawalAmount) {
        super("Insufficient Balance " + balance + " for withdrawal of " + withdrawalAmount);
    }
}

// Bank account class
class BankAccount {
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money, throws custom exception
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}

public class Thirtyone {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);  // Initial balance of 1000

        try {
            // Perform deposit and withdrawal operations
            account.deposit(500);  // Deposit 500
            account.withdraw(2000);  // Attempt to withdraw 2000, which will trigger exception
        } catch (InsufficientBalanceException e) {
            // Catch and display custom exception message
            System.out.println(e.getMessage());
        }

        // Display final balance
        System.out.println("Final balance: " + account.getBalance());
    }
}
