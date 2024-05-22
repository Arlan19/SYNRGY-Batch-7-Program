package Challenge.Example4;

import java.util.Map;

public class MenuView {
    public void displayMenu(Map<Integer, MenuItem> menu){
        System.out.println("===================");
        System.out.println("Selamat datang");
        System.out.println("===================");
        System.out.println("Silahkan pilih makanan:");
        for (Map.Entry<Integer, MenuItem> entry : menu.entrySet()){
            System.out.println(entry.getKey() + ". " + entry.getValue().getName() + "\t | " + entry.getValue().getPrice());
        }
        System.out.println("99. Pesan dan Bayar");
        System.out.println("0. Keluar Aplikasi");
    }

    public void displayConfirmation(Order order){
        System.out.println("===================");
        System.out.println("Konfirmasi & Pembayaran");
        System.out.println("===================");
        for (OrderItem item : order.getItems()){
            System.out.println(item.getMenuItem().getName() + "\t" + item.getQuantity() + "\t" +item.getTotalPrice());
        }
        System.out.println("-----------------------------------");
        System.out.println("Total\t\t\t" + order.getTotalPrice());
        System.out.println("1. Konfirmasi dan Bayar");
        System.out.println("2. Kembali ke Menu Utama");
        System.out.println("0. Keluar Aplikasi");
    }

    public void displayReceipt(Order order, String paymentMethod){
        System.out.println("===================");
        System.out.println("Restaurant Foof");
        System.out.println("===================");
        System.out.println("Terimakasih sudah memesan disini");
        System.out.println("Dibawah ini adalah pesanan anda");
        for (OrderItem item : order.getItems()) {
            System.out.println(item.getMenuItem().getName() + "\t" + item.getQuantity() + "\t" + item.getTotalPrice());
        }
        System.out.println("-----------------------------------");
        System.out.println("Total\t\t\t" + order.getTotalPrice());
        System.out.println("Pembayaran: " + paymentMethod);
        System.out.println("===================");
        System.out.println("Simpan struk ini sebagai bukti pembayaran");
        System.out.println("===================");
    }
}
