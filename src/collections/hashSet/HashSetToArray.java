package collections.hashSet;

import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {
            // Create a empty hash set
            HashSet<String> hashSet = new HashSet<String>();
            // use add() method to add values in the hash set
            hashSet.add("Red");
            hashSet.add("Green");
            hashSet.add("Black");
            hashSet.add("White");
            hashSet.add("Pink");
            hashSet.add("Yellow");
            System.out.println("Original Hash Set: " + hashSet);
            // Creating an Array
            String[] new_array = new String[hashSet.size()];
            hashSet.toArray(new_array);

            // Displaying Array elements
            System.out.println("Array elements: ");
            for(String element : new_array){
                System.out.println(element);
            }
        }
    }


