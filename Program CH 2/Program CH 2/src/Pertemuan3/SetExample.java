package Pertemuan3;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("nasi goreng");
        names.add("aldi");
        names.add("nasi goreng");

        for(String name : names){
            System.out.println(name);
        }
    }
}
