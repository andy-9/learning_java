/*
You have been tasked with writing a program for a school which produces some statistics on students’ exam results.
The users are teachers who will input each student’s score, and any other necessary data.
Store the scores in an array.
The program should output:
- Each student’s score and percentage for the exam
- The mean (average) score and percentage of the exam
 */

package exercises;

import java.util.Scanner;

public class StudentExamResults {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many students took the exam?\n Number: ");
        int studentNumber = sc.nextInt();

        System.out.print("What is the maximum possible score for this exam?\n Maximum score: ");
        int maxScore = sc.nextInt();

        int[] studentScores = new int[studentNumber];

        for (int student = 0; student < studentNumber; student++) {
            System.out.print("What is the score of student " + (student + 1) + "?\nScore: ");
            studentScores[student] = sc.nextInt();
        }

        int sum = 0;

        for (int student = 0; student < studentNumber; student++) {
            int studentScore = studentScores[student];
            double studentPercentage = ((double) studentScores[student] / maxScore) * 100;
            String formattedStudentPercentage = String.format("%.2f", studentPercentage);
            System.out.println("Student " + (student + 1) + ": " + studentScore + "/" + maxScore + " (" + formattedStudentPercentage + " %)");
            sum += studentScore;
        }

        double mean = (double)sum / studentNumber;
        String formattedMean = String.format("%.1f", mean);
        double meanPercentage = (mean / maxScore) * 100;
        String formattedMeanPercentage = String.format("%.2f", meanPercentage);
        System.out.println("Mean: " + formattedMean + "/" + maxScore + " (" + formattedMeanPercentage + " %)");

    }

}
