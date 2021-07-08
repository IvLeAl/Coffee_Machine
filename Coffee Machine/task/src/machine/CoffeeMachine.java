package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Write how many cups of coffee you will need:");
//        String cup = scanner.next();
//        System.out.println("For " + cup + " cups of coffee you will need:");
//        System.out.println( Integer.parseInt(cup) * 200 + " ml of water");
//        System.out.println( Integer.parseInt(cup) * 50 + " ml of milk");
//        System.out.println( Integer.parseInt(cup) * 15 + " g of coffee beans");

        final int oneWater = 200;
        final int oneMilk = 50;
        final int oneCoffee = 15;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffee = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();

        int portionsWater = water / oneWater;
        int portionsMilk = milk / oneMilk;
        int portionsCoffee = coffee / oneCoffee;

        int minCups = Math.min(Math.min(portionsWater, portionsMilk), portionsCoffee);

        if (cups < minCups) {
            int m = minCups - cups;
            System.out.println("Yes, I can make that amount of coffee (and even " + m + " more than that)");
        } else if (cups == minCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (minCups == 0) {
            System.out.println("No, I can make only " + minCups + " cup(s) of coffee");
        } else {
            System.out.println("No, I can make only " + minCups + " cup(s) of coffee");
        }
    }
}








