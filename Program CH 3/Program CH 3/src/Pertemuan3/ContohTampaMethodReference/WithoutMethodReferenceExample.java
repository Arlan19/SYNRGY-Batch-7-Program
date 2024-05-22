package Pertemuan3.ContohTampaMethodReference;

import java.util.ArrayList;
import java.util.List;

public class WithoutMethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Carol");

        names.forEach(name -> System.out.println(name));


        names.sort((name1, name2) -> name1.compareToIgnoreCase(name2));

        // Menggunakan lambda expression untuk mencetak setiap nama setelah diurutkan
        names.forEach(name -> System.out.println(name));
    }
}
