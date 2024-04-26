package java_for_absolute_beginners.sec_11_guest_list;

import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {

        String[] guests = new String[10];
        Scanner scanner = new Scanner(System.in);

        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Molly";
        guests[4] = "Christopher";

        do {
            // print guests
            System.out.println("\n__________________________________\n- Guests -\n");
            for (final String guest : guests) {
                System.out.println(guest == null ? "--" : guest);
            }

            System.out.println("\n__________________________________\n- Menu -\n");
            System.out.println("1 - Add Guests");
            System.out.println("2 - Remove Guests");
            System.out.println("3 - Exit\n");
            System.out.print("Option: ");
            int option = scanner.nextInt();
            System.out.println();

            if (option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print("Name: ");
                        guests[i] = scanner.next();
                        break;
                    }
                }
            } else if (option == 2) {
                System.out.print("Name: ");
                String name = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null && guests[i].equals(name)) {
                        guests[i] = null;
                        break;
                    }
                }
            } else if (option == 3)
                break;
        } while (true);

        System.out.println("Exiting...");
    }
}
