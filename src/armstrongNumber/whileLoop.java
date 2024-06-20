package armstrongNumber;

public class whileLoop {
    public static void main(String[] args) {
        int number = 153; // Example number
        int originalNumber = number;
        int result = 0;

        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, 3); // Cubing each digit
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }}
