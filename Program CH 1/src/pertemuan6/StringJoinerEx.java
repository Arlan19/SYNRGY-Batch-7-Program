package pertemuan6;

import java.util.StringJoiner;

public class StringJoinerEx {
    public static void main(String[] args) {
        // Membuat StringJoiner dengan delimiter koma (,) dan prefix "[", suffix "]"
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        // Menambahkan elemen-elemen ke dalam StringJoiner
        sj.add("Apple");
        sj.add("Banana");
        sj.add("Orange");

        // Menampilkan hasil penggabungan string
        System.out.println(sj.toString()); // Output: [Apple, Banana, Orange]
    }
}
