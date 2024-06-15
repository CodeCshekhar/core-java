package collections.arrayList;

import java.util.ArrayList;

public class ArrayLIst {
    public static void main(String[] args) {

            // Create an empty ArrayList of Strings
             ArrayList<String> languages = new ArrayList<>();
             System.out.println("Empty ArrayList: " + languages);

        }

        {
            //Adding Elements to an ArrayList
             ArrayList<String> colors = new ArrayList<>();
                    colors.add("Red");
                    colors.add("Green");
                    colors.add("Blue");
             System.out.println("Colors ArrayList: " + colors);
        }


        {
            //Accessing Elements in an ArrayList
            ArrayList<Integer> numbers = new ArrayList<>();
                   numbers.add(10);
                   numbers.add(20);
                   numbers.add(30);
                   int secondNumber = numbers.get(1);
            System.out.println("Second number: " + secondNumber);
        }

        {
            //Modifying and Removing Elements
            ArrayList<String> fruits = new ArrayList<>();
                  fruits.add("Apple");
                  fruits.add("Banana");
                  fruits.add("Orange");
                  fruits.set(0, "Opel"); // Modify the first element
            System.out.println("Modified fruits: " + fruits);
            fruits.remove(1); // Remove the second element (Banana)
            System.out.println("Fruits after removal: " + fruits);
        }

        {
            //Looping Through an ArrayList
            ArrayList<String> animals = new ArrayList<>();
                  animals.add("Cow");
                  animals.add("Cat");
                  animals.add("Dog");

             // Using a for loop
            for (int i = 0; i < animals.size(); i++) {
                System.out.println("Animal: " + animals.get(i));
            }

             // Using a for-each loop
            for (String animal : animals) {
                System.out.println("Animal: " + animal);
            }
        }

}

