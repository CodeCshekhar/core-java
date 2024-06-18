package exceptionHandling.types;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class fileNotFoundException {

    public static  void main(String[] args) {
        try{

            //Creating file path
            File file = new File("E://notepad.txt");

            // FileReader class is used to read data from the file.
            FileReader fileReader = new FileReader(file);
            System.out.println(fileReader);


        }catch (FileNotFoundException fileNotFoundException){
        System.out.println("File does not exit" );
        }

    }
}
