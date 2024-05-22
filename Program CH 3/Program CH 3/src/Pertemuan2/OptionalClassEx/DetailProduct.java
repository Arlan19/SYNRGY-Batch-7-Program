package Pertemuan2.OptionalClassEx;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;

@Data
@AllArgsConstructor
public class DetailProduct {
    private String description;

    private Optional<Category> category;
}
