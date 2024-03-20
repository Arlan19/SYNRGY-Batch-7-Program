package Top5;

import java.util.Scanner;

public class SegitigaPascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga Pascal: ");
        int height = scanner.nextInt();

        System.out.println("Segitiga Pascal dengan tinggi " + height + ":");
        printPascalTriangle(height);
    }

    public static void printPascalTriangle(int height) {
        for (int i = 0; i < height; i++) {

            for (int k = 0; k < height - i; k++){
                System.out.print(" ");
            }
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
