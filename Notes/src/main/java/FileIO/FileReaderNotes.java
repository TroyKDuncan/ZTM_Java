package FileIO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderNotes {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("An I/O error occurred.");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Failed to close the reader");
                }
            }
        }
    }
}
