package ch1.pertemuan4;

public class IfElseEx {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        if(a ==b){
            System.out.println("equals");
        }else {
            System.out.println("not equals");
        }

        chekAngka(a,b);
    }

    public static void chekAngka (int a, int b){
        if(a ==b ){
            System.out.println("equals");
        }else if(a<b){
            System.out.println("a<b");
        }else if(a>b){
            System.out.println("a>b");
        }
    }

}
