package Collections.HashSet;

import java.util.HashSet;

public class CheckingEmptyOrNot {
    public static void main(String[] args) {

            // Create a empty hash set
            HashSet<String> hashset = new HashSet();
            // use add() method to add values in the hash set
                hashset.add("Red");
                hashset.add("Green");
                hashset.add("Black");
                hashset.add("White");
                hashset.add("Pink");
                hashset.add("Yellow");

                System.out.println("Original Hash Set: " + hashset);
                System.out.println("Checking the above array list is empty or not! "+hashset.isEmpty());
                System.out.println("Remove all the elements from a Hash Set: ");

                 hashset.removeAll(hashset);
                System.out.println("Hash Set after removing all the elements "+hashset);
        }
    }


