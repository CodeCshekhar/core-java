package breakContinue;

public class ComplexExample {
    public static void main(String[] args) {
        // Example 1: Break in nested loops with a condition
        outerLoop:
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue outerLoop; // Not a prime number, continue to next i
                }
            }
            System.out.println(i + " is prime");
            if (i > 50) break; // Stop after finding primes up to 50
        }

        // Example 2: Continue with switch in a loop
        for (int i = 0; i < 10; i++) {
            switch (i) {
                case 0:
                case 4:
                case 8:
                    continue;
                case 6:
                    break;
                default:
                    System.out.println("Processing " + i);
            }
            System.out.println("Finished processing " + i);
        }

        // Example 3: Break and continue in a method
        processNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }

    private static void processNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                continue; // Skip even numbers
            }
            sum += num;
            if (sum > 15) {
                System.out.println("Sum exceeded 15. Stopping.");
                break;
            }
            System.out.println("Current sum: " + sum);
        }
    }
}
