package exercises;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PrintNumbers {

    public static void main(String[] args) {
        //print89to117();
        //print1to40Quack();
        //checkPassword();
        //print1to10InOneRow();
        //guessNumber();

        double[] arr = new double[] { 25.92, 1.14, -75.3, 833.11 };
        for (double e : arr) {
            System.out.println(e);
        }
    }

    private static void print89to117() {
        for (int i = 89; i <= 117; i++) {
            System.out.println(i);
        }
    }

    private static void print1to40Quack() {
        for (int i = 1; i < 41; i++) {
            if (i % 3 == 0) {
                System.out.println("Quack");
            } else {
                System.out.println(i);
            }
        }
    }

    private static void checkPassword() {
        String password;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("What is your password?");
            System.out.print("Your password: ");
            password = sc.next();
        } while (!password.equals("shark50"));

        System.out.println("ACCESS APPROVED");
    }

    private static void print1to10InOneRow() {
        //for (int i = 0; i < 11; i++) {
        //    if (i < 10) {
        //        System.out.print(i + ", ");
        //    } else {
        //        System.out.print(i + ".");
        //    }
        //}

        for (int i = 0; i <= 10; i++)
            System.out.print(i + ", ");
        System.out.println("\b\b.");
    }

    private static void guessNumber() {
        Scanner sc = new Scanner(System.in);

        int playerNumber;
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int count = 0;

        System.out.println("Guess a number from 1 to 100.");

        do {
            System.out.print("Your guess: ");
            playerNumber = sc.nextInt();
            count++;

            if (playerNumber < randomNumber) {
                System.out.println("HIGHER");
            } else {
                System.out.println("LOWER");
            }
        } while (playerNumber != randomNumber);

        System.out.println("CORRECT!");
        System.out.println("It took you " + count + " guesses.");
    }
}