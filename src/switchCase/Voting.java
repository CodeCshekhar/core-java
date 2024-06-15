package switchCase;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your age: ");
            int age = scanner.nextInt();

            switch (age) {
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                    System.out.println("You are eligible for voting.");
                    break;
                default:
                    System.out.println("Sorry, you are not eligible to vote.");
                    break;
            }
        }
    }


