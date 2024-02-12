package coding_challenges;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {

    public static void main(String[] args) {
        //createIntegerArray();
        //printArrayBackwards();
        //printDoublesSumAvg();
        printFavFoods();
    }

    /**
     * Create an integer array of 10 elements and give each element an arbitrary value. Print out the entire array using a loop.
     */
    public static void createIntegerArray() {
        int[] intArray = new int[10];
        intArray[0] = 5;
        intArray[1] = 64;
        intArray[2] = 246;
        intArray[3] = -34;
        intArray[4] = 65;
        intArray[5] = -77;
        intArray[6] = -3189;
        intArray[7] = 7;
        intArray[8] = 45;
        intArray[9] = -79;

        java.util.Arrays.stream(intArray).forEach(System.out::println);
    }

    /**
     * Use a loop to populate an array with integers from 1 to 20. Use another loop to print the contents of the array (the elements) backwards.
     */
    public static void printArrayBackwards() {
        int[] intArr = new int[20];
        int i = 0;
        do {
            intArr[i] = i + 1;
            i++;
        } while (i < intArr.length);

        for (int j = intArr.length - 1; j >= 0; j--) {
            System.out.println(j);
        }
    }

    /**
     * Create an array of five doubles and give each element some value. Calculate the sum of all the elements and print the result. Calculate the mean/average of the all the elements and print that too.
     */
    public static void printDoublesSumAvg() {
        double[] arrDouble = { 3.7, -23.89, 72.53, -382.34, 32.3 };
        double sum = 0;

        for (double i : arrDouble)
            sum += i;

        double avg = sum / arrDouble.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

    }

    /**
     *  Write a program which asks the user to enter their top five favourite foods and store their answers in a string array. However, create the array so it can only hold a maximum of three strings. After the user enters the third item, print “No more memory available.”, then print out the contents of the array.
     * Note: For this program use scanner.nextLine() when grabbing input from the user. This is because if the user enters a food such as “Ice cream” then scanner.next() will interpret that as two separate strings, due to the space. This may result in the program storing “Ice” as one the user’s favourite foods, and “cream” as another. However, if you use scanner.nextLine(), it will return the entire line as a single string.
     */
    public static void printFavFoods() {
        Scanner sc = new Scanner(System.in);
        String[] favFood = new String[3];

        //System.out.println("Please enter your five favorite foods.\nNumber one:");
        //favFood[0] = sc.nextLine();
        //
        //System.out.println("Number two:");
        //favFood[1] = sc.nextLine();
        //
        //System.out.println("Number three:");
        //favFood[2] = sc.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println("Favorite food " + (i+1) + ":");
            favFood[i] = sc.nextLine();
        }

        System.out.println("No more memory available.\nYour favorite foods:");

        for (String i : favFood) {
            System.out.println("* " + i);
        }
    }

}
