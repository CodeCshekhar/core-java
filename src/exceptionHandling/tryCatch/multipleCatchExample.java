package exceptionHandling.tryCatch;

public class multipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
                System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught: Index out of range.");

        } catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

