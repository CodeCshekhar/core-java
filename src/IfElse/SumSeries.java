package IfElse;

import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a positive integer (n): ");
            int n = scanner.nextInt();

            double sum = 0.0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    // Subtract the term if i is even
                    sum -= 1.0 / i;
                } else {
                    // Add the term if i is odd
                    sum += 1.0 / i;
                }
            }

            System.out.println("Sum of the series: " + sum);
        }
    }


