package Pertemuan3.ContohTampaLambda;

public class WithoutLambdaExample {
    public static void main(String[] args) {
        Operation addition = new Addition();
        Operation subtraction = new Subtraction();

        System.out.println("Hasil penjumlahan: " + operate(5, 3, addition));
        System.out.println("Hasil pengurangan: " + operate(5, 3, subtraction));
    }

    public static int operate(int a, int b, Operation operation) {
        return operation.operate(a, b);
    }
}
