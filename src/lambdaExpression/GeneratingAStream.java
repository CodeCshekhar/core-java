package lambdaExpression;

import java.util.stream.Stream;

public class GeneratingAStream {
    public static void main(String[] args) {
        Stream<Double> randomNumbers = Stream.generate(Math::random).limit(5);
        randomNumbers.forEach(System.out::println);
// Output: 5 random numbers between 0.0 and 1.0

    }
}
