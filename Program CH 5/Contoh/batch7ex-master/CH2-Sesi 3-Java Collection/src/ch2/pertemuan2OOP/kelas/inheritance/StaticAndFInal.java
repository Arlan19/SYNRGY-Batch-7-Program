package ch2.pertemuan2OOP.kelas.inheritance;

import lombok.Data;

@Data
public class StaticAndFInal {
    public static String URLUPLOADFILE = "HTTP";

    public final static double nilai = 3.14;
    public static void main(String[] args) {
        System.out.println("perhitungan "+ (nilai* 5));
    }
}
