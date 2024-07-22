package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collecting {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aarav", "Bhavna", "Chirag", "Divya");
        Set<String> nameSet = names.stream()
                .collect(Collectors.toSet());
        System.out.println(nameSet); // Output: [Aarav, Bhavna, Chirag, Divya]

    }
}
