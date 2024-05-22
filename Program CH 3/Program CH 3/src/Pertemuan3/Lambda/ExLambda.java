package Pertemuan3.Lambda;

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ExLambda {
    public static void main(String[] args) {
//        1. lambda tampa parameter
        Runnable runnable = () -> {
            System.out.println("Hello World!");
        };
        runnable.run();

        Optional<String> optionalValueGet = Optional.ofNullable(null);
        String value = optionalValueGet.orElseGet(() -> "Default Value");

//        return value yang kita set
        Supplier<Integer> integerLambda = () -> 1;

//        cara mendapatkan value supplier
        System.out.println(integerLambda.get());

        //    2. lambda 1 parameter

        Consumer<String> myName = (myname) -> System.out.println(myname);

        myName.accept("tst");

        //3. Lamda 2 parameter
        BiConsumer<Integer, Integer> sample1 = (x, y) -> System.out.println("nilai x + y="+(x+y));
        BiConsumer<Integer, Integer> sample2 = (x,y)->{
            System.out.println("nilai ke 2 x + y="+(x+y));
        };
        sample1.accept(1,1);
        sample2.accept(1,2);
    }


}
