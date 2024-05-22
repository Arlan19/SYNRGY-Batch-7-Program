package ch2.pertemuan2OOP.kelas.abstrack;

import ch2.pertemuan2OOP.kelas.inteface.KaryawanInterface;

public abstract class Vehicle {
    // Atribut
    String brand;
    int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public Vehicle(String brand) {
        this.brand = brand;
        this.year = year;
    }

    // Abstract method untuk menghitung biaya servis kendaraan
    public abstract double calculateServiceCost();

    public abstract int roda();

    public void sampleMethod(){

    }

}
