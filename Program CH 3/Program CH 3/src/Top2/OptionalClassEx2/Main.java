package Top2.OptionalClassEx2;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jhon Due", Optional.empty());
        Person person2 = new Person("Jane Smith", Optional.of(30));

        System.out.println("Informasi Person 1:");
        System.out.println("Nama : " + person1.getName());
        System.out.println("Umur : " + (person1.getAge().isPresent() ? person1.getAge().get() : "Tidak Diketahui"));

        System.out.println("Informasi Person 2:");
        System.out.println("Nama : " + person2.getName());
        System.out.println("Umur : " + (person2.getAge().isPresent() ? person2.getAge().get() : "Tidak Diketahui"));
    }
}
