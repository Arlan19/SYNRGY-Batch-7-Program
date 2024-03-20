package Top5;

import java.util.Scanner;

public class DeretFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah suku deret Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Deret Fibonacci dengan " + n + " suku:");
        printFibonacci(n);
    }

    // Metode untuk mencetak deret Fibonacci dengan jumlah suku n
    public static void printFibonacci(int n) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
