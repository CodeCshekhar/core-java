package Operators;

public class ArithemeticOps {
    public static void main(String[]args){
        // Addition
        int a = 10;
        int b = 5;
        int resultAddition1 = a + b;
        int resultAddition2 = 15 + 7;
        System.out.println("Addition Example 1: " + resultAddition1);
        System.out.println("Addition Example 2: " + resultAddition2);

        // Subtraction
        int resultSubtraction1 = a - b;
        int resultSubtraction2 = 20 - 8;
        System.out.println("Subtraction Example 1: " + resultSubtraction1);
        System.out.println("Subtraction Example 2: " + resultSubtraction2);

        // Multiplication
        int resultMultiplication1 = a * b;
        int resultMultiplication2 = 7 * 3;
        System.out.println("Multiplication Example 1: " + resultMultiplication1);
        System.out.println("Multiplication Example 2: " + resultMultiplication2);

        // Division
        double resultDivision1 = (double) a / b;
        double resultDivision2 = 21.0 / 3;
        System.out.println("Division Example 1: " + resultDivision1);
        System.out.println("Division Example 2: " + resultDivision2);

        // Floor Division (integer division)
        int resultFloorDivision1 = a / b;
        int resultFloorDivision2 = 21 / 4;
        System.out.println("Floor Division Example 1: " + resultFloorDivision1);
        System.out.println("Floor Division Example 2: " + resultFloorDivision2);

        // Modulus
        int resultModulus1 = a % b;
        int resultModulus2 = 21 % 4;
        System.out.println("Modulus Example 1: " + resultModulus1);
        System.out.println("Modulus Example 2: " + resultModulus2);

        // Exponentiation
        double resultExponentiation1 = Math.pow(a, b);
        double resultExponentiation2 = Math.pow(2, 4);
        System.out.println("Exponentiation Example 1: " + resultExponentiation1);
        System.out.println("Exponentiation Example 2: " + resultExponentiation2);

    }
}
