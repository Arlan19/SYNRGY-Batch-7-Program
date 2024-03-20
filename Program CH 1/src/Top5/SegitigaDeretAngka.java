package Top5;

import java.util.Scanner;

public class SegitigaDeretAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris segitiga: ");
        int rows = scanner.nextInt();

        int currentNumber = 1; // Mulai dari angka 1

        for (int i = 1; i <= rows; i++) {
            // Mencetak spasi untuk membuat segitiga
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // Mencetak deret bilangan bulat
            for (int j = 1; j <= i; j++) {
                System.out.printf("%4d", currentNumber);
                currentNumber++;
            }
            System.out.println();
        }
    }
}
