package oops.inheritance.Calculator;

public class TestCalculator {

    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();

        System.out.println("Enter two numbers: ");
        double num1 = calc.scanner.nextDouble();
        double num2 = calc.scanner.nextDouble();

        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));
        System.out.println("Division: " + calc.divide(num1, num2));
        System.out.println("Power: " + calc.power(num1, num2));
        System.out.println("Square root of the first number: " + calc.squareRoot(num1));
    }
}
