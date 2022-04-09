package day18_PracticeTasks;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price = 0;


        while (true) {
            System.out.println("King Bed \t==> 120$");
            System.out.println("Queen Bed \t==> 100$");
            System.out.println("Single Bed \t==> 80$");
            System.out.println("Which bedroom do you want reserve?");

            String which = input.nextLine();
            while (!(which.equalsIgnoreCase("King Bed") || which.equalsIgnoreCase("queen bed") || which.equalsIgnoreCase("single bed"))) {
                System.out.println("Invalid entry, please re-enter again");
                which = input.nextLine();
            }
            if (which.equalsIgnoreCase("king bed")) {
                price += 120;
            } else if (which.equalsIgnoreCase("queen bed")) {
                price += 100;
            } else price += 80;

            System.out.println("How many nights do you is staying?");
            int howManyNight = input.nextInt();
            input.nextLine();
            price *= howManyNight;

            System.out.println("Would you like to reserve another room?");
            String another = input.nextLine();

            while (!(another.equalsIgnoreCase("yes") || another.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry, please re-enter again...");
                another = input.nextLine();
            }
            if (another.equalsIgnoreCase("no")) {
                System.out.println("Total price:\t" + price + "$");
                break;

            }

        }


    }
}
