package ch1.pertemuan4;

public class ForEx {
    public static void main(String[] args) {
        forLoop();
    }

    public static void forLoop(){
        int i;
        for(i=10; i<=20; i++){
            System.out.println("cetak angka"+i);
        }

        for(int j=20; i>=10; i--){
            System.out.println("cetak angka"+i);
        }
    }

    public void manual(){
        System.out.println("cetak saya");
        System.out.println("cetak saya");
        System.out.println("cetak saya");
        System.out.println("cetak saya");
        System.out.println("cetak saya");
        System.out.println("cetak saya");
    }

}
