package section5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("============= Exercise 1 ==============\n\n");


        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.next();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Amount of money in your pocket: £");
        double money = scanner.nextDouble();

        System.out.println();

        double moneyNeeded = Math.ceil(money) - money;

        System.out.println("Your name is " + firstName + " and you are " + age + " years old.");
        System.out.format("You have £%.2f on you and need £%.2f.", money, moneyNeeded);

        System.out.println("\nYou’ve lived " + age + " years. In another " + age + " years you’ll be 2x years old.");

        System.out.println("Your name has " + firstName.length() + " characters\n\n");

        System.out.println("============= Exercise 2 ==============\n\n");

        double billAmount;

        System.out.println("Bill amount is (input amount): ");
        billAmount = scanner.nextDouble();

        System.out.println("Your bill is " + billAmount);

        System.out.println("How many persons will pay?");
        int persons = scanner.nextInt();

        System.out.println("Bill will be divided to " + persons + " person(s)");
        double split = billAmount / persons;

        System.out.format("Each of you will pay %.3f", split);

        System.out.println("\nThank you.");
    }
}
