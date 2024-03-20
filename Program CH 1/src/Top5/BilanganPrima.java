package Top5;

import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        System.out.println("Bilangan prima hingga " + n + ":");
        printPrimes(n);
    }

    // Metode untuk memeriksa apakah suatu bilangan prima
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Metode untuk mencetak bilangan prima hingga n
    public static void printPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
