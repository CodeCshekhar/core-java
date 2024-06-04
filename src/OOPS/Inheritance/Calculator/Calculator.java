package OOPS.Inheritance.Calculator;

import java.util.Scanner;

class Calculator {
    Scanner scanner = new Scanner(System.in);

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error! Dividing by zero is not allowed.");
            return 0;
        }
    }
}


class AdvancedCalculator extends Calculator {

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }
}


