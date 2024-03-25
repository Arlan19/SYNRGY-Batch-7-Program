package Top2;

abstract class Shape {
    public abstract double area();

}

class Reactangle extends Shape{
    private double lenght;
    private double width;

    public Reactangle(double lenght, double width){
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double area() {
        return lenght * width;
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstrackEx {
    public static void main(String[] args) {
        Shape persegi = new Reactangle(2.5,2.6);
        Shape lingkaran = new Circle(5.0);

        System.out.println("Luas Persegi : " + persegi.area());
        System.out.println("Luas Lingkaran : " + lingkaran.area());
    }
}