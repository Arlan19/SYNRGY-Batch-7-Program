package Challenge.Example5;

import java.util.HashMap;

public class MenuView {
    public void displayMenu(HashMap<Integer, MenuItem> menuItems){
        System.out.println("===================");
        System.out.println("Selamat Datang");
        System.out.println("===================");
        System.out.println("Silahkan Pilih Makanan:");
        for (Integer key : menuItems.keySet()){
            MenuItem item = menuItems.get(key);
            System.out.println(key + ". " + item.getName() + " | " + item.getPrice());
        }
        System.out.println("99. Pesan dan Bayar");
        System.out.println("0. Keluar Aplikasi");
    }

    public void displayOrderConfirmation(String itemName,  double itemPrice, int quant){
        System.out.println("================");
        System.out.println("Berapa Pesanan Anda");
        System.out.println("================");
        System.out.println(itemName + " | " + itemPrice);
        System.out.println("(Input 0 untuk kembali)");
        System.out.print("Qty => ");
    }

    public void displayOrderSummary(HashMap<MenuItem, Integer> orderItems, double total){
        System.out.println("===========================");
        System.out.println("Konfirmasi & Pembayaran");
        System.out.println("===========================");
        for (MenuItem item : orderItems.keySet()){
            int quantity = orderItems.get(item);
            System.out.println(item.getName() + "\t" + quantity + "\t" + item.getPrice() * quantity);
        }
        System.out.println("---------------------------------");
        System.out.println("Total\t\t\t" + total);
        System.out.println("1. Konfirmasi dan Bayar");
        System.out.println("2. Kembali ke Menu Utama");
        System.out.println("0. Keluar Aplikasi");
    }

    public void displayPaymentReceipt(HashMap<MenuItem, Integer> orderItems, double total, String paymentMethod){
        System.out.println("=====================");
        System.out.println("Restaurant Food");
        System.out.println("=====================");
        System.out.println("Terima kasih sudah memesan disini.");
        System.out.println("Dibawah ini adalah pesanan anda:");
        for (MenuItem item : orderItems.keySet()){
            int quantity = orderItems.get(item);
            System.out.println(item.getName() + "\t" + quantity + "\t" + item.getPrice() * quantity);
        }
        System.out.println("---------------------------------");
        System.out.println("Total\t\t\t" + total);
        System.out.println("\nPembayaran: " + paymentMethod);
        System.out.println("=====================");
        System.out.println("Simpan struk ini sebagai bukti pembayaran.");
        System.out.println("=====================");
    }

    public void displayContinueOption(){
        System.out.println("=====================");
        System.out.println("Mohon masukkan input");
        System.out.println("Pilihan Anda");
        System.out.println("=====================");
        System.out.println("(Y) untuk lanjut");
        System.out.println("(N) untuk keluar");
    }

    public void displayErrorMessage(String message) {
        System.out.println("Error: " + message);
    }

}
