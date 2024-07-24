package lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class Counting {
    public static void main(String[] args) {


    List<String> names = Arrays.asList("Aarav", "Bhavna", "Chirag", "Divya", "Anaya");
    long count = names.stream()
            .filter(name -> name.startsWith("A"))
            .count();
System.out.println(count); // Output: 2

}
}
