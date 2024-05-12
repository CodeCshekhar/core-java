package SwitchCase;

import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char operation;
            int firstNumber, secondNumber, result;

            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.print("Enter the operation number (1-4): ");
            int choice = scanner.nextInt();

            System.out.print("Enter the first number: ");
            firstNumber = scanner.nextInt();
            System.out.print("Enter the second number: ");
            secondNumber = scanner.nextInt();

            switch (choice) {
                case 1:
                    result = firstNumber + secondNumber;
                    System.out.println("Result of addition: " + result);
                    break;
                case 2:
                    result = firstNumber - secondNumber;
                    System.out.println("Result of subtraction: " + result);
                    break;
                case 3:
                    result = firstNumber * secondNumber;
                    System.out.println("Result of multiplication: " + result);
                    break;
                case 4:
                    if (secondNumber != 0) {
                        result = firstNumber / secondNumber;
                        System.out.println("Result of division: " + result);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid operation number. Please choose 1-4.");
            }
        }
    }


