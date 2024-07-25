package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindingElements {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aarav", "Bhavna", "Chirag");
        Optional<String> firstNameWithC = names.stream()
                .filter(name -> name.startsWith("C"))
                .findFirst();
        firstNameWithC.ifPresent(System.out::println); // Output: Chirag

    }
}
