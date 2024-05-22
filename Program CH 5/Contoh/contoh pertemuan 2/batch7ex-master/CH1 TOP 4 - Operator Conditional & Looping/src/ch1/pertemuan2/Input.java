package ch1.pertemuan2;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input nama, qty,total =");
        String nama = scanner.next();
        Long qty = scanner.nextLong();
        Integer total = scanner.nextInt();
        System.out.println("nama ="+nama);
        System.out.println("total ="+total);
        System.out.println("qty ="+qty);
    }
}
