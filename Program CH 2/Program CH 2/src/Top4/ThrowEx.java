package Top4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ThrowEx {
    public static void writeToFile(String message) throws IOException, IllegalArgumentException{
        if (message== null) throw new IllegalArgumentException("message cannot be null");
        BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt"));
        bw.write(message);
        bw.close();
    }

    public static void write() throws IOException, IllegalArgumentException{
        writeToFile("Test");
    }

    public static void main(String[] args) {
        try {
            write();
        }catch (IOException | IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
