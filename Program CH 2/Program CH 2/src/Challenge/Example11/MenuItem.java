package Challenge.Example11;

public class MenuItem extends Item {

    public MenuItem(String name, double price) {
        super(name, price);
    }

    @Override
    public String displayDetails() {
        return name + "\t" + price;
    }
}
