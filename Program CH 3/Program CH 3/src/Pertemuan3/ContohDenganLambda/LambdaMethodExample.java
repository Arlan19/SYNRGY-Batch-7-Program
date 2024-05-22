package Pertemuan3.ContohDenganLambda;

public class LambdaMethodExample {
    public static void main(String[] args) {
        // Menggunakan lambda expression untuk mengimplementasikan metode
        Operation addition = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;

        // Memanggil metode dengan menggunakan lambda expression
        System.out.println("Hasil penjumlahan: " + operate(5, 3, addition));
        System.out.println("Hasil pengurangan: " + operate(5, 3, subtraction));
    }

    // Metode yang menggunakan lambda expression sebagai parameter
    public static int operate(int a, int b, Operation operation) {
        return operation.operate(a, b);
    }
}
