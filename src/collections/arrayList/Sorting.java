package collections.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
            // Create a list and add some colors to the list
            List<String> Strings = new ArrayList<String>();
            Strings.add("Red");
            Strings.add("Green");
            Strings.add("Orange");
            Strings.add("White");
            Strings.add("Black");
            System.out.println("List before sort: "+Strings);
            Collections.sort(Strings);
            System.out.println("List after sort: "+Strings);
        }
    }


