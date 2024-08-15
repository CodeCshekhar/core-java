package fileHandling.fileReader;

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        String fileName = "file reader_sample.txt";
        String fileContent = "Hello, World!\nThis is a sample file.\nIt contains multiple lines.\n";

        try {
            // Write content to the file
            writeFile(fileName, fileContent);

            // Demonstrate FileReader
            fileReaderExample(fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        }
    }

    private static void fileReaderExample(String fileName) throws IOException {
        try (FileReader fr = new FileReader(fileName)) {
            System.out.println("Reading entire file character by character:");
            int content;
            while ((content = fr.read()) != -1) {
                System.out.print((char) content);
            }
        }
    }
}