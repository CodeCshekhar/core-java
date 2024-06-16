package exceptionHandling;

// Define a custom exception by extending the Exception class
class CustomException extends Exception {
    // Constructor that accepts a message
    public CustomException(String message) {
        super(message);
    }
}

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money, which may throw the custom exception
    public void withdraw(double amount) throws CustomException {
        if (amount > balance) {
            throw new CustomException("Insufficient funds for withdrawal");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    // Main method to test the custom exception
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);

        try {
            account.withdraw(1500.00); // This will throw the CustomException
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
