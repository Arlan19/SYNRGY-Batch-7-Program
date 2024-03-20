package pertemuan6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx {
    public static void main(String[] args) {
        // Pola regex untuk mencocokkan angka di dalam string
        String regex = "\\d+";

        // String input
        String input = "Ini adalah contoh string dengan angka 123 dan 456";

        // Buat objek Pattern dari pola regex
        Pattern pattern = Pattern.compile(regex);

        // Buat objek Matcher dari string input dan pola regex
        Matcher matcher = pattern.matcher(input);

        // Temukan semua kecocokan dalam string input
        while (matcher.find()) {
            // Cetak kecocokan yang ditemukan
            System.out.println("Kecocokan ditemukan: " + matcher.group());
        }
    }
}
