package ch2.pertemuan2OOP.kelas.abstrack;

public class Motorcycle extends Vehicle {
    // Atribut tambahan untuk sepeda motor
    boolean hasHelmet; // Apakah memiliki helm atau tidak

    // Constructor
    public Motorcycle(String brand, int year, boolean hasHelmet) {
        super(brand, year);
        this.hasHelmet = hasHelmet;
    }


    @Override
    public double calculateServiceCost() {
        return 50000;
    }

    @Override
    public int roda() {
        return 2;
    }
}
