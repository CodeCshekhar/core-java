package loops;

import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                int factorial = 1;
                int current = 1;

                while (current <= number) {
                    factorial *= current;
                    current++;
                }

                System.out.println("Factorial of " + number + " is " + factorial);
            }
        }
    }


