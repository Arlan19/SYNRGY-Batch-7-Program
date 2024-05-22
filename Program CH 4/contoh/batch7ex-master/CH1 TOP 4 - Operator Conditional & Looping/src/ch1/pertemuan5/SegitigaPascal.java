package ch1.pertemuan5;

import java.util.Scanner;

class SegitigaPascal {
    public static void printPascal(int n)
    {
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {
                System.out.print(" ");
            }

            int c = 1;
            for (int i = 1; i <= line; i++) {

                System.out.print(c + " ");
                c = c * (line - i) / i;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Berapa tinggi segitiga yang diinginkan?");
        int n = sc.nextInt();
        printPascal(n);
    }
}