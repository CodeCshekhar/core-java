package streamApi.hashMap;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class HashMapUsingStream {
        public static void main(String[] args) {
            // Create a HashMap
            HashMap<String, Integer> map = new HashMap<>();

            // put method using Streams
            map = (HashMap<String, Integer>) Stream.of(new Object[][] {
                    { "One", 1 }, { "Two", 2 }, { "Three", 3 }
            })
            .collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));

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
            map.entrySet().stream()
                    .forEach(entry -> System.out.println("Key: "
                            + entry.getKey()
                            + ", Value: "
                            + entry.getValue()));

            // Using keySet to iterate over keys
            map.keySet().stream()
                    .forEach(key -> System.out.println("Key: " + key));

            // Using values to iterate over values
            map.values().stream()
                    .forEach(val -> System.out.println("Value: " + val));
        }
    }


