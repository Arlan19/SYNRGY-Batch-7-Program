package Top4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResourceEx2 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new File("test.txt")); PrintWriter writer = new PrintWriter(new File("testWriter.txt"))) {
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
                writer.print(scanner.nextLine());
            }
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
    }
}
