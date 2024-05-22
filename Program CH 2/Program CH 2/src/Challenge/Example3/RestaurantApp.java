package Challenge.Example3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class RestaurantApp {
    public static void main(String[] args) {
        MenuController controller = new MenuController();
        MenuView view = new MenuView();
        Scanner scanner = new Scanner(System.in);
        HashMap<MenuItem, Integer> orderItems = new HashMap<>();
        double total = 0;

        while (true) {
            view.displayMenu(controller.getMenuItems());
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Terima kasih, keluar dari aplikasi.");
                break;
            } else if (choice == 99) {
                // Process order and payment
                view.displayOrderSummary(orderItems, total);
                System.out.print("Pilihan Anda: ");
                int option = scanner.nextInt();
                if (option == 1) {
                    view.displayPaymentReceipt(orderItems, total, "Cash");
                    // Save receipt to file
                    try {
                        FileWriter writer = new FileWriter("receipt.txt");
                        writer.write("Restaurant Food\n");
                        writer.write("=====================\n");
                        for (MenuItem item : orderItems.keySet()) {
                            int quantity = orderItems.get(item);
                            writer.write(item.getName() + "\t" + quantity + "\t" + item.getPrice() * quantity + "\n");
                        }
                        writer.write("---------------------------------\n");
                        writer.write("Total\t\t\t" + total + "\n\n");
                        writer.write("Pembayaran: Cash\n");
                        writer.write("=====================\n");
                        writer.close();
                        System.out.println("Struk pembayaran disimpan sebagai 'receipt.txt'.");
                    } catch (IOException e) {
                        view.displayErrorMessage("Gagal menyimpan struk pembayaran.");
                    }
                    // Reset order
                    orderItems.clear();
                    total = 0;
                    view.displayContinueOption();
                    String input = scanner.next();
                    if (!input.equalsIgnoreCase("Y")) {
                        System.out.println("Keluar dari aplikasi.");
                        break;
                    }
                } else if (option == 2) {
                    continue;
                } else if (option == 0) {
                    System.out.println("Terima kasih, keluar dari aplikasi.");
                    break;
                } else {
                    view.displayErrorMessage("Pilihan tidak valid.");
                }
            } else if (controller.getMenuItems().containsKey(choice)) {
                MenuItem menuItem = controller.getMenuItems().get(choice);
                view.displayOrderConfirmation(menuItem.getName(), menuItem.getPrice(), 0);
                int qty = scanner.nextInt();
                if (qty == 0) {
                    continue;
                } else if (qty < 0) {
                    view.displayErrorMessage("Input tidak valid.");
                    continue;
                }
                orderItems.put(menuItem, qty);
                total += menuItem.getPrice() * qty;
            } else {
                view.displayErrorMessage("Pilihan tidak valid.");
            }
        }
    }
}
