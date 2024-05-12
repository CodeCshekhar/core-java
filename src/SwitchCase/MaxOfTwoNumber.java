package SwitchCase;

import java.util.Scanner;

public class MaxOfTwoNumber {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int n1 = input.nextInt();
            System.out.print("Enter the second number: ");
            int n2 = input.nextInt();

            int res = n1 > n2 ? 1 : 0;

            switch (res) {
                case 0:
                    res = n1 == n2 ? 1 : 0;
                    switch (res) {
                        case 0:
                            System.out.println("Maximum Number is " + n2);
                            break;
                        case 1:
                            System.out.println("Both are Equals");
                            break;
                    }
                    break;
                case 1:
                    System.out.println("Maximum Number is " + n1);
                    break;
            }
        }
    }


