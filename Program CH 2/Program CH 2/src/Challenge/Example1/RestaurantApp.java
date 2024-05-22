package Challenge.Example1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestaurantApp {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Integer, MenuItem> menuItems = new HashMap<>();
    private static Map<MenuItem, Integer> orders = new HashMap<>();

    static {
        menuItems.put(1, new MenuItem("Nasi Goreng", 15000));
        menuItems.put(2, new MenuItem("Mie Goreng", 13000));
        menuItems.put(3, new MenuItem("Nasi + Ayam", 18000));
        menuItems.put(4, new MenuItem("Es Teh Manis", 3000));
        menuItems.put(5, new MenuItem("Es Jeruk", 5000));
    }

    public static void main(String[] args) {
        displayWelcomeMessage();

        int choice;
        do {
            displayMenu();
            choice = getChoice();
            handleChoice(choice);
        } while (choice != 0);

        System.out.println("Terima kasih telah mengunjungi restoran kami!");
    }

    private static void displayWelcomeMessage() {
        System.out.println("===================");
        System.out.println("Selamat Datang");
        System.out.println("===================");
    }

    private static void displayMenu() {
        System.out.println("Silahkan pilih makanan:");
        for (Map.Entry<Integer, MenuItem> entry : menuItems.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue().getName() + " | " + entry.getValue().getPrice());
        }
        System.out.println("99. Pesan dan Bayar");
        System.out.println("0. Keluar Aplikasi");
    }

    private static int getChoice() {
        System.out.print("Pilihan Anda: ");
        return scanner.nextInt();
    }

    private static void handleChoice(int choice) {
        if (choice == 0) {
            return;
        } else if (choice == 99) {
            confirmAndPay();
        } else if (menuItems.containsKey(choice)) {
            orderItem(choice);
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }

    private static void orderItem(int choice) {
        MenuItem item = menuItems.get(choice);
        System.out.println("================");
        System.out.println("Berapa pesanan Anda?");
        System.out.println("================");
        System.out.println(item.getName() + " | " + item.getPrice());
        System.out.print("qty => ");
        int qty = scanner.nextInt();
        if (qty > 0) {
            orders.put(item, qty);
            System.out.println("Pesanan ditambahkan.");
        } else {
            System.out.println("Pesanan dibatalkan.");
        }
    }

    private static void confirmAndPay() {
        double total = 0;
        System.out.println("====================");
        System.out.println("Konfirmasi & Pembayaran");
        System.out.println("====================");
        for (Map.Entry<MenuItem, Integer> entry : orders.entrySet()) {
            MenuItem item = entry.getKey();
            int qty = entry.getValue();
            double subtotal = item.getPrice() * qty;
            System.out.println(item.getName() + "\t" + qty + "\t" + subtotal);
            total += subtotal;
        }
        System.out.println("----------------------------------");
        System.out.println("Total\t\t" + orders.size() + "\t" + total);
        System.out.println("1. Konfirmasi dan bayar");
        System.out.println("2. Kembali ke menu utama");
        System.out.println("0. Keluar Aplikasi");

        int choice = getChoice();
        if (choice == 1) {
            saveReceipt(total);
            orders.clear();
            System.out.println("Terima kasih telah melakukan pembayaran!");
        } else if (choice == 2) {
            return;
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }

    private static void saveReceipt(double total) {
        try (FileWriter writer = new FileWriter("receipt.txt")) {
            writer.write("=================\n");
            writer.write("Restaurant Food\n");
            writer.write("=================\n\n");
            writer.write("Terima kasih sudah memesan disini.\nDibawah ini adalah pesanan Anda:\n");
            for (Map.Entry<MenuItem, Integer> entry : orders.entrySet()) {
                MenuItem item = entry.getKey();
                int qty = entry.getValue();
                double subtotal = item.getPrice() * qty;
                writer.write(item.getName() + "\t" + qty + "\t" + subtotal + "\n");
            }
            writer.write("----------------------------------\n");
            writer.write("Total\t\t" + orders.size() + "\t" + total + "\n\n");
            writer.write("Pembayaran: Cash\n\n");
            writer.write("=================\n");
            writer.write("Simpan struk ini sebagai bukti pembayaran\n");
            writer.write("=================");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan dalam menyimpan struk pembayaran.");
            e.printStackTrace();
        }
    }
}
