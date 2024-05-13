package Numbers;

import java.util.Scanner;

public class LogarithmOfTwo {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            int n = scanner.nextInt();

            double ln2 = 0.0;
            for (int k = 1; k <= n; k++) {
                ln2 += Math.pow(-1, k - 1) / k;
            }

            System.out.println("Natural logarithm of 2 : " + ln2);
        }
    }


