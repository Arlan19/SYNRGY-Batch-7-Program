package Top4.CobaLatihan;

public class MenuItem extends Item {

    public MenuItem(String name, double price) {
        super(name, price);
    }

    @Override
    public String displayDetails() {
        return name.orElseGet(() -> "Unknown") + "\t | \tRp. " + price;
    }
}
