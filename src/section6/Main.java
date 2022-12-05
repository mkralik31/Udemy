package section6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

/*        System.out.println("============= Exercise 1 ==============\n");

        int x;
        int y;

        Scanner scanner = new Scanner(System.in);

        System.out.print("x = ");
        x = scanner.nextInt();

        System.out.print("y = ");
        y = scanner.nextInt();

        if (x > y) {
            System.out.println("x is bigger than y");
        } else if (x < y) {
            System.out.println("x is smaller than y");
        } else {
            System.out.println("x and y are the same");
        }

        System.out.println("\n============= Exercise 2 ==============\n");

        if (x > y) {
            int dif1 = x - y;
            System.out.println("x is bigger than y and difference is " + dif1);
        } else if (x < y) {
            int dif2 = y - x;
            System.out.println("x is smaller than y and difference is " + dif2);
        } else {

            System.out.println("x and y are the same and no difference between them");
        }*/

        System.out.println("\n============= Exercise 3 ==============\n");

        System.out.println("Guess the number between 1 to 5");

//        int[] nums = {1, 2, 3, 4, 5};

        int randomNumber = ThreadLocalRandom.current().nextInt(1,6);

//        System.out.println("Your number: ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your number: ");

        int guess = scanner.nextInt();


        if (guess == randomNumber) {
            System.out.println("Correct! Aren’t you lucky");
        } else {
            System.out.println("Wrong! Have another go.");
            System.out.println("Your number: ");
            guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("Correct! Aren’t you lucky");
            } else {
                System.out.println("Hard luck! Maybe next time");
            }
        }

/*        do {
            System.out.println("Your number: ");

            guess = scanner.nextInt();


            if (guess == randomNumber) {
                System.out.println("Correct! Aren’t you lucky");
            } else {
                System.out.println("Hard luck! Maybe next time");
            }

        } while (guess != randomNumber);*/
    }
}
