package loops;

import java.util.Scanner;

public class WhileLoopWithInput {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int userInput;

            // Keep asking for input until a positive integer is entered
            while (true) {
                System.out.print("Enter a positive integer: ");
                userInput = scanner.nextInt();
                if (userInput > 0) {
                    break; // Exit the loop if valid input
                } else {
                    System.out.println("Invalid input! Please enter a positive integer.");
                }
            }

            System.out.println("You entered: " + userInput);
        }
    }


