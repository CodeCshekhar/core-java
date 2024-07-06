package streamApi.arrayList;

import java.util.ArrayList;
import java.util.stream.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListUsingStream {

        public static void main(String[] args) {
            // 1. Create a Stream from ArrayList
            List<String> languages = new ArrayList<>();
            Stream<String> languagesStream = languages.stream();

            // 2. Add elements to ArrayList
            languages = Stream.of("Java", "Python", "Swift").collect(Collectors.toList());
            languagesStream = languages.stream();
            System.out.println("ArrayList after adding elements: " + languages);

            // 3. Access elements from ArrayList
            String firstLanguage = languagesStream.findFirst().orElse(null);
            System.out.println("First language in the list: " + firstLanguage);

            // 4. Remove elements from ArrayList
            languages = languages.stream().skip(1).collect(Collectors.toList());
            languagesStream = languages.stream();
            System.out.println("ArrayList after removing the first element: " + languages);

            // 5. Add elements at specific positions in ArrayList
            languages.add(0, "JavaScript");
            languagesStream = languages.stream();
            System.out.println("ArrayList after adding 'JavaScript' at index 0: " + languages);

            // 6. Create another ArrayList
            List<String> moreLanguages = Arrays.asList("C", "C++", "C#");
            Stream<String> moreLanguagesStream = moreLanguages.stream();

            // 7. Add all elements from the second ArrayList to the first ArrayList
            languages = Stream.concat(languagesStream, moreLanguagesStream).collect(Collectors.toList());
            languagesStream = languages.stream();
            System.out.println("ArrayList after adding all elements from 'moreLanguages': " + languages);
        }
    }


