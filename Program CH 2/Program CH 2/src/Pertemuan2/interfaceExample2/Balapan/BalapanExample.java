package Pertemuan2.interfaceExample2.Balapan;

// Interface untuk definisi metode balapan
interface Balapan {
    void race();

}

// Subclass F1 yang mengimplementasikan interface Balapan
class F1 implements Balapan {
    @Override
    public void race() {
        System.out.println("F1 race is on!");
    }

    public void crash(){
        System.out.println("Balapan dihetikan karena ada mobil F1 yang crash");
    }
}

class F2 extends F1{
    public void race() {
        super.race();
        System.out.println("F2 sudah selesai dilaksanakan");
    }

    public void crash(){
        System.out.println("Balapan dihetikan karena ada mobil F2 yang crash");
    }
}

// Subclass Rally yang mengimplementasikan interface Balapan
class Rally implements Balapan {
    @Override
    public void race() {
        System.out.println("Rally race is on!");
    }
}

// Subclass MotoGP yang mengimplementasikan interface Balapan
class MotoGP implements Balapan {
    @Override
    public void race() {
        System.out.println("MotoGP race is on!");
    }
}

public class BalapanExample {
    public static void main(String[] args) {
        F1 f1 = new F1();
        F2 f2 = new F2();
        Rally rally = new Rally();
        MotoGP motogp = new MotoGP();

        f1.race();
        f1.crash();
        f2.race();
        f2.crash();
        rally.race();
        motogp.race();
    }
}