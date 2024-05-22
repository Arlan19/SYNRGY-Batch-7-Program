package ch1.studicase;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestoranV5 {
    /*
    1. Memesan makanan hanya 1 kali
    2. Memesan makanan lebih dari satu kali
    3. Dengan menambahkan fitur bayar dan uang kembalian
    4. Memesan makanan lebih dari satu.
    5. Dapat menginput Nama Pelangan
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input nama pelanggan
        System.out.print("Masukkan nama pelanggan: ");
        String customerName = scanner.nextLine();

        boolean continueOrdering = true;
        List<String> orders = new ArrayList<>();
        double totalOrderPrice = 0;

        while (continueOrdering) {
            // Menampilkan menu makanan
            System.out.println("\nSelamat datang, " + customerName + "!");
            System.out.println("Silakan pilih menu makanan yang diinginkan:");
            System.out.println("1. Nasi Goreng - Rp 25.000");
            System.out.println("2. Mie Goreng - Rp 20.000");
            System.out.println("3. Ayam Goreng - Rp 30.000");

            // Meminta input dari pengguna untuk memilih menu makanan
            System.out.print("Masukkan nomor menu yang diinginkan: ");
            int menuNumber = scanner.nextInt();

            // Memvalidasi pilihan menu
            double totalPrice = 0;
            String foodName = "";
            switch (menuNumber) {
                case 1:
                    foodName = "Nasi Goreng";
                    totalPrice = 25000;
                    break;
                case 2:
                    foodName = "Mie Goreng";
                    totalPrice = 20000;
                    break;
                case 3:
                    foodName = "Ayam Goreng";
                    totalPrice = 30000;
                    break;
                default:
                    System.out.println("Menu tidak valid!");
                    return;
            }

            // Meminta input dari pengguna untuk jumlah pesanan
            System.out.print("Masukkan jumlah pesanan: ");
            int quantity = scanner.nextInt();

            // Menghitung total harga pesanan
            double orderPrice = totalPrice * quantity;

            // Menambahkan pesanan ke daftar pesanan
            String order = foodName + " - " + quantity + " porsi - Rp " + orderPrice;
            orders.add(order);

            // Menambahkan harga pesanan ke total harga pesanan
            totalOrderPrice += orderPrice;

            // Meminta input dari pengguna untuk memesan lagi
            System.out.print("\nApakah ingin memesan lagi? (ya/tidak): ");
            String answer = scanner.next();
            continueOrdering = answer.equalsIgnoreCase("ya");
        }

        // Menampilkan detail pesanan
        System.out.println("\nDetail Pesanan untuk " + customerName + ":");
        for (String order : orders) {
            System.out.println(order);
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
            for (String order : orders) {
                writer.println(order);
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
