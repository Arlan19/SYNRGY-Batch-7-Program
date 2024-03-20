package Pertemuan1.LatihanLombok;

public class Main {
    public static void main(String[] args) {
        Kucing persia = new Kucing();
        persia.setBulu("Kuning");
        persia.setGenre("Jantan");

        System.out.println(persia.getBulu());

        Kucing kampung = new Kucing("Putih", "Betina");
        System.out.println(kampung.getGenre());
    }
}
