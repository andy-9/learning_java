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
