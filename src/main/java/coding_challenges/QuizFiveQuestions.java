/**
 * Write a quiz program with five true-or-false questions. Display a question to the user, and ask the user to enter
 * either true or false, then move on to the next question. At the end of the quiz display the user’s score.
 * Use three arrays, a String array for holding the questions, a boolean array for the answers, and another boolean
 * array for the user’s answers.
 *
 * Hints:
 * You can use the Scanner’s nextBoolean() method to get the user’s input
 * Because the questions, answers, and user’s answers are stored in three separate arrays, you can use their indexes to
 * associate them (e.g. index 1 in the answers array correlates to index 1 in the questions array)
 */


package coding_challenges;

import java.util.Scanner;

public class QuizFiveQuestions {

    public static void main(String[] args) {
        String[] questions = { "Fascism is fun for everybody.", "Flowers can be beautiful.", "Cats like dogs.",
                "Skateboarding can be painful.", "You don't know what you don't know." };
        Boolean[] correctAnswers = { false, true, false, true, true };
        Boolean[] answersGiven = new Boolean[5];
        int score = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("\nQuestion " + i + ": " + questions[i] + " True or false?");
            System.out.print("Your answer: ");
            answersGiven[i] = sc.nextBoolean();

            if (answersGiven[i] == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Unfortunately wrong. In fact, it's " + correctAnswers[i] + ".");
            }
        }

        System.out.println("You answered " + score * 20 + " % of the questions correct.");

    }
}
