package Numbers;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the base number: ");
            int base = scanner.nextInt();
            System.out.print("Enter the exponent: ");
            int exponent = scanner.nextInt();

            long result = calculatePower(base, exponent);
            System.out.println(base + " raised to the power of " + exponent + " = " + result);
        }

        public static long calculatePower(int base, int exponent) {
            long result = 1;
            while (exponent > 0) {
                if ((exponent & 1) == 1) {
                    result *= base;
                }
                base *= base;
                exponent >>= 1;
            }
            return result;
        }
    }


