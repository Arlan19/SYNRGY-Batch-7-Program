package pertemuan6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

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
        return name + "," + phoneNumber;
    }
}

public class PhoneBookManager {
    private List<Contact> contacts = new ArrayList<>();
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public void addContact(String name, String phoneNumber) {
        Contact newContact = new Contact(name, phoneNumber);
        contacts.add(newContact);
        System.out.println("Kontak telah ditambahkan: " + newContact.getName() + ", " + newContact.getPhoneNumber());
    }

    public void printPhoneBook() {
        System.out.println("Buku Telepon:");
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + ", " + contact.getPhoneNumber());
        }
    }

    public void printPhoneBookHistory() {
        System.out.println("Riwayat Buku Telepon:");
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + ", " + contact.getPhoneNumber() + ", " + getCurrentDateTime());
        }
    }

    public void savePhoneBookToTextFile() {
        String fileName = "phonebook.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Contact contact : contacts) {
                writer.println(contact.toString());
            }
            System.out.println("Buku Telepon telah disimpan dalam file: " + fileName);
        } catch (IOException e) {
            System.err.println("Gagal menyimpan buku telepon ke dalam file: " + fileName);
            e.printStackTrace();
        }
    }

    public void savePhoneBookToCSV() {
        String fileName = "phonebook.csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            StringJoiner joiner = new StringJoiner("\n");
            for (Contact contact : contacts) {
                joiner.add(contact.toString());
            }
            writer.println(joiner.toString());
            System.out.println("Buku Telepon telah disimpan dalam format CSV: " + fileName);
        } catch (IOException e) {
            System.err.println("Gagal menyimpan buku telepon dalam format CSV: " + fileName);
            e.printStackTrace();
        }
    }

    private String getCurrentDateTime() {
        return LocalDateTime.now().format(dateTimeFormatter);
    }

    public static void main(String[] args) {
        PhoneBookManager manager = new PhoneBookManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Kontak");
            System.out.println("2. Cetak Buku Telepon");
            System.out.println("3. Tampilkan Riwayat Buku Telepon");
            System.out.println("4. Cetak Buku Telepon ke CSV");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi yang ingin dilakukan: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama kontak: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon: ");
                    String phoneNumber = scanner.nextLine();
                    manager.addContact(name, phoneNumber);
                    break;
                case 2:
                    manager.printPhoneBook();
                    break;
                case 3:
                    manager.printPhoneBookHistory();
                    break;
                case 4:
                    manager.savePhoneBookToCSV();
                    break;
                case 5:
                    System.out.println("Menutup aplikasi...");
                    manager.savePhoneBookToTextFile();
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}