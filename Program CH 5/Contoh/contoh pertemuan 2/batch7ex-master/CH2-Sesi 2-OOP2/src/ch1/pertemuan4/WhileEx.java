package ch1.pertemuan4;

import java.util.Date;

public class WhileEx {
    public static void main(String[] args) {
        whileLoop();
    }

    public static void whileLoop(){

        int num1= 0;
        int num2 = 23;
        while (num1 <=num2){
            System.out.println("print"+new Date());
            num1++;
        }
    }

}
