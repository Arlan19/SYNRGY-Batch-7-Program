package ch2.pertemuan1OOP.studyCase;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restoran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input nama pelanggan
        System.out.print("Masukkan nama pelanggan: ");
        String customerName = scanner.nextLine();

        boolean continueOrdering = true;
        List<Order> orders = new ArrayList<>();
        double totalOrderPrice = 0;

        // Daftar menu makanan
        FoodItem[] menu = {
                new FoodItem("Nasi Goreng", 25000),
                new FoodItem("Mie Goreng", 20000),
                new FoodItem("Ayam Goreng", 30000)
        };

        while (continueOrdering) {
            // Menampilkan menu makanan
            System.out.println("\nSelamat datang, " + customerName + "!");
            System.out.println("Silakan pilih menu makanan yang diinginkan:");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i].getName() + " - Rp " + menu[i].getPrice());
            }

            // Meminta input dari pengguna untuk memilih menu makanan
            System.out.print("Masukkan nomor menu yang diinginkan: ");
            int menuNumber = scanner.nextInt();

            // Memvalidasi pilihan menu
            if (menuNumber < 1 || menuNumber > menu.length) {
                System.out.println("Menu tidak valid!");
                return;
            }

            // Meminta input dari pengguna untuk jumlah pesanan
            System.out.print("Masukkan jumlah pesanan: ");
            int quantity = scanner.nextInt();

            // Membuat objek Order
            Order order = new Order(menu[menuNumber - 1], quantity);
            orders.add(order);

            // Menambahkan harga pesanan ke total harga pesanan
            totalOrderPrice += order.getOrderPrice();

            // Meminta input dari pengguna untuk memesan lagi
            System.out.print("\nApakah ingin memesan lagi? (ya/tidak): ");
            String answer = scanner.next();
            continueOrdering = answer.equalsIgnoreCase("ya");
        }

        // Menampilkan detail pesanan
        System.out.println("\nDetail Pesanan untuk " + customerName + ":");
        for (Order order : orders) {
            System.out.println(order.getOrderDetails());
        }
        System.out.println("Total Harga: Rp " + totalOrderPrice);

        // Meminta input dari pengguna untuk pembayaran
        System.out.print("Masukkan jumlah uang pembayaran: Rp ");
        double paymentAmount = scanner.nextDouble();

        // Menghitung uang kembalian
        double changeAmount = paymentAmount - totalOrderPrice;
        if (changeAmount >= 0) {
            System.out.println("Uang Kembalian: Rp " + changeAmount);
        } else {
            System.out.println("Uang pembayaran tidak mencukupi!");
            return;
        }

        // Menulis struk pembelian ke file teks
        try (PrintWriter writer = new PrintWriter(new FileWriter("struk_pembelian.txt", true))) {
            writer.println("\nDetail Pesanan untuk " + customerName + ":");
            for (Order order : orders) {
                writer.println(order.getOrderDetails());
            }
            writer.println("Total Harga: Rp " + totalOrderPrice);
            writer.println("Uang Pembayaran: Rp " + paymentAmount);
            writer.println("Uang Kembalian: Rp " + changeAmount);
            System.out.println("Struk pembelian telah disimpan dalam file struk_pembelian.txt");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan struk pembelian ke file.");
            e.printStackTrace();
        }

        System.out.println("Terima kasih telah menggunakan layanan kami!");
    }
}
