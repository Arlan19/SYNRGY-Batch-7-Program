package ch2.pertemuan4Exception;

public class ErNullTryCatchFinally {
    public static void main(String[] args) {
        //contoh 1 : null pointer
//        System.out.println(50/0);
        String str = null;
        try {
            // Open Koneksi FB
            // Open/write File
            int length = str.length();
            System.out.println(length);
        }catch (Exception e){
            //mengimportmasikan
            System.out.println("handling eror 1="+e.getMessage());
            /// Lakukan penanganan yang sesuai, misalnya memberikan nilai default atau memberikan pesan kesalahan kepada pengguna
            str = "";
        }finally {
            //do action
            str = "";
            System.out.println("Finally");
            // Tutup Koneksi FB
            // Clode File
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
