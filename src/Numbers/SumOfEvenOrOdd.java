package Numbers;

import java.util.Scanner;

public class SumOfEvenOrOdd {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of integers: ");
            int n = scanner.nextInt();

            int evenSum = 0;
            int oddSum = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Enter an integer: ");
                int num = scanner.nextInt();

                if (num % 2 == 0) {
                    evenSum += num;
                } else {
                    oddSum += num;
                }
            }

            System.out.println("Sum of even integers: " + evenSum);
            System.out.println("Sum of odd integers: " + oddSum);
        }
    }


