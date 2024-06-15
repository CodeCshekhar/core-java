package operators;

public class InstanceOf {

        public static void main(String[] args) {
            // Example 1: Checking instance of String
            String obj1 = "Hello";
            System.out.println("Is 'obj1' an instance of String? " + (obj1 instanceof String));

            // Example 2: Checking instance of Integer
            Object obj2 = 123;
            System.out.println("Is 'obj2' an instance of Integer? " + (obj2 instanceof Integer));

            // Example 3: Checking instance of Double
            Object obj3 = 3.14;
            System.out.println("Is 'obj3' an instance of Double? " + (obj3 instanceof Double));

            // Example 4: Checking instance of Boolean
            Object obj4 = true;
            System.out.println("Is 'obj4' an instance of Boolean? " + (obj4 instanceof Boolean));

            // Example 5: Checking instance of Character
            Object obj5 = 'A';
            System.out.println("Is 'obj5' an instance of Character? " + (obj5 instanceof Character));

            // Example 6: Checking instance of Array
            Object obj6 = new int[]{1, 2, 3};
            System.out.println("Is 'obj6' an instance of int[]? " + (obj6 instanceof int[]));
        }
    }


