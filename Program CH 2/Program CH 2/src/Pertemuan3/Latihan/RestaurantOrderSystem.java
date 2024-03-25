package Pertemuan3.Latihan;

import java.util.HashMap;

public class RestaurantOrderSystem {
    private HashMap<String, Integer> orders;

    public RestaurantOrderSystem() {
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
        RestaurantOrderSystem orderSystem = new RestaurantOrderSystem();


        // Create
        orderSystem.addOrder("Nasi Goreng", 1);
        orderSystem.addOrder("Es Teh", 2);

        // Read
        orderSystem.displayOrders();

        // Update
        orderSystem.updateOrder("Ayam Goreng", 1);

        // Delete
        orderSystem.cancelOrder("Es Teh");

        // Total Harga Pesanan
        double totalPrice = orderSystem.calculateTotalPrice();
        System.out.println("Total Harga Pesanan: Rp" + totalPrice);
    }
}
