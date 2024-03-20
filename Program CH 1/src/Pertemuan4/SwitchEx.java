package Pertemuan4;

public class SwitchEx {
    public static void main(String[] args) {
        String grade = "A";

        String hasil = switch (grade) {
            case "A" -> "Lulus dengan baik";
            case "B" -> "Lulus";
            case "C" -> "Lulus dibantu";
            case "D" -> "Tidak Lulus";
            default -> "Tidak Lulus";
        };

        System.out.println(hasil);
    }
}
