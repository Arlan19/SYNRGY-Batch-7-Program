package ch1.pertemuan5;

import java.util.Scanner;

class DeretFibonacci {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Berapa suku deret fibonacci?");
        int n = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Deret fibonaci dangan " + n + " suku:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
