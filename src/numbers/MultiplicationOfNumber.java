package numbers;
import java.util.Scanner;
public class MultiplicationOfNumber {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            int num = scanner.nextInt();

            System.out.println("Multiplication table of " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }
        }
    }


