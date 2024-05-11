package SwitchCase;

import java.util.Scanner;

public class GenderReadUsingSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char gender;

        System.out.print("Enter gender (M/m or F/f): ");
        gender = scanner.next().charAt(0);

        switch (gender) {
            case 'M':
            case 'm':
                System.out.println("Male.");
                break;
            case 'F':
            case 'f':
                System.out.println("Female.");
                break;
            default:
                System.out.println("Unspecified Gender.");
        }
    }
}
