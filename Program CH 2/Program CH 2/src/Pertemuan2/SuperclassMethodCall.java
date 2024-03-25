package Pertemuan2;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        super.sound(); // Memanggil metode sound() dari superclass Animal
        System.out.println("Dog barks");
    }
}

public class SuperclassMethodCall {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Objek myDog dari tipe data subclass Dog
        myDog.sound(); // Panggil metode sound(), yang akan memanggil versi dari Dog dan superclass Animal
    }
}
