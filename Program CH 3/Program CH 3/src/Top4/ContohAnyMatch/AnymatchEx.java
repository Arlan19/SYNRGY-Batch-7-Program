package Top4.ContohAnyMatch;

import java.util.Arrays;
import java.util.List;

public class AnymatchEx {
    public static void main(String[] args) {
        List<String> word = Arrays.asList("abc", "bcd", "asdf");
        boolean anymatch = word.stream().anyMatch(p -> p.length() <= 3);

        System.out.println(anymatch);
    }
}
