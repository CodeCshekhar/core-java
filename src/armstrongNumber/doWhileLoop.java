package armstrongNumber;

public class doWhileLoop {
    public static void main(String[] args) {
        int number = 153; // Example number
        int originalNumber = number;
        int result = 0;

        do {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, 3); // Cubing each digit
            originalNumber /= 10;
        } while (originalNumber != 0);

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }

}
