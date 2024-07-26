package lambdaExpression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindingMaxMIn {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aarav", "Bhavna", "Chirag", "Divya");
        String longestName = names.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("No names");
        String shortestName = names.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse("No names");
        System.out.println("Longest Name: " + longestName); // Output: Bhavna
        System.out.println("Shortest Name: " + shortestName); // Output: Aarav

    }
}
