package Pertemuan4;

public class BinaryEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        int d = b % a;
        System.out.println(c);
        System.out.println(d);
        System.out.println(hitung(2, 5));
    }

    public static int hitung(int a, int b){
        return a + b;
    }
}
