package collections.hashMap;

import java.util.HashMap;
import java.util.Map;

public class BasicHashMap {
    public static void main(String[] args) {
            // Create a HashMap
            HashMap<String, Integer> map = new HashMap<>();

            // put method
            map.put("One", 1);
            map.put("Two", 2);
            map.put("Three", 3);

            // putIfAbsent method
            map.putIfAbsent("Four", 4);

            // get method
            int value = map.get("One");
            System.out.println("Value for key 'One': " + value);

            // containsKey method
            boolean hasKey = map.containsKey("Two");
            System.out.println("Contains key 'Two': " + hasKey);

            // containsValue method
            boolean hasValue = map.containsValue(3);
            System.out.println("Contains value '3': " + hasValue);

            // remove method
            map.remove("Three");

            // replace method
            map.replace("Two", 22);

            // size method
            int size = map.size();
            System.out.println("Size of map: " + size);

            // isEmpty method
            boolean isEmpty = map.isEmpty();
            System.out.println("Is map empty: " + isEmpty);

            // clear method
            map.clear();

            // Using entrySet to iterate over map entries
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }

            // Using keySet to iterate over keys
            for (String key : map.keySet()) {
                System.out.println("Key: " + key);
            }

            // Using values to iterate over values
            for (Integer val : map.values()) {
                System.out.println("Value: " + val);
            }
        }
    }


