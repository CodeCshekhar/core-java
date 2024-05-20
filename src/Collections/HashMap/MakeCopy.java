package Collections.HashMap;

import java.util.HashMap;

public class MakeCopy {
    public static void main(String args[]) {
            // create two hash maps
            HashMap <Integer,String> hashmap1 = new HashMap <Integer,String> ();
            HashMap <Integer,String> hashmap2 = new HashMap<Integer,String>();

            // populate hash maps
            hashmap1.put(1, "Red");
            hashmap1.put(2, "Green");
            hashmap1.put(3, "Black");
            System.out.println("\nValues in first map: " + hashmap1);
            hashmap2.put(4, "White");
            hashmap2.put(5, "Blue");
            hashmap2.put(6, "Orange");
            System.out.println("\nValues in second map: " + hashmap2);

            // put all values in secondmap
            hashmap2.putAll(hashmap1);
            System.out.println("\nNow values in second map: " + hashmap2);
        }
    }


