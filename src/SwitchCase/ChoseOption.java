package SwitchCase;

import java.util.Scanner;

public class ChoseOption {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You chose option 1.");
                    break;
                case 2:
                    System.out.println("You chose option 2.");
                    break;
                case 3:
                    System.out.println("You chose option 3.");
                    break;
                case 4:
                    System.out.println("You chose option 4.");
                    break;
                case 5:
                    System.out.println("You chose option 5.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }


