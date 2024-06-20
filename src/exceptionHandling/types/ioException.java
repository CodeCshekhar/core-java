package exceptionHandling.types;

import java.io.IOException;
import java.util.Scanner;

public class ioException {
    public static void main(String[] args) {

        // Create a new scanner with the specified String
        // Object
        Scanner scanner = new Scanner("This is Example");
        System.out.println("" + scanner.nextLine());

        // Check if there is an IO exception
        System.out.println("Exception is found "+ scanner.ioException());
        }
}


