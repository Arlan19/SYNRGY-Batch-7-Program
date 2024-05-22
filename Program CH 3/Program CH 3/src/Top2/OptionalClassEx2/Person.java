package Top2.OptionalClassEx2;

import lombok.Data;

import java.util.Optional;

@Data
public class Person {
    private String name;
    private Optional<Integer> age;

    public Person(String name, Optional<Integer> age) {
        this.name = name;
        this.age = age;
    }
}
