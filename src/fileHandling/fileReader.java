package fileHandling;

import java.io.FileReader;

public class fileReader {
    public static void main(String[] args) throws Exception {

        //Reading txt file
        FileReader file = new FileReader("E:\\Any file name.txt");

       int i ;
        while ((i = file.read())!=-1){
            System.out.println((char) i);


        //Reading json file
        FileReader file1 = new FileReader("E:\\Any file name.json");

            int o ;
            while ((o = file1.read())!=-1){
                System.out.println((char) o);

        //Reading xml file
        FileReader file2 = new FileReader("E:\\Any file name.xml");

                int p ;
                while ((p = file2.read())!=-1){
                    System.out.println((char) p);
        }
    }
}
}

}
