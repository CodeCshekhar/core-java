package fileHandling;

import java.io.FileReader;

public class fileReader {
    public static void main(String[] args) throws Exception {
        FileReader file = new FileReader("E:\\file handling.txt");

       int i ;
        while ((i = file.read())!=-1){
            System.out.println((char) i);
        }
    }
}
