package Pertemuan3.Latihan;

import java.util.HashMap;
import java.util.Scanner;

public class RestaurantOrderSystem2 {
    private HashMap<String, Integer> orders;

    public static boolean exit = false;

    public static RestaurantOrderSystem2 orderSystem = new RestaurantOrderSystem2();

    static Scanner scanner = new Scanner(System.in);

    public RestaurantOrderSystem2() {
        this.orders = new HashMap<>();
    }

    public void addOrder(String item, int quantity) {
        if (orders.containsKey(item)) {
            int currentQuantity = orders.get(item);
            orders.put(item, currentQuantity + quantity);
        } else {
            orders.put(item, quantity);
        }
        System.out.println("Pesanan " + item + " sebanyak " + quantity + " berhasil ditambahkan.");
    }

    public void displayOrders() {
        System.out.println("Daftar Pesanan:");
        for (String item : orders.keySet()) {
            int quantity = orders.get(item);
            System.out.println(item + ": " + quantity);
        }
    }

    public void updateOrder(String item, int additionalQuantity) {
        if (orders.containsKey(item)) {
            int currentQuantity = orders.get(item);
            orders.put(item, currentQuantity + additionalQuantity);
            System.out.println("Pesanan " + item + " berhasil diperbarui.");
        } else {
            System.out.println("Pesanan " + item + " tidak ditemukan.");
        }
    }

    public void cancelOrder(String item) {
        if (orders.containsKey(item)) {
            orders.remove(item);
            System.out.println("Pesanan " + item + " berhasil dibatalkan.");
        } else {
            System.out.println("Pesanan " + item + " tidak ditemukan.");
        }
    }


    public double calculateTotalPrice() {
        double totalPrice = 0;
        HashMap<String, Double> itemPrices = new HashMap<>();
        itemPrices.put("Nasi Goreng", 15000.0);
        itemPrices.put("Ayam Goreng", 20000.0);
        itemPrices.put("Es Teh", 5000.0);

        for (String item : orders.keySet()) {
            int quantity = orders.get(item);
            double price = itemPrices.get(item);
            totalPrice += price * quantity;
        }
        return totalPrice;
    }

    public static void main(String[] args) {

        while (!exit){
            System.out.println("====================================");
            System.out.println("Selamat Datang di B Group Restaurant");
            System.out.println("====================================");

            System.out.println("\nSilahkan Pilih Menu:");
            System.out.println("1. Pesan Makanan");
            System.out.println("2. Daftar Pesanan");
            System.out.println("3. Total");
            System.out.println("0. Batalkan");

            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            

            switch (choice) {
                case 1:
                    pesanMakanan();
                    break;
                case 2:
                    daftarPesanan();
                    break;
                case 3:
                    totalPesanan();
                    exit = true;
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }


//        // Create
//        orderSystem.addOrder("Nasi Goreng", 1);
//        orderSystem.addOrder("Es Teh", 2);
//
//        // Read
//        orderSystem.displayOrders();
//
//        // Update
//        orderSystem.updateOrder("Ayam Goreng", 1);
//
//        // Delete
//        orderSystem.cancelOrder("Es Teh");
//
//        // Total Harga Pesanan
//        double totalPrice = orderSystem.calculateTotalPrice();
//        System.out.println("Total Harga Pesanan: Rp" + totalPrice);
    }

    private static void totalPesanan() {
        double totalPrice = orderSystem.calculateTotalPrice();
        System.out.println("Total Harga Pesanan: Rp" + totalPrice);
    }

    private static void daftarPesanan() {
        orderSystem.displayOrders();
        System.out.println("\nApkah ingin menghapus pesanan Hapus Pesanan:");
        System.out.println("1. Untuk menghapus Nasi Goreng");
        System.out.println("2. Untuk menghapus Es Teh");
        System.out.println("0. Batalkan");

        System.out.print("Pilih menu: ");
        int pilihPesanan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihPesanan) {
            case 1:
                orderSystem.cancelOrder("Nasi Goreng");
                break;
            case 2:
                orderSystem.cancelOrder("Es Teh");
                break;
            case 0:
                break;
            default:
                System.out.println("Menu tidak valid.");
        }
    }

    private static void pesanMakanan() {

        System.out.println("====================================");
        System.out.println("Selamat Datang di B Group Restaurant");
        System.out.println("====================================");

        System.out.println("\nSilahkan Pilih Menu:");
        System.out.println("1. Nasi Goreng \t | \t Rp. 18.000");
        System.out.println("2. Es Teh \t | \t Rp. 5.000");
        System.out.println("0. Batalkan");

        System.out.print("Pilih menu: ");
        int pilihMenu = scanner.nextInt();
        scanner.nextLine();

        switch (pilihMenu) {
            case 1:
                orderSystem.addOrder("Nasi Goreng", 1);
                break;
            case 2:
                orderSystem.addOrder("Es Teh", 1);
                break;
            case 0:
                exit = true;
                break;
            default:
                System.out.println("Menu tidak valid.");
        }
    }
}
