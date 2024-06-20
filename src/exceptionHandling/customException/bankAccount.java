package exceptionHandling.customException;

// Define a custom exception by extending the Exception class
class customException extends Exception {

    public customException(String message) {

        super(message);
    }
}

public class bankAccount {
    private double balance;

    public bankAccount(double initialBalance) {

        this.balance = initialBalance;
    }


    public void withdraw(double amount) throws customException {
        if (amount > balance) {
            throw new customException("Insufficient funds for withdrawal");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }


    public static void main(String[] args) {
        bankAccount account = new bankAccount(1000.00);

        try {
            account.withdraw(1500.00); // This will throw the customException
        } catch (customException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
