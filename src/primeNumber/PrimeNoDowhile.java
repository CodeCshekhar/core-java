package primeNumber;

import java.util.Scanner;

public class PrimeNoDowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int i = 2;
        boolean isPrime = true;
        do {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        } while (i <= num / 2);

        if (isPrime && num > 1) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
