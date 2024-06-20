package armstrongNumber;

public class forLoop {
    public static void main(String[] args) {
        int number = 153; // Example number
        int originalNumber = number;
        int result = 0;
        int n = 0;

        // Count the number of digits
        for (; originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        // Calculate the result
        for (; originalNumber != 0; originalNumber /= 10) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }}
