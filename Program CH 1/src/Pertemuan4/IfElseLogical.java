package Pertemuan4;

public class IfElseLogical {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        int c = 200;

        chekAngkaOr(a,b,c);
    }

    public static void chekAngkaOr (int a, int b, int c){
        if( (a ==b) || (b==c) ){
            System.out.println("equals");
        }else if(a<b){
            System.out.println("a<b");
        }else if(a>b){
            System.out.println("a>b");
        }
    }
}
