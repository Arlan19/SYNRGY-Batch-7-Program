package Pertemuan2.Latihan;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;

@Data
abstract class Item {
    protected Optional<String> name;
    protected double price;

    public Item(String name, double price) {
        this.name = Optional.ofNullable(name);
        this.price = price;
    }

    public abstract String displayDetails();
}
