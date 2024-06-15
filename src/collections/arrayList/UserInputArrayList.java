package collections.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputArrayList {
    public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            Scanner input = new Scanner(System.in);

            System.out.println("Enter strings (type 'done' when finished):");

            while (true) {
                String userInput = input.nextLine();
                if (userInput.equalsIgnoreCase("done")) {
                    break;
                }
                list.add(userInput);
            }

            System.out.println("You entered the following strings:");
            for (String str : list) {
                System.out.println(str);
            }
        }
    }


