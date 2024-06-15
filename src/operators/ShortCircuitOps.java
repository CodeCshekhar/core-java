package operators;

public class ShortCircuitOps {

        public static void main(String[] args) {
            // Short-circuit AND (&&) Operator
            int x = 5;
            int y = 10;

            // Example 1: Short-circuit AND
            if (x > 0 && y > 0) {
                System.out.println("Example 1: Both x and y are positive.");
            } else {
                System.out.println("Example 1: Either x or y (or both) are not positive.");
            }

            // Example 2: Short-circuit AND
            if (x > 0 && y < 0) {
                System.out.println("Example 2: Both x and y are positive.");
            } else {
                System.out.println("Example 2: Either x or y (or both) are not positive.");
            }

            // Example 3: Short-circuit AND
            if (x < 0 && y > 0) {
                System.out.println("Example 3: Both x and y are positive.");
            } else {
                System.out.println("Example 3: Either x or y (or both) are not positive.");
            }

            // Short-circuit OR (||) Operator
            boolean condition1 = true;
            boolean condition2 = false;

            // Example 1: Short-circuit OR
            if (condition1 || condition2) {
                System.out.println("Example 1: At least one of the conditions is true.");
            } else {
                System.out.println("Example 1: Neither of the conditions is true.");
            }

            // Example 2: Short-circuit OR
            if (!condition1 || condition2) {
                System.out.println("Example 2: At least one of the conditions is true.");
            } else {
                System.out.println("Example 2: Neither of the conditions is true.");
            }

            // Example 3: Short-circuit OR
            if (!condition1 || !condition2) {
                System.out.println("Example 3: At least one of the conditions is true.");
            } else {
                System.out.println("Example 3: Neither of the conditions is true.");
            }
        }
    }


