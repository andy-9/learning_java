package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee emp2 = new Employee();

        emp.name = "Jeff";
        emp.age = 32;
        emp.jobTitle = "Construction Worker";

        emp2.name = "Sarah";
        emp2.age = 50;
        emp2.jobTitle = "Project Manager";


        Thing thing = new Thing();
        thing.num = 5;
        thing.word = "hello";

        int fooResult = thing.foo();
        System.out.println(fooResult);

        Thing thing2 = new Thing();
        thing2.num = 21;
        thing2.word = "world";

        bar(emp2);
        thingBar(thing2);

        //testInput();
        //testArray();
        //ageDoubled();
        //numberOfCharacters();
        //int amountPerPerson = splitBill(100, 5);
        //System.out.println("Amount per person: € " + amountPerPerson);
    }

    static void bar(Employee e) {
        System.out.println(e.age);
        //System.out.println(t.word + " is " + t.num + " years old.");
    }

    static void thingBar(Thing t) {
        System.out.println(t.word + " is " + t.num + " years old.");
    }

    public static int splitBill(int billTotal, int numPeople) {
        return billTotal / numPeople;
    }

    public static void numberOfCharacters() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        while (!sc.hasNext("[a-zA-Z]+")) {
            System.out.println("Invalid input. Please enter a name.");
            sc.next();
        }

        String name = sc.nextLine();

        System.out.println("Your name has " + name.length() + " characters.");
    }

    public static void ageDoubled() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a whole number.");
            sc.next();
        }

        int age = sc.nextInt();

        System.out.println("You've lived " + age + " years. In another " + age + " years you'll be " + 2*age + " years old.");
    }

    public static void testInput() {
        System.out.format("I have %.0f cats", 7.98);
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

    public static void nameAge() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter your name: ");
        while (!sc.hasNextLine()) {
            System.out.println("Invalid input. Please enter a valid name.");
            sc.next();
        }
        String name = sc.nextLine();
        if (name.equals("andy")) {
            System.out.printf("You are awesome, %s \uD83D\uDC4D%n", name);
        } else {
            System.out.printf("%s! What a wonderful name! \uD83D\uDE00%n", name);
        }

        System.out.print("\nEnter your age as a double: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid double.");
            sc.next();
        }
        double age = sc.nextDouble();

        System.out.printf("\n%s! What a wonderful name! \uD83D\uDE00 You are %s years old.", name, age);
    }
}