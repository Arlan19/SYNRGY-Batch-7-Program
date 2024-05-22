package Challenge.Example11;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderItem {
    private MenuItem menuItem;
    private int quatity;


    public double getTotalPrice(){
        return menuItem.getPrice() * quatity;
    }
}
