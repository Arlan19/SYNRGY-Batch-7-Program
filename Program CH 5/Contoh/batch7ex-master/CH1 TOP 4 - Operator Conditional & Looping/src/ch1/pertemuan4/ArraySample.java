package ch1.pertemuan4;

public class ArraySample {
    public static void main(String[] args) {
        String names[] = {"Ghufron","ivan","alfin","yahya"};//.. indek n

        System.out.println("nama="+names[1]);

        Integer noHp[] = {89987,8989,89878,767675};//.. indek n

        String[][] contacts = new String[5][2];

        // Menambahkan kontak ke dalam array
        contacts[0][0] = "Ghufron";
        contacts[0][1] = "0123456";

        // Menambahkan kontak ke dalam array
        contacts[1][0] = "alfin";
        contacts[1][1] = "0123456";


    }
}
