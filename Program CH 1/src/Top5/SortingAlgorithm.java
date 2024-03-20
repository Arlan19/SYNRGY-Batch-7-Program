package Top5;

public class SortingAlgorithm {
    public static void main(String[] args) {
        int array[] = {100, 20, 15, 30, 5, 75,40};
        System.out.println("Array Sebelum Diurutkan");
        printArracy(array);
        bubleSort(array);
        System.out.println("Array setelah Diurutkan");
        printArracy(array);
    }

    private static void bubleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    private static void printArracy(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
