package numbers;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first positive integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second positive integer: ");
            int num2 = scanner.nextInt();

            int hcf = calculateHcf(num1, num2);

            System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        }

        public static int calculateHcf(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }



