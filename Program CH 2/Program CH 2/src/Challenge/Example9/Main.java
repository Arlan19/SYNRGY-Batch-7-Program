package Challenge.Example9;

import java.util.*;

// Abstract class representing an item
// Abstract class representing an item
abstract class Item {
    protected String name;
    protected double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Abstract method to display details of the item
    public abstract String displayDetails();
}

// Concrete class representing a menu item
class MenuItem extends Item {
    public MenuItem(String name, double price) {
        super(name, price);
    }

    // Override abstract method to display details of the menu item
    @Override
    public String displayDetails() {
        return name + "\t" + price;
    }
}

// Concrete class representing an order item
class OrderItem {
    private MenuItem menuItem;
    private int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return menuItem.getPrice() * quantity;
    }
}

// Abstract class representing an order
abstract class Order {
    protected List<OrderItem> items = new ArrayList<>();

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double getTotalPrice() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    // Abstract method to display order details
    public abstract void displayOrder();
}

// Concrete class representing a specific order
class RestaurantOrder extends Order {
    @Override
    public void displayOrder() {
        System.out.println("===================");
        System.out.println("Konfirmasi & Pembayaran");
        System.out.println("===================");
        for (OrderItem item : items) {
            System.out.println(item.getMenuItem().getName() + "\t" + item.getQuantity() + "\t" + item.getTotalPrice());
        }
        System.out.println("-----------------------------------");
        System.out.println("Total\t\t\t" + getTotalPrice());
    }
}

// View
class MenuView {
    public void displayMenu(Map<Integer, MenuItem> menu) {
        System.out.println("===================");
        System.out.println("Selamat datang");
        System.out.println("===================");
        System.out.println("Silahkan pilih makanan:");
        for (Map.Entry<Integer, MenuItem> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue().displayDetails());
        }
        System.out.println("99. Pesan dan Bayar");
        System.out.println("0. Keluar Aplikasi");
    }

    public void displayOrder(RestaurantOrder order) {
        order.displayOrder(); // Panggil metode displayOrder() langsung dari objek RestaurantOrder
    }

    public void displayReceipt(Order order, String paymentMethod) {
        System.out.println("===================");
        System.out.println("Restaurant Foof");
        System.out.println("===================");
        System.out.println("Terimakasih sudah memesan disini");
        System.out.println("Dibawah ini adalah pesanan anda");
        for (OrderItem item : order.getItems()) {
            System.out.println(item.getMenuItem().getName() + "\t" + item.getQuantity() + "\t" + item.getTotalPrice());
        }
        System.out.println("-----------------------------------");
        System.out.println("Total\t\t\t" + order.getTotalPrice());
        System.out.println("Pembayaran: " + paymentMethod);
        System.out.println("===================");
        System.out.println("Simpan struk ini sebagai bukti pembayaran");
        System.out.println("===================");
    }

    public int displayConfirmation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================");
        System.out.println("1. Konfirmasi dan Bayar");
        System.out.println("2. Kembali ke Menu Utama");
        System.out.println("0. Keluar Aplikasi");
        System.out.print("Pilihan Anda: ");
        return scanner.nextInt();
    }
}

// Controller
class RestaurantController {
    private MenuView menuView;
    private Map<Integer, MenuItem> menu;
    private Scanner scanner;

    public RestaurantController() {
        menuView = new MenuView();
        menu = new HashMap<>();
        scanner = new Scanner(System.in);
        initializeMenu();
    }

    private void initializeMenu() {
        menu.put(1, new MenuItem("Nasi Goreng", 15000));
        menu.put(2, new MenuItem("Mie Goreng", 13000));
        menu.put(3, new MenuItem("Nasi + Ayam", 18000));
        menu.put(4, new MenuItem("Es Teh Manis", 3000));
        menu.put(5, new MenuItem("Es Jeruk", 5000));
    }

    public void run() {
        RestaurantOrder order = new RestaurantOrder();
        boolean running = true;
        while (running) {
            try {
                menuView.displayMenu(menu);
                System.out.print("Pilihan Anda: ");
                int choice = scanner.nextInt();
                if (choice == 0) {
                    System.out.println("Keluar dari aplikasi.");
                    running = false;
                } else if (choice == 99) {
                    processOrder(order);
                    running = false;
                } else if (menu.containsKey(choice)) {
                    processItemOrder(order, menu.get(choice));
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Masukkan harus berupa angka.");
                scanner.nextLine();
            }
        }
    }

    private void processItemOrder(RestaurantOrder order, MenuItem menuItem) {
        System.out.println("===================");
        System.out.println("Berapa pesanan Anda?");
        System.out.print("Qty: ");
        int qty = scanner.nextInt();
        if (qty > 0) {
            order.addItem(new OrderItem(menuItem, qty));
        } else {
            System.out.println("Jumlah pesanan harus lebih dari 0.");
        }
    }

    private void processOrder(RestaurantOrder order) {
        menuView.displayOrder(order);
        int choice = menuView.displayConfirmation();
        if (choice == 1) {
            completeOrder(order);
        } else if (choice == 2) {
            order.getItems().clear();
        } else {
            System.out.println("Keluar dari aplikasi.");
        }
    }

    private void completeOrder(RestaurantOrder order) {
        scanner.nextLine(); // consume newline
        System.out.print("Metode pembayaran (Cash/Card): ");
        String paymentMethod = scanner.nextLine();
        menuView.displayReceipt(order, paymentMethod);
    }
}

public class Main {
    public static void main(String[] args) {
        RestaurantController controller = new RestaurantController();
        controller.run();
    }
}