package java_for_absolute_beginners.sec_11_guest_list;

import java.util.Arrays;
import java.util.Scanner;

public class GuestList {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        insertTestNames();

        do {
            displayGuests();
            displayMenu();

            final int option = getOption();

            if (option == 1) {
                addGuest();
            } else if (option == 2) {
                removeGuest();
            } else if (option == 3) {
                renameGuest();
            } else if (option == 4) {
                insertGuest();
            } else if (option == 5) {
                break;
            }
        } while (true);

        System.out.println("Exiting...");
    }

    private static void insertTestNames() {
        guests[0] = "Jacob Magiera";
        guests[1] = "Lisa Mahlich";
        guests[2] = "Hartmut Rosa";
        guests[3] = "Ayse Tunc";
        guests[4] = "Udi Nir";
    }

    private static void displayGuests() {
        System.out.println("\n__________________________________\n- Guests -\n");
        boolean isEmpty = true;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                System.out.println((i + 1) + ". " + guests[i]);
                isEmpty = false;
            }
        }

        if (isEmpty) {
            System.out.println("The guest list is empty.");
        }
    }

    private static void displayMenu() {
        System.out.println("\n__________________________________\n- Menu -\n");
        System.out.println("1 - Add Guests");
        System.out.println("2 - Remove Guests");
        System.out.println("3 - Rename Guest");
        System.out.println("4 - Insert Guest at number ...");
        System.out.println("5 - Exit\n");
    }

    private static int getOption() {
        System.out.print("Option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return option;
    }

    private static void addGuest() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print("Name: ");
                guests[i] = scanner.nextLine();
                break;
            }
        }

    }

    private static void removeGuest() {
        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number < 1 || number > 10 || guests[number - 1] == null) {
            System.out.println("\nERROR: There is no guest with that number.");
        } else {
            guests[number - 1] = null;

            String[] temp = new String[guests.length];
            int ti = 0;
            for (final String guest : guests) {
                if (guest != null) {
                    temp[ti] = guest;
                    ti++;
                }
            }
            guests = temp;
        }
    }

    private static void renameGuest() {
        System.out.print("Whom would you like to rename? Number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number < 1 || number > 10 || guests[number - 1] == null) {
            System.out.println("\nERROR: There is no guest with that number.");
        } else {
            System.out.print("\nWhat is the new name?");
            String newName = scanner.nextLine();
            guests[number - 1] = newName;
        }
    }

    private static void insertGuest() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Position: ");
        int position = scanner.nextInt();

        if (position < 1 || position > 10) {
            System.out.println("\nERROR: Position must be between 1 and 10.");
        } else {
            for (int i = guests.length - 1; i > position - 1; i--) {
                guests[i] = guests[i - 1];
            }
            guests[position - 1 ] = name;
        }
    }

}
