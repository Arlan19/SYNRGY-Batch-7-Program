package Top2.OptionalClassEx;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Optional dengan nilai null
        Optional<String> nullableOptional = Optional.empty();

        // Membuat objek Optional dengan nilai yang tidak null
        String nonNullValue = "Nilai tidak null";
        Optional<String> nonNullableOptional = Optional.of(nonNullValue);

        // Mengambil nilai dari Optional jika ada
        if (nullableOptional.isPresent()) {
            String value = nullableOptional.get();
            System.out.println("Nilai dari Optional yang nullable: " + value);
        } else {
            System.out.println("Optional nullable tidak memiliki nilai.");
        }

        // Menggunakan metode orElse() untuk mendapatkan nilai default jika Optional kosong
        String valueOrDefault = nullableOptional.orElse("Nilai default");
        System.out.println("Nilai dari Optional yang nullable atau default: " + valueOrDefault);

        // Menggunakan metode ifPresent() untuk melakukan sesuatu jika nilai ada
        nonNullableOptional.ifPresent(val -> System.out.println("Nilai dari Optional yang tidak null: " + val));

        // Menggunakan metode map() untuk melakukan operasi pada nilai Optional jika ada
        Optional<Integer> lengthOptional = nonNullableOptional.map(String::length);
        lengthOptional.ifPresent(length -> System.out.println("Panjang nilai dari Optional yang tidak null: " + length));
    }
}
