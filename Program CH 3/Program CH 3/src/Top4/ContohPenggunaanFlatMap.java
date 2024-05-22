package Top4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContohPenggunaanFlatMap {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = Arrays.asList("d", "e", "f");

        List<List<String>> listOfList = Arrays.asList(list1, list2);
        List<String> listOfString = listOfList.stream().flatMap(p -> p.stream()).collect(Collectors.toList());

        System.out.println(listOfList);
        System.out.println(listOfString);

    }
}
