package Top3;

public class ContohLambda {
    public static void main(String[] args) {
        // Menggunakan lambda expression untuk mengimplementasikan interface OperasiMatematika
        OperasiMatematika penjumlahan = (a, b) -> a + b;
        OperasiMatematika pengurangan = (a, b) -> a - b;

        // Memanggil metode menggunakan implementasi lambda
        System.out.println("Hasil penjumlahan: " + penjumlahan.operasi(5, 3));
        System.out.println("Hasil pengurangan: " + pengurangan.operasi(5, 3));
    }
}
