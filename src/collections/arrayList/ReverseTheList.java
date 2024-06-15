package collections.arrayList;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class ReverseTheList {
    public static void main(String[] args) {
            // Create a list and add some colors to the list
                List<String> String = new ArrayList<String>();
                String.add("Red");
                String.add("Green");
                String.add("Orange");
                String.add("White");
                String.add("Black");
            System.out.println("List before reversing :\n" + String);
              Collections.reverse(String);
            System.out.println("List after reversing :\n" + String);
        }
    }






