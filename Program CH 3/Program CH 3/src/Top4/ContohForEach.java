package Top4;

import java.util.Arrays;
import java.util.List;

public class ContohForEach {
    public static void main(String[] args) {
        List<String> word = Arrays.asList("abc", "bcd", "asdf");
        word.stream().forEach(System.out::println);
    }
}
