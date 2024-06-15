package armstrongNumber;

import java.util.Scanner;

public class ArmstrongNoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int originalNum, remainder, result = 0, n = 0;
        originalNum = num;

        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }

        originalNum = num;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        if (result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }

}
