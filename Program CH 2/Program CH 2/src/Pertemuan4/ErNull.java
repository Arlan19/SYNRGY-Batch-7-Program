package Pertemuan4;

public class ErNull {
    public static void main(String[] args) {

//        //contoh 1 : Null Pointer
//        String str = null;
//        int length = str.length();
//        System.out.println(length);
//
//        //contoh 2 : index of bound
//        int[] numbers = {1,2,3,4};
//        System.out.println(numbers[4]);

        try {
            String str = null;
            int length = str.length();
            System.out.println(length);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
