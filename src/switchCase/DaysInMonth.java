package switchCase;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please Enter Month Number from 1 to 12 (1 = Jan, and 12 = Dec): ");
            int month = sc.nextInt();

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("\n31 Days in this Month");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("\n30 Days in this Month");
                    break;
                case 2:
                    System.out.println("\nEither 28 or 29 Days in this Month");
                    break;
                default:
                    System.out.println("\nPlease enter a valid number between 1 and 12");
            }
        }
    }


