package ch1.pertemuan5;

import java.util.Scanner;

class SegitigaBintangAngka {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Berapa baris segitiga yang diinginkan?");
        int noOfRows = sc.nextInt();
        int rowCount = noOfRows;

        for (int i = 0; i < noOfRows; i++) {
            for (int j = 1; j <= i*2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j+" ");
            }
            for (int j = rowCount-1; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
            rowCount--;
        }
    }
}
