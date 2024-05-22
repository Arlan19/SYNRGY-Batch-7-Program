package Pertemuan4.sample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodOrder {
    private String foodName;
    private double price;
    private int quantity;
}
