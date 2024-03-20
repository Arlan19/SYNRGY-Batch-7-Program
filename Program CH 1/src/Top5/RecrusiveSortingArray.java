package Top5;

public class RecrusiveSortingArray {
    public static void main(String[] args) {
        int array[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array Sebelum di Sorting ");
        tampilkanArray(array);
        recrusiveSort(array, 0);
        System.out.println("Array Setelah di Sorting");
        tampilkanArray(array);
    }

    private static void recrusiveSort(int[] array, int startIndex) {
        if (startIndex < array.length -  1){
            int minIndex = startIndex;
            for (int i = startIndex + 1; i < array.length; i++){
                if (array[i] < array[minIndex]){
                    minIndex = i;
                }
            }
            int temp = array[startIndex];
            array[startIndex] = array[minIndex];
            array[minIndex] = temp;
            recrusiveSort(array, startIndex+1);
        }
    }

    private static void tampilkanArray(int[] array) {
        for(int i = 0; i <= array.length - 1; i ++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
