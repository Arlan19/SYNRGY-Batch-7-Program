package ch2.pertemuan2OOP.kelas.abstrack;

import ch2.pertemuan2OOP.kelas.abstrack.Vehicle;

public class Car extends Vehicle {
    // Atribut tambahan untuk mobil
    int mileage; // Jarak tempuh dalam kilometer

    // Constructor
    public Car(String brand, int year, int mileage) {
        super(brand, year); // call construktre dari superclass
        this.mileage = mileage;
    }

    @Override
    public double calculateServiceCost() {
        /*
        logic
         */
//        perhitungan biaya service
        double costPerKm = 0.1; // Rupiah per kilometer
        return costPerKm* mileage;
    }

    @Override
    public int roda() {
        return 4;
    }


    // Implementasi dari abstract method calculateServiceCost()
//    @Override
//    double calculateServiceCost() {
//        // Contoh perhitungan biaya servis berdasarkan jarak tempuh
//        double costPerKm = 0.1; // Rupiah per kilometer
//        return costPerKm * mileage;
//    }

}
