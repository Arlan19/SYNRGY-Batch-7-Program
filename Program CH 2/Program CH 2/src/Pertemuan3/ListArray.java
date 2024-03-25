package Pertemuan3;

import java.util.ArrayList;
import java.util.List;

public class ListArray {
    public static void main(String[] args) {
        List<String> bahasa = new ArrayList<>();
        bahasa.add("Kotlin");
        bahasa.add("Java");
        bahasa.add("Python");
        bahasa.add("JS");

        System.out.println(bahasa.get(2));
    }
}
