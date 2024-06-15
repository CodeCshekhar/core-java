package loops;

import java.util.Scanner;

public class ForLoopInArray {
    public static void main(String[] args) {
            int numberOfInputs = 5;
            String[] inputs = new String[numberOfInputs];
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < numberOfInputs; i++) {
                System.out.print("Enter string " + (i + 1) + ": ");
                inputs[i] = scanner.nextLine();
            }

            System.out.println("You entered the following strings:");
            for (String input : inputs) {
                System.out.println(input);
            }

            scanner.close();
        }
    }


