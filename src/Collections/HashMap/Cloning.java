package Collections.HashMap;

import java.util.HashMap;

public class Cloning {
    public static void main(String args[]){
            HashMap<Integer,String> hashmap= new HashMap<Integer,String>();
            hashmap.put(1, "Red");
            hashmap.put(2, "Green");
            hashmap.put(3, "Black");
            hashmap.put(4, "White");
            hashmap.put(5, "Blue");
            // print the map
            System.out.println("The Original map: " + hashmap);
            HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>();
            new_hash_map = (HashMap)hashmap.clone();
            System.out.println("Cloned map: " + new_hash_map);
        }
    }


