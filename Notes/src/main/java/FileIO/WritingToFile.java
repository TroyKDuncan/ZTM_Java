package FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("file.txt", true)) {
            writer.write("Hello!\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
