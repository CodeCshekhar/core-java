package Collections.HashSet;

import java.util.HashSet;

public class CloneSet {
    public static void main(String[] args) {
            // Create a empty hash set
            HashSet<String> hashset = new HashSet<String>();
            // use add() method to add values in the hash set
            hashset.add("Red");
            hashset.add("Green");
            hashset.add("Black");
            hashset.add("White");
            hashset.add("Pink");
            hashset.add("Yellow");
            System.out.println("Original Hash Set: " + hashset);

            HashSet <String> new_h_set = new HashSet <String> ();
            new_h_set = (HashSet)hashset.clone();
            System.out.println("Cloned Hash Set: " + new_h_set);
        }
    }


