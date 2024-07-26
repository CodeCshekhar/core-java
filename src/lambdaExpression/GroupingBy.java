package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aarav", "Bhavna", "Chirag", "Divya", "Anaya");
        Map<Character, List<String>> groupedByInitial = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(groupedByInitial); // Output: {A=[Aarav, Anaya], B=[Bhavna], C=[Chirag], D=[Divya]}

    }
}
