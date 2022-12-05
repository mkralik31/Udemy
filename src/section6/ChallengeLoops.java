package section6;

import java.util.Scanner;

public class ChallengeLoops {

    public static void main(String[] args) {

        System.out.println("========== Exercise 1 =========\n");
        for (int i = 89; i<=117; i++) {
            System.out.println(i);
        }

        System.out.println("\n========== Exercise 2 =========\n");

        for (int i = 1; i <= 40; i++) {

            System.out.println(i);

            if(i % 3 == 0) {
                System.out.println("Quack");
            }

        }

        System.out.println("\n========== Exercise 3 =========\n");



        Scanner scanner = new Scanner(System.in);
        System.out.println("Password:");
        String pass = scanner.nextLine();

        String password = "shark50";

        do {

            if (pass.equals(password)) {
                System.out.println("ACCESS APPROVED");

            } else {
                System.out.println("Try again:");
                pass = scanner.nextLine();
            }
        } while (!pass.equals(password));

        System.out.println("ACCESS APPROVED");

        System.out.println("\n========== Exercise 4 =========\n");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

    }




}
