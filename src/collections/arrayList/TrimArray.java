package collections.arrayList;

import java.util.ArrayList;

public class TrimArray {
    public static void main(String[] args) {
            ArrayList<String> a1= new ArrayList<String>();
            a1.add("Red");
            a1.add("Green");
            a1.add("Black");
            a1.add("White");
            a1.add("Pink");
            System.out.println("Original array list: " + a1);
            System.out.println("Let trim to size the above array: ");
            a1.trimToSize();
            System.out.println(a1);
        }
    }


