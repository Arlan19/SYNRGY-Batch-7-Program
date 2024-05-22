package ch1.pertemuan5;

import java.util.Scanner;

public class RectangleAsterisk{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Berapakah lebar persegi yang diinginkan?");
        int rows = sc.nextInt();
        System.out.println("Berapakah panjang persegi yang diinginkan?");
        int columns = sc.nextInt();
        printRectangle(rows, columns);
    }
    static void printRectangle(int n, int m)
    {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}