package armstrongNumber;

import java.util.Scanner;

public class ArmstrongNoDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int originalNum, remainder, result = 0, n = 0;
        originalNum = num;

        do {
            originalNum /= 10;
            ++n;
        } while (originalNum != 0);

        originalNum = num;

        do {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        } while (originalNum != 0);

        if (result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
