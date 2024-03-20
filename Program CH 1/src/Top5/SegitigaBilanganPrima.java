package Top5;

import java.util.Scanner;

public class SegitigaBilanganPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris segitiga: ");
        int rows = scanner.nextInt();

        int currentNumber = 2; // Mulai dari bilangan prima pertama

        for (int i = 1; i <= rows; i++) {
            // Mencetak spasi untuk membuat segitiga
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // Mencetak deret bilangan prima
            for (int j = 1; j <= i; j++) {
                // Mencari bilangan prima berikutnya
                while (!isPrime(currentNumber)) {
                    currentNumber++;
                }
                System.out.printf("%4d", currentNumber);
                currentNumber++;
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
