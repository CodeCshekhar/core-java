package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class bufferReader {
    public static void main(String[] args)
    throws Exception{
        File file = new File("E:\\file handling.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String s;
        while ((s = bufferedReader.readLine())!=null){
            System.out.println(s);
        }
    }
}
