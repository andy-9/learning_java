package coding_challenges;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumber {
    /**
     * Create a game where the program picks a random number from 1 to 5 and you, the player, has to guess it.
     * If the player guesses right, print "Correct! Aren’t you lucky.".
     * If the player guesses wrong, print "Hard luck! Maybe next time.".
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numPlayer = getNumPlayer(sc);

        while (numPlayer < 1 || numPlayer > 5) {
            System.out.println("Invalid input. Please enter a whole number between 1 and 5:");
            numPlayer = getNumPlayer(sc);
        }

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        if (numPlayer == randomNumber) {
            System.out.println("Correct! Aren’t you lucky.");
        } else {
            System.out.println("Hard luck! Maybe next time.");
        }
    }

    private static int getNumPlayer(final Scanner sc) {
        System.out.print("Guess a number between 1 and 5: ");
        typeCheck(sc);
        return sc.nextInt();
    }

    private static void typeCheck(final Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a whole number:");
            sc.next();
        }
    }

}
