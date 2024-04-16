package java_for_absolute_beginners.sec_11_guest_list;

import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {

        String[] guests = new String[10];
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("1 - Display all Guests");
            System.out.println("2 - Add Guests");
            System.out.println("3 - Remove Guests");
            System.out.println("4 - Exit");
            System.out.print("Option: ");
            int option = scanner.nextInt();
            System.out.println();

            if (option == 1) {
                for (final String guest : guests) {
                    System.out.println(guest);
                }
            } else if (option == 2) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print("Name: ");
                        guests[i] = scanner.next();
                        break;
                    }
                }
            } else if (option == 4)
                break;
        } while (true);

        System.out.println("Exiting...");
    }
}
