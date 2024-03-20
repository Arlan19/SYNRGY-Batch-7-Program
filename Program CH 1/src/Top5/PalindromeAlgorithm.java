package Top5;

import java.util.Scanner;

public class PalindromeAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Kata - kata Palindrom : ");
        String kata = scanner.nextLine();

        if (isPalindrome(kata)){
            System.out.println("String is Palindrome");
        }else {
            System.out.println("String is not Palindrome");
        }
    }

    private static boolean isPalindrome(String kata) {
        int left = 0;
        int right = kata.length() - 1;
        while (left < right){
            if (kata.charAt(left) != kata.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
