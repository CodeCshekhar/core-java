package collections.hashMap;

import java.util.HashMap;

public class MakeCopy {
    public static void main(String args[]) {
            // create two hash maps
            HashMap <Integer,String> hashmap = new HashMap <Integer,String> ();
            HashMap <Integer,String> hashmap1 = new HashMap<Integer,String>();

            // populate hash maps
            hashmap.put(1, "Red");
            hashmap.put(2, "Green");
            hashmap.put(3, "Black");
            System.out.println("\nValues in first map: " + hashmap);
            hashmap1.put(4, "White");
            hashmap1.put(5, "Blue");
            hashmap1.put(6, "Orange");
            System.out.println("\nValues in second map: " + hashmap1);

            // put all values in secondmap
            hashmap1.putAll(hashmap);
            System.out.println("\nNow values in second map: " + hashmap1);
        }
    }


