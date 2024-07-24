package lambdaExpression;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concatenating {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("Aarav", "Bhavna");
        Stream<String> stream2 = Stream.of("Chirag", "Divya");
        Stream<String> combinedStream = Stream.concat(stream1, stream2);
        List<String> combinedList = combinedStream.collect(Collectors.toList());
        System.out.println(combinedList); // Output: [Aarav, Bhavna, Chirag, Divya]

    }
}
