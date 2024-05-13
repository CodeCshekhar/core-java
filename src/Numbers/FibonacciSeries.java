package Numbers;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of terms: ");
            int n = scanner.nextInt();

            int firstTerm = 0;
            int secondTerm = 1;

            System.out.print("Fibonacci series up to " + n + " terms: " + firstTerm + " " + secondTerm);

            for (int i = 2; i < n; i++) {
                int nextTerm = firstTerm + secondTerm;
                System.out.print(" " + nextTerm);
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }


