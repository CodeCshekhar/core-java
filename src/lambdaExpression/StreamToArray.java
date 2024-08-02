package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToArray {
    public static void main(String[] args) {
        String[] namesArray = {"Aarav", "Bhavna", "Chirag"};
        List<String> namesList = Arrays.stream(namesArray)
                .collect(Collectors.toList());
        System.out.println(namesList); // Output: [Aarav, Bhavna, Chirag]

    }
}
