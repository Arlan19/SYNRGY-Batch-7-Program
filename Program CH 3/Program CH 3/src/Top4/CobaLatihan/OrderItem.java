package Top4.CobaLatihan;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderItem {
    private MenuItem menuItem;
    private Integer quantity;
    public double getTotalPrice(){
        return menuItem.getPrice() * quantity;
    }
}
