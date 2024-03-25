package Top2;


interface Kendaraan{
    void drive();
    void stop();
}

class Car implements Kendaraan {

    @Override
    public void drive() {
        System.out.println("Car is being driven");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

class Bike implements Kendaraan{

    @Override
    public void drive() {
        System.out.println("Bike is being driven");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopped");
    }

}
public class InterfaceEx {
    public static void main(String[] args) {
        Car mobil = new Car();
        mobil.drive();
        mobil.stop();

        Bike sepeda = new Bike();
        sepeda.drive();
        sepeda.stop();
    }
}
