package ch1.pertemuan6;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    private static final String PHONE_BOOK_FILE = "phonebook.txt";
    private static final String CSV_FILE = "phonebook.csv";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> phoneBook = new ArrayList<>();

        // Memeriksa apakah file phonebook.txt sudah ada, jika belum, maka buat file tersebut
        if (!fileExists(PHONE_BOOK_FILE)) {
            createFile(PHONE_BOOK_FILE);
        } else {
            phoneBook = loadPhoneBook();
        }

        while (true) {
            System.out.println("=== Aplikasi Buku Telepon ===");
            System.out.println("1. Tambah Kontak");
            System.out.println("2. Cetak Buku Telepon");
            System.out.println("3. Tampilkan Riwayat Buku Telepon");
            System.out.println("4. Cetak ke CSV");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addContact(scanner, phoneBook);
                    break;
                case 2:
                    printPhoneBook(phoneBook);
                    break;
                case 3:
                    displayHistory(phoneBook);
                    break;
                case 4:
                    printToCSV(phoneBook);
                    break;
                case 5:
                    savePhoneBook(phoneBook);
                    System.out.println("Terima kasih! Aplikasi selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }

    private static boolean fileExists(String fileName) {
        File file = new File(fileName);
        return file.exists();
    }

    private static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File " + fileName + " berhasil dibuat.");
            } else {
                System.out.println("File " + fileName + " sudah ada.");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menciptakan file: " + e.getMessage());
        }
    }

    private static ArrayList<Contact> loadPhoneBook() {
        ArrayList<Contact> phoneBook = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(PHONE_BOOK_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0];
                    String phoneNumber = parts[1];
                    phoneBook.add(new Contact(name, phoneNumber));
                }
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca buku telepon: " + e.getMessage());
        }
        return phoneBook;
    }

    private static void addContact(Scanner scanner, ArrayList<Contact> phoneBook) {
        System.out.print("Masukkan Nama: ");
        String name = scanner.next();
        System.out.print("Masukkan Nomor Telepon: ");
        String phoneNumber = scanner.next();
        phoneBook.add(new Contact(name, phoneNumber));
        System.out.println("Kontak berhasil ditambahkan.");
    }

    private static void printPhoneBook(ArrayList<Contact> phoneBook) {
        System.out.println("=== Buku Telepon ===");
        for (Contact contact : phoneBook) {
            System.out.println(contact);
        }
        System.out.println("===================");
    }

    private static void displayHistory(ArrayList<Contact> phoneBook) {
        System.out.println("=== Riwayat Buku Telepon ===");
        for (Contact contact : phoneBook) {
            System.out.println(contact.getName() + ": " + contact.getPhoneNumber());
        }
        System.out.println("============================");
    }

    private static void savePhoneBook(ArrayList<Contact> phoneBook) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PHONE_BOOK_FILE))) {
            for (Contact contact : phoneBook) {
                writer.write(contact.getName() + "," + contact.getPhoneNumber());
                writer.newLine();
            }
            System.out.println("Buku telepon berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan buku telepon: " + e.getMessage());
        }
    }

    private static void printToCSV(ArrayList<Contact> phoneBook) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_FILE))) {
            writer.write("Nama,Nomor Telepon");
            writer.newLine();
            for (Contact contact : phoneBook) {
//                writer.write(contact.getName() + "," + contact.getPhoneNumber());
                StringJoiner joiner = new StringJoiner(",");
                joiner.add(contact.getName()).add(contact.getPhoneNumber());
                writer.write(joiner.toString());

                writer.newLine();
            }
            System.out.println("Buku telepon berhasil dicetak ke dalam file CSV.");
        } catch (IOException e) {
            System.out.println("Gagal mencetak ke file CSV: " + e.getMessage());
        }
    }
}

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return name + ": " + phoneNumber;
    }
}

