package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AddElement {
    public static void main(String[] args) {
            // Creae a list and add some colors to the list
            List<String> Strings = new ArrayList<String>();
            Strings.add("Red");
            Strings.add("Green");
            Strings.add("Orange");
            Strings.add("White");
            Strings.add("Black");
            // Print the list
            System.out.println(Strings);
            // Update the third element with "Yellow"
            Strings.set(2, "Yellow");
            // Print the list again
            System.out.println(Strings);
        }
    }


