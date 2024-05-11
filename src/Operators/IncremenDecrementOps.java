package Operators;

public class IncremenDecrementOps {

        public static void main(String[] args) {
            // Increment Operator (++)
            int x = 5;
            System.out.println("Original value of x: " + x);

            // Example 1: postIncrement
            int postIncrement = x++;
            System.out.println("Post-incremented value of x: " + x);
            System.out.println("Value returned by post-increment: " + postIncrement);

            // Example 2: Pre-increment
            int y = 10;
            int preIncrement = ++y;
            System.out.println("Pre-incremented value of y: " + y);
            System.out.println("Value returned by pre-increment: " + preIncrement);

            // Decrement Operator (--)
            int a = 8;
            System.out.println("\nOriginal value of a: " + a);

            // Example 1: Post-decrement
            int postDecrement = a--;
            System.out.println("Post-decremented value of a: " + a);
            System.out.println("Value returned by post-decrement: " + postDecrement);

            // Example 2: Pre-decrement
            int b = 15;
            int preDecrement = --b;
            System.out.println("Pre-decremented value of b: " + b);
            System.out.println("Value returned by pre-decrement: " + preDecrement);
        }


}
