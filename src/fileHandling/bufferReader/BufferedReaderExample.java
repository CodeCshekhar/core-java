package fileHandling.bufferReader;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) {
        String fileName = "buffered reader_sample.txt";
        String fileContent = "Hello, World!\nThis is a sample file.\nIt contains multiple lines.\n";

        try {
            // Write content to the file
            writeFile(fileName, fileContent);

            // Demonstrate BufferedReader
            bufferReaderExample(fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        }
    }

    private static void bufferReaderExample(String fileName) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Reading entire file:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("\nReading first 5 characters:");
            char[] buffer = new char[5];
            bufferedReader.read(buffer);
            System.out.println(new String(buffer));

            System.out.println("\nSkipping 3 characters and reading next line:");
            bufferedReader.skip(3);
            System.out.println(bufferedReader.readLine());
        }
    }
}