package Top2;

abstract class Animal{
    public abstract void sound();

    public void sleep(){
        System.out.println("zzzzz......");
    }
}

class Dog extends Animal{

    @Override
    public void  sound() {
        System.out.println("Suara Anjing Menggonggong");
    }
}

public class AbstrackEx2 {

    public static void main(String[] args) {
        Animal anjing = new Dog();
        anjing.sound();
        anjing.sleep();
    }

}
