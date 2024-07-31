package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aarav", "Bhavna", "Chirag", "Divya", "Anaya");
        Map<Boolean, List<String>> partitionedByLength = names.stream()
                .collect(Collectors.partitioningBy(name -> name.length() > 5));
        System.out.println(partitionedByLength); // Output: {false=[Aarav, Divya], true=[Bhavna, Chirag, Anaya]}

    }
}
