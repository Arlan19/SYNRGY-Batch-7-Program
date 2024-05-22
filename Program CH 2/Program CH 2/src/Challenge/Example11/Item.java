package Challenge.Example11;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
abstract class Item {
    protected String name;
    protected double price;

    public abstract String displayDetails();
}
