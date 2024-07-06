package streamApi.hashSet;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashSetUsingStream{
    public static void main(String[] args) {
        // Creating a HashSet using Streams
        Set<String> hset = Stream.of("Element1", "Element2", "Element3", "Element4", null)
                .collect(Collectors.toSet());

        // Displaying the HashSet
        System.out.println("HashSet: " + hset);

        // Removing an element using Streams (HashSet can't be modified directly in Stream)
        hset = hset.stream()
                .filter(e -> !"Element2".equals(e))
                .collect(Collectors.toSet());

        // Iterating over HashSet items using Streams
        System.out.println("Iterating over list:");
        hset.stream().forEach(System.out::println);
    }
}

