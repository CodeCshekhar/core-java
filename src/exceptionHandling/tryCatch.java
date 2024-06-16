package exceptionHandling;

public class tryCatch {
    public static void main(String[] args) {
            try {
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[10]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index is out of bounds!");
            }
            finally {
                System.out.println("The 'try catch' is finished.");
            }
        }
    }


