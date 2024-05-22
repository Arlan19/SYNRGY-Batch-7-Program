package Pertemuan4;

public class TryEx {
    public static void main(String[] args) {
        //contoh 1 : null pointer
        String str = null;
        try {
            int length = str.length();
            System.out.println(length);
        }catch (Exception e){
            //mengimportmasikan
            System.out.println("handling eror 1="+e.getMessage());
            /// Lakukan penanganan yang sesuai, misalnya memberikan nilai default atau memberikan pesan kesalahan kepada pengguna
        }finally {
            str = "data sudah tidak null";
            System.out.println(str);
            System.out.println("panjang data = " + str.length());
        }

        try {
            //contoh 2 : array
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]);
        }catch (Exception e){
            System.out.println("handling eror 1="+e.getMessage());
            // eksekusi lainnya : logic seperti tuliskan
        }
    }
}
