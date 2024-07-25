package lambdaExpression;

import java.util.Arrays;
import java.util.List;


public class Filtering {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aarav", "Bhavna", "Chirag", "Divya");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();
        System.out.println(filteredNames); // Output: [Aarav]


    }
}
