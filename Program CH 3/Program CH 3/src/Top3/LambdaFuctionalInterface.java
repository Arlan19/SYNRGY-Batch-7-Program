package Top3;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaFuctionalInterface {
    public static void main(String[] args) {
//        Consumer
        Consumer<String> consumer = t -> System.out.println(t);
        consumer.accept("Aku adalah consumer!");

//        Biconsumer
        BiConsumer<String, Integer> biConsumer = (t,u) -> System.out.println("Harga " + t + " Rp. " + u);
        biConsumer.accept("Course Backend Java", 50_000_000);

//        Supplier
        Supplier<String> supplier = () -> "Aku adalah supplier";
        System.out.println(supplier.get());

    }
}
