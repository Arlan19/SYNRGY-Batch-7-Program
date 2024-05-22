package ch1.pertemuan5;

import java.util.Scanner;

class SegitigaBintang {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Berapakah baris segitiga yang diinginkan?");
        int noOfRows = sc.nextInt();
        int rowCount = 1;

        for (int i = noOfRows; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print("* ");
            }
            System.out.println();
            rowCount++;
        }
    }
}
