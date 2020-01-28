package lesson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Writer {

    Writer() {}

    public void write(String fileName, String data, int count) {
        try {
            // Create file
            File file = new File(fileName);
            // Create file writer
            FileWriter fileWriter = new FileWriter(file);
            // Create buffered writer
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            // write the string
            bufferedWriter.write(data + "\n");
            // Write the word count
            bufferedWriter.write("WORD COUNT: " + count);
            // Flush the buffer and close
            bufferedWriter.flush();
            fileWriter.close();
            bufferedWriter.close();
        }
        catch (Exception e) {

        }
    }
}
