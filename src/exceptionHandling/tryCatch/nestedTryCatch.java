package exceptionHandling.tryCatch;

public class nestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0;
                    System.out.println("The result is: " + result);

            } catch (ArithmeticException e) {
                    System.out.println("Inner catch: ArithmeticException caught.");
            }
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Outer catch: ArrayIndexOutOfBoundsException caught.");
            }
        }
    }


