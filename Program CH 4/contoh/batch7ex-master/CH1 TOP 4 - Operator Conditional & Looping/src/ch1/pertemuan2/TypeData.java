package ch1.pertemuan2;

import java.util.Date;

public class TypeData {

    static String nama = "RIKI";

    public static void main(String[] args) {
        /*
        Restoran-Mesan Menu
        nama
        harga
        qty
         */
        String nama = "Nasi Goreng";
        Double hargaBarang;
        Integer qty;
        Date dateType = new Date();

        System.out.println("Nama=" + nama);
        System.out.println("jenis=" + TypeData.nama);
        System.out.println("dateType=" + dateType); // YYYY-MM-DD


        char charType = 'a';
        short shortType = 12;
        int intType = 1;
        double doubletype = 1.1;
        boolean boeleanType = true;
        System.out.println("doubletype=" + doubletype);
        System.out.println("intType=" + intType);
        System.out.println("charType=" + charType);
        System.out.println("boeleanType=" + boeleanType);


        /*
        dunia kerja use primitive or reference ?
         */
        Integer intTypeRef = null;
        Double doubleTypeRef = null;
        System.out.println("intTypeRef=" + intTypeRef);
    }
}
