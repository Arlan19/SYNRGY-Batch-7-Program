package Top4.ContohPenggunaanMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ContohMencariNilaiMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 7, 2, 8, 5);

//        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
//
//        if (max.isPresent()){
//            System.out.println("Nilai Maxsimum : " + max.get());
//        } else {
//            System.out.println("tidak ada nilai maximum");
//        }

        Optional<Integer> maxOptional = numbers.stream().max(Comparator.comparing(Integer::intValue));
        maxOptional.ifPresent(e -> System.out.println("Max : " + e));
    }
}
