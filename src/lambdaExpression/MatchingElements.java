package lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class MatchingElements {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aarav", "Bhavna", "Chirag");
        boolean anyStartsWithA = names.stream()
                .anyMatch(name -> name.startsWith("A"));
        boolean allStartWithA = names.stream()
                .allMatch(name -> name.startsWith("A"));
        boolean noneStartWithA = names.stream()
                .noneMatch(name -> name.startsWith("A"));
        System.out.println(anyStartsWithA); // Output: true
        System.out.println(allStartWithA); // Output: false
        System.out.println(noneStartWithA); // Output: false

    }
}
