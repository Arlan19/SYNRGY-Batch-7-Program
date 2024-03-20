package Top5;

import java.util.Scanner;

public class SegitigaDeretFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris segitiga Fibonacci: ");
        int rows = scanner.nextInt();

        int a = 0, b = 1;
        for (int i = 0; i < rows; i++) {
            // Mencetak spasi untuk membuat segitiga
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Mencetak deret Fibonacci
            for (int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }

    }
}
