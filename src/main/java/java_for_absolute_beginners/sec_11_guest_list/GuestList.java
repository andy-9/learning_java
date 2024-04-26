package java_for_absolute_beginners.sec_11_guest_list;

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

            if (option == 1)
                addGuest();
            else if (option == 2)
                removeGuest();
            else if (option == 3)
                break;
        } while (true);

        System.out.println("Exiting...");
    }

    private static void insertTestNames() {
        guests[0] = "Jacob";
        guests[1] = "Lisa";
        guests[2] = "Hartmut";
        guests[3] = "Ayse";
        guests[4] = "Udi";
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

        if (isEmpty)
            System.out.println("The guest list is empty.");
    }

    private static void displayMenu() {
        System.out.println("\n__________________________________\n- Menu -\n");
        System.out.println("1 - Add Guests");
        System.out.println("2 - Remove Guests");
        System.out.println("3 - Exit\n");
    }

    private static int getOption() {
        System.out.print("Option: ");
        int option = scanner.nextInt();
        System.out.println();
        return option;
    }

    private static void addGuest() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print("Name: ");
                guests[i] = scanner.next();
                break;
            }
        }

    }

    private static void removeGuest() {
        System.out.print("Name: ");
        String name = scanner.next();
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null && guests[i].equals(name)) {
                guests[i] = null;
                break;
            }
        }

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
