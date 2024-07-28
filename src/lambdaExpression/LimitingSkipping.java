package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitingSkipping {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aarav", "Bhavna", "Chirag", "Divya");
        List<String> limitedNames = names.stream()
                .limit(2)
                .collect(Collectors.toList());
        List<String> skippedNames = names.stream()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(limitedNames); // Output: [Aarav, Bhavna]
        System.out.println(skippedNames); // Output: [Chirag, Divya]

    }
}
