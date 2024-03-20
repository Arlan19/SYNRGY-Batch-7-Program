package Pertemuan1.ExLatihan3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Restaurant {
    private Map<String, Integer> orders = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    private DecimalFormat df = new DecimalFormat("#,###");

    private Menu[] menus = {
            new Menu("Nasi Goreng", 15000),
            new Menu("Mie Goreng", 13000),
            new Menu("Nasi + Ayam", 18000),
            new Menu("Es Teh Manis", 3000),
            new Menu("Es Jeruk", 5000)
    };

    public void displayMenu() {
        System.out.println("==========================");
        System.out.println("Selamat datang di BinarFud");
        System.out.println("==========================");

        for (int i = 0; i < menus.length; i++) {
            System.out.println((i + 1) + ". " + menus[i].getName() + "\t| " + df.format(menus[i].getPrice()));
        }

        System.out.println("99. Pesan dan Bayar");
        System.out.println("0. Keluar Aplikasi");
    }

    public void placeOrder(int choice) {
        if (choice >= 1 && choice <= menus.length) {
            Menu selectedMenu = menus[choice - 1];
            System.out.println("\n==========================");
            System.out.println("Berapa Pesanan Anda");
            System.out.println("==========================");
            System.out.println(selectedMenu.getName() + "\t| " + df.format(selectedMenu.getPrice()));
            System.out.println("(Input 0 untuk kembali)");

            int qty;
            do {
                System.out.print("Qty => ");
                qty = scanner.nextInt();
                scanner.nextLine(); // consume newline
                if (qty < 0)
                    System.out.println("Jumlah pesanan tidak valid.");
            } while (qty < 0);

            if (qty > 0) {
                orders.put(selectedMenu.getName(), orders.getOrDefault(selectedMenu.getName(), 0) + qty);
                System.out.println("Pesanan " + selectedMenu.getName() + " sebanyak " + qty + " telah ditambahkan.");
            } else {
                System.out.println("Pemesanan " + selectedMenu.getName() + " dibatalkan.");
            }
        } else {
            System.out.println("Menu tidak valid.");
        }
    }

    public void displayBill() {
        System.out.println("\n==========================");
        System.out.println("Konfirmasi & Pembayaran");
        System.out.println("==========================");

        double totalHarga = 0;

        for (Map.Entry<String, Integer> entry : orders.entrySet()) {
            String foodName = entry.getKey();
            int quantity = entry.getValue();
            int hargaPerItem = getHargaPerItem(foodName);
            double totalPerItem = hargaPerItem * quantity;
            System.out.println(foodName + "\t" + quantity + "\t" + df.format(totalPerItem));
            totalHarga += totalPerItem;
        }

        System.out.println("------------------------+");
        System.out.println("Total\t\t" + orders.size() + "\t" + df.format(totalHarga));

        System.out.println("\n1. Konfirmasi dan Bayar");
        System.out.println("2. Kembali ke Menu Utama");
        System.out.println("0. Keluar Aplikasi");

        System.out.print("=> ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                saveReceipt(totalHarga);
                break;
            case 2:
                orders.clear();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Menu tidak valid.");
        }
    }

    private int getHargaPerItem(String foodName) {
        for (Menu menu : menus) {
            if (menu.getName().equals(foodName)) {
                return menu.getPrice();
            }
        }
        return 0;
    }

    private void saveReceipt(double totalHarga) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("struk_pembayaran_latihan_3.txt"))) {
            writer.write("==========================");
            writer.newLine();
            writer.write("BinarFud");
            writer.newLine();
            writer.write("==========================");
            writer.newLine();
            writer.newLine();
            writer.write("Terimakasih sudah memesan\ndi BinarFud\n");
            writer.newLine();
            writer.write("Dibawah ini adalah pesanan Anda");
            writer.newLine();
            writer.newLine();

            for (Map.Entry<String, Integer> entry : orders.entrySet()) {
                String foodName = entry.getKey();
                int quantity = entry.getValue();
                int hargaPerItem = getHargaPerItem(foodName);
                double totalPerItem = hargaPerItem * quantity;
                writer.write(foodName + "\t" + quantity + "\t" + df.format(totalPerItem));
                writer.newLine();
            }

            writer.write("--------------------------------+");
            writer.newLine();
            writer.write("Total\t\t" + orders.size() + "\t" + df.format(totalHarga));
            writer.newLine();
            writer.newLine();
            writer.write("Pembayaran: BinarCash");
            writer.newLine();
            writer.newLine();
            writer.write("==========================");
            writer.newLine();
            writer.write("Simpan struk ini sebagai\nbukti pembayaran");
            writer.newLine();
            writer.write("==========================");
            writer.newLine();

            System.out.println("Struk pembayaran telah disimpan sebagai struk_pembayaran.txt");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan struk pembayaran.");
            e.printStackTrace();
        }
    }
}
