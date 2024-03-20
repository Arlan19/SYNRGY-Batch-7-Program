package Challenge;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChallengeEx2 {
    static Map<String, Integer> pesanan = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#,###");

    public static void main(String[] args) {
        boolean exit = false;

        System.out.println("===================");
        System.out.println("   Selamat Datang   ");
        System.out.println("===================");

        while (!exit) {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Pesan Makanan");
            System.out.println("2. Keluar Aplikasi");

            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    pesanMakanan();
                    break;
                case 2:
                    exit = true;
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }

        System.out.println("Terima kasih telah menggunakan layanan kami!");
    }

    public static void pesanMakanan() {
        boolean selesai = false;

        while (!selesai) {
            System.out.println("\nSilahkan Pilih Makanan:");
            System.out.println("1. Nasi Goreng    | 15.000");
            System.out.println("2. Mie Goreng    | 13.000");
            System.out.println("3. Es Jeruk           | 5.000");
            System.out.println("99. Pesan dan Bayar");
            System.out.println("0. Kembali ke Menu Utama");

            System.out.print("Pilih menu makanan: ");
            int foodChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (foodChoice) {
                case 1:
                    pesan("Nasi Goreng", 15000);
                    break;
                case 2:
                    pesan("Mie Goreng", 13000);
                    break;
                case 3:
                    pesan("Es Jeruk", 5000);
                    break;
                case 99:
                    selesai = true;
                    konfirmasiPembayaran();
                    break;
                case 0:
                    selesai = true;
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
    }

    public static void pesan(String foodName, int price) {
        System.out.println("\n================");
        System.out.println("Berapa Pesanan Anda");
        System.out.println("================");
        System.out.println(foodName + "\t| " + df.format(price));
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
            pesanan.put(foodName, pesanan.getOrDefault(foodName, 0) + qty);
            System.out.println("Pesanan " + foodName + " sebanyak " + qty + " telah ditambahkan.");
        } else {
            System.out.println("Pemesanan " + foodName + " dibatalkan.");
        }
    }

    public static void konfirmasiPembayaran() {
        System.out.println("\n=======================");
        System.out.println("Konfirmasi & Pembayaran");
        System.out.println("=======================");

        double totalHarga = 0;

        for (Map.Entry<String, Integer> entry : pesanan.entrySet()) {
            String foodName = entry.getKey();
            int quantity = entry.getValue();
            int hargaPerItem = getHargaPerItem(foodName);
            double totalPerItem = hargaPerItem * quantity;
            System.out.println(foodName + "\t" + quantity + "\t" + df.format(totalPerItem));
            totalHarga += totalPerItem;
        }

        System.out.println("----------------------------------");
        System.out.println("Total\t\t" + pesanan.size() + "\t" + df.format(totalHarga));

        System.out.println("\n1. Konfirmasi dan Bayar");
        System.out.println("2. Kembali ke Menu Utama");
        System.out.println("0. Keluar Aplikasi");

        System.out.print("=> ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                simpanStruk(totalHarga);
                break;
            case 2:
                pesanan.clear();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Menu tidak valid.");
        }
    }

    public static int getHargaPerItem(String foodName) {
        switch (foodName) {
            case "Nasi Goreng":
                return 15000;
            case "Mie Goreng":
                return 13000;
            case "Es Jeruk":
                return 5000;
            default:
                return 0;
        }
    }

    public static void simpanStruk(double totalHarga) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("struk_pembayaran.txt"))) {
            writer.write("==============");
            writer.newLine();
            writer.write("Restaurant Food");
            writer.newLine();
            writer.write("==============");
            writer.newLine();
            writer.newLine();
            writer.write("Terimakasih sudah memesan disini");
            writer.newLine();
            writer.write("Dibawah ini adalah pesanan Anda");
            writer.newLine();

            for (Map.Entry<String, Integer> entry : pesanan.entrySet()) {
                String foodName = entry.getKey();
                int quantity = entry.getValue();
                int hargaPerItem = getHargaPerItem(foodName);
                double totalPerItem = hargaPerItem * quantity;
                writer.write(foodName + "\t" + quantity + "\t" + df.format(totalPerItem));
                writer.newLine();
            }

            writer.write("----------------------------------");
            writer.newLine();
            writer.write("Total\t\t" + pesanan.size() + "\t" + df.format(totalHarga));
            writer.newLine();
            writer.newLine();
            writer.write("Pembayaran: Cash");
            writer.newLine();
            writer.newLine();
            writer.write("=================");
            writer.newLine();
            writer.write("Simpan struk ini sebagai bukti pembayaran");
            writer.newLine();
            writer.write("=================");
            writer.newLine();

            System.out.println("Struk pembayaran telah disimpan sebagai struk_pembayaran.txt");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan struk pembayaran.");
            e.printStackTrace();
        }
    }
}
