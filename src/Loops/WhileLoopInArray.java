package Loops;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoopInArray {
    public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            int sentinel = -1;
            int userInput;

            System.out.println("Enter integers (enter -1 to stop):");
            while (true) {
                System.out.print("Enter an integer: ");
                userInput = scanner.nextInt();
                if (userInput == sentinel) {
                    break;
                }
                numbers.add(userInput);
            }

            System.out.println("You entered the following integers:");
            for (int number : numbers) {
                System.out.println(number);
            }

            scanner.close();
        }
    }


