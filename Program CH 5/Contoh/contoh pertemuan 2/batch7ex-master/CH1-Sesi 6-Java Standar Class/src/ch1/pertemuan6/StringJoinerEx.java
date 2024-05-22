package ch1.pertemuan6;

import java.util.StringJoiner;

public class StringJoinerEx {
    public static void main(String[] args) {
        // Membuat StringJoiner dengan delimiter ","
        StringJoiner joiner1 = new StringJoiner(";");
        joiner1.add("Apple");
        joiner1.add("Banana");
        joiner1.add("Orange");

        // Mengonversi StringJoiner menjadi string
        String fruits1 = joiner1.toString();
        System.out.println(fruits1); // Output: Apple,Banana,Orange


        // Membuat StringJoiner dengan delimiter ","
        StringJoiner joiner2 = new StringJoiner(",","[","]");
        joiner2.add("Apple");
        joiner2.add("Banana");
        joiner2.add("Orange");

        // Mengonversi StringJoiner menjadi string
        String fruits2 = joiner2.toString();
        System.out.println(fruits2); // Output: Apple,Banana,Orange

    }
}
