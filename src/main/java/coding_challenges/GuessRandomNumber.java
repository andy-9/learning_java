/**
 * Back in “Coding Challenge 4 - Loops”, for Exercise 5, you were tasked to write a guess-my-number game.
 * The program picked a random number from 1 and 100 and you had to guess it.
 * This time, reverse the roles. Think of a number from 1 to 100 and write a program which tries to guess it.
 * Type “higher” if the program guesses too low, or “lower” if the program guesses too high. Have the program make
 * subsequent guesses based on this information. When the program guesses your number type “correct” and end the program.
 *
 * Hint: Remember, if you need it, you can use the following line of code to generate a random number:
 * int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
 */

package coding_challenges;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessRandomNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Think of a number from 1 to 100.\n");
        System.out.print("Your number: ");
        int yourNumber = sc.nextInt();

        System.out.println("I will guess your number. If my guess is below your number, write 'higher',"
                + " if it is above my guess write 'lower'. Let's go!");

        int min = 1;
        int max = 101;

        while (true) {
            int randomNumber = ThreadLocalRandom.current().nextInt(min, max);
            System.out.println("My guess is: " + randomNumber);

            if (randomNumber == yourNumber) {
                System.out.println("Correct! My number was " + yourNumber + ".");
                break;
            }

            System.out.print("Your response: ");
            String higherOrLower = sc.next();

            if (higherOrLower.equals("higher")) {
                min = randomNumber + 1;
            } else {
                max = randomNumber;
            }
        }
    }
}