package Challenge.Example4;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items = new ArrayList<>();

    public void addItem(OrderItem item){
        items.add(item);
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double getTotalPrice(){
        double total = 0;
        for (OrderItem item : items){
            total += item.getTotalPrice();
        }
        return total;
    }
}
