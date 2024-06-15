package numbers;

import java.util.Scanner;

public class CountPositiveNegative {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int countPositive = 0;
            int countNegative = 0;
            int countZero = 0;

            char repeat;

            do {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();

                if (number > 0) {
                    countPositive++;
                } else if (number < 0) {
                    countNegative++;
                } else {
                    countZero++;
                }

                System.out.print("Do you want to enter another number? (y/n): ");
                repeat = scanner.next().charAt(0);
            } while (repeat == 'y' || repeat == 'Y');

            System.out.println("\nCount of positive numbers: " + countPositive);
            System.out.println("Count of negative numbers: " + countNegative);
            System.out.println("Count of zeros: " + countZero);
        }
    }


