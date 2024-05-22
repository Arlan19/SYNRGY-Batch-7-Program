package ch2.pertemuan1OOP.kelas;

public class Main {
    public static void main(String[] args) {
        // cal object construktor kosong
        Mobil objMobil= new Mobil();
        objMobil.setRoda("4");
        objMobil.setKecepatan(200.0);
        objMobil.setType("Avanze");

//        System.out.println("roda ="+objMobil.getRoda());
//        System.out.println("type ="+objMobil.getType());
//        System.out.println("kecepatan ="+objMobil.getKecepatan());

        //call contrukter memiliki variable
        Mobil objMobilWithContructer= new Mobil("4","Avanza",200.0);
        System.out.println("roda ="+objMobilWithContructer.getRoda());
        System.out.println("type ="+objMobilWithContructer.getType());
        System.out.println("kecepatan ="+objMobilWithContructer.getKecepatan());


        // call method everloading:
        System.out.println(objMobil.kecepatan(200.0,60));
        System.out.println(objMobil.kecepatan(200.0,60,"Avaanza"));

    }
}
