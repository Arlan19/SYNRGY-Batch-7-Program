package pertemuan2;

import java.util.Scanner;

public class TugasPertemuan2 {

    static double hargaNasiGoreng;
    static double hargaSoapDaging;
    static double hargaMieAyam;

    static int qty;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu Makanan:");
        hargaNasiGoreng = 13000.00;
        System.out.println("1. Nasi Goreng - Rp "+hargaNasiGoreng);
        hargaSoapDaging = 20000.00;
        System.out.println("2. Soap Daging - Rp "+hargaSoapDaging);
        hargaMieAyam = 17000.00;
        System.out.println("3. Mie Ayam - Rp "+hargaMieAyam);
        System.out.println("0. Keluar");

        System.out.print("Masukkan Angka Menu Makanan Yang Kamu Pesan: ");
        int choice = scanner.nextInt();
        System.out.print("Masukkan Jumlah Pesanan: ");
        qty = scanner.nextInt();

        switch (choice) {
            case 1:
                nasiGoreng();
                break;
            case 2:
                soapDaging();
                break;
            case 3:
                mieAyam();
                break;
            case 0:
                System.out.println("Selamat Datang Kembali");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public static void nasiGoreng(){
        System.out.println("Anda Memesan Nasi Goreng Sebanyak : " + qty + " Porsi");
        double totalNasiGoreng = qty * hargaNasiGoreng;
        System.out.println("Total belanja anda adalah : Rp. "+totalNasiGoreng);
    }
    public static void soapDaging(){
        System.out.println("Anda Memesan Soap Daging Sebanyak : " + qty + "Porsi");
        double totalSoapDaging = qty * hargaSoapDaging;
        System.out.println("Total belanja anda adalah : Rp. "+totalSoapDaging);
    }
    public static void mieAyam(){
        System.out.println("Anda Memesan Mie Ayam Sebanyak : " + qty + "Porsi");
        double totalMieAyam = qty * hargaMieAyam;
        System.out.println("Total belanja anda adalah : Rp. "+totalMieAyam);
    }


}
