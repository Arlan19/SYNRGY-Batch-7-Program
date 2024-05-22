package ch2.pertemuan3;

import ch2.pertemuan3.studyCase.FoodItem;
import ch2.pertemuan3.studyCase.Order;

import java.util.ArrayList;
import java.util.List;

public class ListArray {
    public static void main(String[] args) {
//        teman
//        surya, aqilah, habil
        List<String> temanSaya = new ArrayList<>();
        temanSaya.add("surya");// 0
        temanSaya.add("aqilaj ");

        System.out.println(temanSaya.get(0));
        //==================
        // Membuat beberapa item makanan
        FoodItem nasiGoreng = new FoodItem("Nasi Goreng", 25000);
        FoodItem mieGoreng = new FoodItem("Mie Goreng", 20000);
        FoodItem ayamGoreng = new FoodItem("Ayam Goreng", 30000);

        // Membuat objek OrderManager
        ListArray orderManager = new ListArray();

        // Menambahkan beberapa pesanan
        orderManager.addOrder(new Order(nasiGoreng, 2));
        orderManager.addOrder(new Order(mieGoreng, 1));
        orderManager.addOrder(new Order(ayamGoreng, 3));

        // Menampilkan daftar pesanan
        System.out.println("Daftar Pesanan Awal:");
        orderManager.displayOrders();
        System.out.println();

        // Mengupdate pesanan
        Order updatedOrder = new Order(ayamGoreng, 5);
        orderManager.updateOrder(2, updatedOrder);

        // Menampilkan daftar pesanan setelah diupdate
        System.out.println("\nDaftar Pesanan Setelah Update:");
        orderManager.displayOrders();
        System.out.println();

        // Menghapus pesanan
        orderManager.deleteOrder(1);

        // Menampilkan daftar pesanan setelah dihapus
        System.out.println("\nDaftar Pesanan Setelah Hapus:");
        orderManager.displayOrders();

    }

    private static List<Order> orders;

    public ListArray() {
        this.orders = new ArrayList<>();
    }

    // Create (Tambahkan pesanan baru)
    public static void addOrder(Order order) {
        orders.add(order);
    }

    // Read (Tampilkan daftar pesanan)
    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("Tidak ada pesanan.");
        } else {
            System.out.println("Daftar Pesanan:");
            for (Order order : orders) {
                System.out.println(order.getOrderDetails());
            }
        }
    }

    // Update (Ubah pesanan)
    public void updateOrder(int index, Order newOrder) {
        if (index >= 0 && index < orders.size()) {
            orders.set(index, newOrder);
            System.out.println("Pesanan berhasil diperbarui.");
        } else {
            System.out.println("Indeks pesanan tidak valid.");
        }
    }

    // Delete (Hapus pesanan)
    public void deleteOrder(int index) {
        if (index >= 0 && index < orders.size()) {
            orders.remove(index);
            System.out.println("Pesanan berhasil dihapus.");
        } else {
            System.out.println("Indeks pesanan tidak valid.");
        }
    }
}
