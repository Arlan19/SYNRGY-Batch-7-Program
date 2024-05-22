package ch2.pertemuan4Exception;

public class ErNull {
    public static void main(String[] args) {
        //contoh 1 : null pointer
        String str = null;
        int length = str.length();
        System.out.println(length);

        //contoh 2 : array
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[3]);
    }

}
