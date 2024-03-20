package Pertemuan4;

import java.util.Objects;

public class EqualsEX {
    public static void main(String[] args) {
        String value= "123";
        System.out.println(value.equals("12tiga"));
        System.out.println(value.equals("123"));
        System.out.println("===================");
        Integer val = 123;
        System.out.println(val.equals(123));
        System.out.println(val.equals(12345));
        System.out.println("===================");
        System.out.println(Objects.equals("123","123"));
        System.out.println(Objects.equals(123,456));
    }
}
