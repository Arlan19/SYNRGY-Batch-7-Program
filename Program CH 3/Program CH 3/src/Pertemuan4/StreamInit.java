package Pertemuan4;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamInit {
    public static void main(String[] args) {
        Stream<String> stream4 = Stream.of("test", "ayya", "oqoq");
        Stream<String> stream5 = Arrays.asList("joko", "tono", "asep").stream();
        stream5.forEach(System.out::println);
        stream4.forEach(System.out::println);
    }
}
