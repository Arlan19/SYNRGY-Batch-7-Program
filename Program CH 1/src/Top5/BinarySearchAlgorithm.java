package Top5;

import java.util.Scanner;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Angka yang ingin dicari di dalam array");
        int target = scanner.nextInt();

        int index = linearSearch(array, target);

        if (index != -1) {
            System.out.println("Angka " + target + " terletak pada index ke-" + index);
        } else {
            System.out.println("Angka " + target + " tidak ditemukan dalam array.");
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
