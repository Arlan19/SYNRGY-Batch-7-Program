package Top4.ContohOrdering;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ContohOrder {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Abu" , "Abi", "Abas");

        List<String> sortedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        sortedList.forEach(System.out::println);
    }
}
