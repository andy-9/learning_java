package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Eingabe with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.print("Hello and welcome!\n");

        testInput();
        //testArray();
    }

    public static void testInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        while (!sc.hasNextLine()) {
            System.out.println("Invalid input. Please enter a valid name.");
            sc.next();
        }
        String name = sc.nextLine();
        if (name.equals("andy")) {
            System.out.printf("You are awesome, %s \uD83D\uDC4D\n", name);
        } else {
        System.out.printf("%s! What a wonderful name! \uD83D\uDE00\n", name);
        }

        System.out.print("Enter your age as a double: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid double.");
            sc.next();
        }
        double age = sc.nextDouble();

        System.out.printf("%s! What a wonderful name! \uD83D\uDE00 You are %s years old.", name, age);

    }

    public static void testArray() {
        int[] arr = new int[5];
        System.out.println("length of array: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * i;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}