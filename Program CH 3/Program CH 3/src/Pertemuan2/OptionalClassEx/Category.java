package Pertemuan2.OptionalClassEx;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;

@Data
@AllArgsConstructor
public class Category {
    private String name;
    private Optional<CategoryType> categoryType;
}
