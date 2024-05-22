package Challenge.Example10;

import java.util.ArrayList;
import java.util.List;

abstract class Order {
    protected List<OrderItem> items = new ArrayList<>();

    public void addItem(OrderItem item){
        items.add(item);
    }
    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public double getTotalPrice(){
        double total = 0;
        for (OrderItem item : items){
            total += item.getTotalPrice();
        }
        return total;
    }

    public abstract void displayOrder();
}
