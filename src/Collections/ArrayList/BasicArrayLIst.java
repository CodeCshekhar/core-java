package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicArrayLIst {
    public static void main(String[] args) {
            // 1.Create an ArrayList
            ArrayList<String> languages = new ArrayList<>();

            // 2.Add elements to ArrayList
            languages.add("Java");
            languages.add("Python");
            languages.add("Swift");

            System.out.println("ArrayList after adding elements: " + languages);

            // 3.Access elements from ArrayList
            String firstLanguage = languages.get(0);
            System.out.println("First language in the list: " + firstLanguage);

            // 4.Remove elements from ArrayList
            languages.remove(0);
            System.out.println("ArrayList after removing the first element: " + languages);

            // 5.Add elements at specific positions in ArrayList
            languages.add(0, "JavaScript");
            System.out.println("ArrayList after adding 'JavaScript' at index 0: " + languages);

            // 6.Create another ArrayList
            ArrayList<String> moreLanguages = new ArrayList<>(Arrays.asList("C", "C++", "C#"));

            // 7.Add all elements from the second ArrayList to the first ArrayList
            languages.addAll(moreLanguages);
            System.out.println("ArrayList after adding all elements from 'moreLanguages': " + languages);
        }
    }


