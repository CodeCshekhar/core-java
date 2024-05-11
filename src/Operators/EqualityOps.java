package Operators;

public class EqualityOps {

        public static void main(String[] args) {
            // Equality Operators
            int a = 5;
            int b = 5;
            int c = 10;

            // Example 1: Equal to (==)
            boolean equalTo1 = a == b;
            boolean equalTo2 = b == c;
            boolean equalTo3 = c == a;
            System.out.println("Is " + a + " equal to " + b + "? " + equalTo1);
            System.out.println("Is " + b + " equal to " + c + "? " + equalTo2);
            System.out.println("Is " + c + " equal to " + a + "? " + equalTo3);

            // Example 2: Not equal to (!=)
            boolean notEqualTo1 = a != b;
            boolean notEqualTo2 = b != c;
            boolean notEqualTo3 = c != a;
            System.out.println("Is " + a + " not equal to " + b + "? " + notEqualTo1);
            System.out.println("Is " + b + " not equal to " + c + "? " + notEqualTo2);
            System.out.println("Is " + c + " not equal to " + a + "? " + notEqualTo3);

            // Example 3: Equal to (==) with Strings
            String str1 = "hello";
            String str2 = "hello";
            String str3 = "world";
            boolean stringEqualTo1 = str1 == str2;
            boolean stringEqualTo2 = str2 == str3;
            boolean stringEqualTo3 = str3 == str1;
            System.out.println("Is \"" + str1 + "\" equal to \"" + str2 + "\"? " + stringEqualTo1);
            System.out.println("Is \"" + str2 + "\" equal to \"" + str3 + "\"? " + stringEqualTo2);
            System.out.println("Is \"" + str3 + "\" equal to \"" + str1 + "\"? " + stringEqualTo3);
        }
    }


