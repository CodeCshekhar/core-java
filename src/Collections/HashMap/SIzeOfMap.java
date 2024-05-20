package Collections.HashMap;

import java.util.HashMap;

public class SIzeOfMap {
    public static void main(String args[]){
           HashMap<Integer,String> hashmap= new HashMap<Integer,String>();

                 hashmap.put(1, "Red");
                 hashmap.put(2, "Green");
                 hashmap.put(3, "Black");
                 hashmap.put(4, "White");
                 hashmap.put(5, "Blue");

            System.out.println("Size of the hash map: "+hashmap.size());
        }
    }


