package Pertemuan3.ContohDenganMethodReference;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Carol");

        names.forEach(System.out::println);

        names.sort(String::compareToIgnoreCase);

        names.forEach(System.out::println);
    }
}
