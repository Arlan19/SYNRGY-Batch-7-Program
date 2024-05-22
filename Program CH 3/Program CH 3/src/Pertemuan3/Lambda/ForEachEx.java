package Pertemuan3.Lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        // Menggunakan forEach dengan lambda expression
        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);
    }
}
