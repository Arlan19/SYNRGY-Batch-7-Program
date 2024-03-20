package Pertemuan1.ExLatihan3;

import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            restaurant.displayMenu();
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    restaurant.placeOrder(choice);
                    break;
                case 99:
                    restaurant.displayBill();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }

        System.out.println("Terima kasih telah menggunakan layanan kami!");
        scanner.close();
    }
}
