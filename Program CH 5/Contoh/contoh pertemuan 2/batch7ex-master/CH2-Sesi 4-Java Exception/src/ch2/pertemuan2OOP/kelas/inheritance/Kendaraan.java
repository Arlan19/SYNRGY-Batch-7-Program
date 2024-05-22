package ch2.pertemuan2OOP.kelas.inheritance;

public class Kendaraan {
    private String brand;
    private int year;

    public String melaju(String brand){
        return brand + "Melaju SuperClass";
    }

    public String melaju(String brand,int year){
        return brand + "Melaju SuperClass";
    }

    public  String rem (String brand){
        return brand + "melakukan rem";
    }
}
