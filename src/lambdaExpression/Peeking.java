package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Peeking {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aarav", "Bhavna", "Chirag", "Divya");
        List<String> uppercasedNames = names.stream()
                .peek(name -> System.out.println("Original: " + name))
                .map(String::toUpperCase)
                .peek(name -> System.out.println("Uppercase: " + name))
                .collect(Collectors.toList());
        System.out.println(uppercasedNames); // Output: [AARAV, BHAVNA, CHIRAG, DIVYA]

    }
}
