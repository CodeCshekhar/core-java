package collections.hashMap;

import java.util.HashMap;

public class SpecifiedKey {
    public static void main(String args[]) {
            HashMap< String, Integer > hashmap = new HashMap <> ();
            hashmap.put("Red", 1);
            hashmap.put("Green", 2);
            hashmap.put("Black", 3);
            hashmap.put("White", 4);
            hashmap.put("Blue", 5);

            // print the map
            System.out.println("The Original map: " + hashmap);
            System.out.println("1. Is key 'Green' exists?");
            if (hashmap.containsKey("Green")) {
                //key exists
                System.out.println("yes! - " + hashmap.get("Green"));
            } else {
                //key does not exist
                System.out.println("no!");
            }

            System.out.println("\n2. Is key 'orange' exists?");
            if (hashmap.containsKey("orange")) {
                System.out.println("yes! - " + hashmap.get("orange"));
            } else
                System.out.println("no!");
            }
        }




