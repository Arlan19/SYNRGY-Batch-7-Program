package ch2.pertemuan3.studyCase;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Order {
    private FoodItem foodItem;
    private int quantity;

    public Order(FoodItem foodItem, int quantity) {
        this.foodItem = foodItem;
        this.quantity = quantity;
    }

    public double getOrderPrice() {
        return foodItem.getPrice() * quantity;
    }

    public String getOrderDetails() {
        return foodItem.getName() + " - " + quantity + " porsi - Rp " + getOrderPrice();
    }
}
