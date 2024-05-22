package Top4;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int data = 50/0;
            System.out.println(data);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
