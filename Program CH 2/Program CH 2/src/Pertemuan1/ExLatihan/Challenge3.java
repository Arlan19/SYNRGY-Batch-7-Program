package Pertemuan1.ExLatihan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge3 {

    private static Boolean isLoop = false;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Food[] foods = {
                new Food("Fried Rice", 15_000),
                new Food("Fried Noodle", 20_000),
                new Food("Fried Chicken", 25_000),
                new Food()
        };
        foods[3].setName("Duck");
        foods[3].setPrice(10_000);
        do {
            System.out.println("Food Menu");
            var number = 0;
            for (Food food : foods) {
                System.out.printf("%d. %s - Rp. %d\n", (number + 1), food.getName(), food.getPrice());
                number++;
            }
            System.out.print("Choose food number: ");
            try {
                var choose = input.nextInt();
                switch (choose) {
                    case 1, 2, 3:
                        System.out.print("Qty => ");
                        var qty = input.nextInt();
                        foods[choose - 1].setQty(qty);
                        displayMenu(foods[choose - 1]);
                        break;
                    default:
                        System.out.println("Order not available!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input only number! please input right number!");
            }
        } while (isLoop);
        input.close();
    }

    public static void displayMenu(Food food) {
        System.out.println("Food name: " + food.getName());
        System.out.println("Food price: Rp. " + food.getPrice());
        System.out.println("Total order: Rp. " + (double) (food.getPrice() * food.getQty()));

        System.out.print("Apakah ingin memesan lagi? (ya/tidak) ");
        isLoop = input.next().equals("ya");
    }
}
