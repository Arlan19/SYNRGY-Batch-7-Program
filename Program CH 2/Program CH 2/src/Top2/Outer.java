package Top2;

//Static Pada Nested Class
public class Outer {
    public Outer(){}
    static class StatNestedDemo{
        public void myMethod(){
            System.out.println("This is a static class");
        }
    }

    class NonStatNestedDemo{
        public void myMethod(){
            System.out.println("This ia a non statis class");
        }
    }

    public static void main(String[] args) {
        Outer.StatNestedDemo nested = new Outer.StatNestedDemo();
        nested.myMethod();
        Outer outer = new Outer();
        Outer.NonStatNestedDemo nonNested =  outer.new NonStatNestedDemo();
        nonNested.myMethod();
    }
}
