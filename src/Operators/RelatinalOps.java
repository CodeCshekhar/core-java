package Operators;

public class RelatinalOps {

        public static void main(String[] args) {
            // Relational Operators
            int a = 5;
            int b = 10;
            int c = 10;

            // Example 1: Greater than (>)
            boolean greaterThan1 = a > b;
            boolean greaterThan2 = b > a;
            boolean greaterThan3 = b > c;
            System.out.println("Is " + a + " greater than " + b + "? " + greaterThan1);
            System.out.println("Is " + b + " greater than " + a + "? " + greaterThan2);
            System.out.println("Is " + b + " greater than " + c + "? " + greaterThan3);

            // Example 2: Less than (<)
            boolean lessThan1 = a < b;
            boolean lessThan2 = b < a;
            boolean lessThan3 = b < c;
            System.out.println("Is " + a + " less than " + b + "? " + lessThan1);
            System.out.println("Is " + b + " less than " + a + "? " + lessThan2);
            System.out.println("Is " + b + " less than " + c + "? " + lessThan3);

            // Example 3: Greater than or equal to (>=)
            boolean greaterThanOrEqual1 = a >= b;
            boolean greaterThanOrEqual2 = b >= a;
            boolean greaterThanOrEqual3 = b >= c;
            System.out.println("Is " + a + " greater than or equal to " + b + "? " + greaterThanOrEqual1);
            System.out.println("Is " + b + " greater than or equal to " + a + "? " + greaterThanOrEqual2);
            System.out.println("Is " + b + " greater than or equal to " + c + "? " + greaterThanOrEqual3);

            // Example 4: Less than or equal to (<=)
            boolean lessThanOrEqual1 = a <= b;
            boolean lessThanOrEqual2 = b <= a;
            boolean lessThanOrEqual3 = b <= c;
            System.out.println("Is " + a + " less than or equal to " + b + "? " + lessThanOrEqual1);
            System.out.println("Is " + b + " less than or equal to " + a + "? " + lessThanOrEqual2);
            System.out.println("Is " + b + " less than or equal to " + c + "? " + lessThanOrEqual3);

            // Example 5: Equal to (==)
            boolean equalTo1 = a == b;
            boolean equalTo2 = b == c;
            boolean equalTo3 = c == a;
            System.out.println("Is " + a + " equal to " + b + "? " + equalTo1);
            System.out.println("Is " + b + " equal to " + c + "? " + equalTo2);
            System.out.println("Is " + c + " equal to " + a + "? " + equalTo3);

            // Example 6: Not equal to (!=)
            boolean notEqualTo1 = a != b;
            boolean notEqualTo2 = b != c;
            boolean notEqualTo3 = c != a;
            System.out.println("Is " + a + " not equal to " + b + "? " + notEqualTo1);
            System.out.println("Is " + b + " not equal to " + c + "? " + notEqualTo2);
            System.out.println("Is " + c + " not equal to " + a + "? " + notEqualTo3);
        }
    }


