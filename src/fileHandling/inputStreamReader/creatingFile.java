package fileHandling.inputStreamReader;

import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class creatingFile {
    public static void main(String[] args) {
        creatingFile creatingFile = new creatingFile();
        creatingFile.file();
    }

    public void file() {
        String fileName = "";
        String filePath = "";

        try {
            // Creating BufferedReader object
            BufferedReader bufferedReader = new BufferedReader
                    (new InputStreamReader(System.in));
            System.out.println("Enter the file name: ");

            // Reading File name
            fileName = bufferedReader.readLine();
            System.out.println("Enter the path where to create it: ");

            // Reading File Path
            filePath = bufferedReader.readLine();

            // Creating File Object
            File file1 = new File(filePath + "" + fileName + ".txt");

            // Method createNewFile() method creates blank file.
            file1.createNewFile();

        } catch (Exception exception) {
        }
    }
}
