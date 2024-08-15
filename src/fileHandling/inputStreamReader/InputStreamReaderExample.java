package fileHandling.inputStreamReader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderExample {
    public static void main(String[] args) {
        String fileName = "reactivestreams_sample.txt";
        String fileContent = "Hello, World!\nThis is a sample file.\nIt contains multiple lines.\n";

        try {
            // Write content to the file
            writeFile(fileName, fileContent);

            // Demonstrate InputStreamReader
            inputStreamReaderExample(fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        }
    }

    private static void inputStreamReaderExample(String fileName) throws IOException {
        try (FileInputStream fis = new FileInputStream(fileName);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8)) {
            System.out.println("Reading file with UTF-8 encoding:");
            int character;
            while ((character = isr.read()) != -1) {
                System.out.print((char) character);
            }
        }
    }
}