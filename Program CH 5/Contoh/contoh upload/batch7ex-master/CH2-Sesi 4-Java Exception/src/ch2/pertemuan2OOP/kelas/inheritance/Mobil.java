package ch2.pertemuan2OOP.kelas.inheritance;

public class Mobil extends Kendaraan  {
    String roda;
    public  Mobil (){
        super();
    }

    @Override// menandakan menulis ulang method yang sama dengan superclassnya : jika namanya berbeda, akan terjadi eror.
    public String melaju(String brand,int year){
        return brand + "Melaju di subclass";
    }

    @Override
    public final String rem (String brand){
        return brand + "melakukan rem";
    }
}
