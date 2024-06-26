package collections.hashSet;

import java.util.HashSet;
import java.util.Iterator;
public class BasicHashSet {
    public static void main(String[] args) {
            // Creating a HashSet
            HashSet<String> hset = new HashSet<String>();

            // Adding elements to the HashSet
            hset.add("Element1");
            hset.add("Element2");
            hset.add("Element3");
            hset.add("Element4");

            // Adding a null value
            hset.add(null);

            // Displaying the HashSe
            System.out.println("HashSet: " + hset);

            // Removing an element
            hset.remove("Element2");

            // Iterating over HashSet items
            System.out.println("Iterating over list:");
            Iterator<String> i = hset.iterator();
            while(i.hasNext()) {
                System.out.println(i.next());
            }
        }
    }


