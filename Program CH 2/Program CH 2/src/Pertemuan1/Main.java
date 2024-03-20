package Pertemuan1;

public class Main {
    public static void main(String[] args) {
        Mobil mazda = new Mobil();
        mazda.setRoda("4");
        mazda.setType("miata");
        mazda.setKecepatan(120.0);

        System.out.println("jumlah roda = " + mazda.getRoda());
        System.out.println("type Mobil = " + mazda.getType());
        System.out.println("kecepatan maksimal = " + mazda.getKecepatan());

        System.out.println("=====================");
        Mobil suzuki = new Mobil("4", "jimny");
        System.out.println("type mobil = " + suzuki.getType());
        System.out.println("jumlah roda = " + suzuki.getRoda());
        suzuki.setKecepatan(130.0);
        System.out.println("kecepatan maksimal = " + suzuki.getKecepatan());

        System.out.println(mazda.kecepatan(240.0, 60, "Rx7"));
        System.out.println(mazda.kecepatan(1600.0, 60, "CX-3"));
    }
}
