package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectingToMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aarav", "Bhavna", "Chirag", "Divya");
        Map<String, Integer> nameLengthMap = names.stream()
                .collect(Collectors.toMap(name -> name, String::length));
        System.out.println(nameLengthMap); // Output: {Aarav=5, Bhavna=6, Chirag=6, Divya=5}

    }
}
