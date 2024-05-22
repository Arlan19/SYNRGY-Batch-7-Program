package ch1.studicase;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RestoranV3 {
    /*
    1. Memesan makanan hanya 1 kali
    2. Memesan makanan lebih dari satu kali
    3. Dengan menambahkan fitur bayar dan uang kembalian
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueOrdering = true;
        while (continueOrdering) {
            // Menampilkan menu makanan
            System.out.println("Selamat datang di program pemesanan makanan online!");
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
            double totalOrderPrice = totalPrice * quantity;

            // Menampilkan detail pesanan
            System.out.println("\nDetail Pesanan:");
            System.out.println("Menu: " + foodName);
            System.out.println("Jumlah: " + quantity);
            System.out.println("Total Harga: Rp " + totalOrderPrice);

            // Meminta input dari pengguna untuk pembayaran
            System.out.print("Masukkan jumlah uang pembayaran: Rp ");
            double paymentAmount = scanner.nextDouble();

            // Menghitung uang kembalian
            double change = paymentAmount - totalOrderPrice;
            if (change >= 0) {
                System.out.println("Uang Kembalian: Rp " + change);
            } else {
                System.out.println("Uang pembayaran tidak mencukupi!");
                return;
            }

            // Menulis struk pembelian ke file teks
            try (PrintWriter writer = new PrintWriter(new FileWriter("struk_pembelian.txt", true))) {
                writer.println("\nDetail Pesanan:");
                writer.println("Menu: " + foodName);
                writer.println("Jumlah: " + quantity);
                writer.println("Total Harga: Rp " + totalOrderPrice);
                writer.println("Uang Pembayaran: Rp " + paymentAmount);
                writer.println("Uang Kembalian: Rp " + change);
                System.out.println("Struk pembelian telah disimpan dalam file struk_pembelian.txt");
            } catch (IOException e) {
                System.out.println("Gagal menyimpan struk pembelian ke file.");
                e.printStackTrace();
            }

            // Meminta input dari pengguna untuk memesan lagi
            System.out.print("\nApakah ingin memesan lagi? (ya/tidak): ");
            String answer = scanner.next();
            continueOrdering = answer.equalsIgnoreCase("ya");
        }

        System.out.println("Terima kasih telah menggunakan layanan kami!");
    }
}
