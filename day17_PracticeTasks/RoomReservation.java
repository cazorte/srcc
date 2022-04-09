package day17_PracticeTasks;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        String roomName="";
        System.out.println("Do you want to reserve a room?");
        String answer=new Scanner(System.in).next();
        while ( !(answer.toLowerCase().equals("yes") || answer.toLowerCase().equals("no"))   ){
            System.out.println("Please re-enter a valid answer");
            answer=new Scanner(System.in).next();
        }
        if(answer.equalsIgnoreCase("no")){
            System.out.println("Have a nice day");
        }else if (answer.equalsIgnoreCase("yes")){
            System.out.println("King Bed ==> 120$\nQueen Bed ==> 100$\nSingle Bed ==> 80$");
            new Scanner(System.in).nextLine();
            roomName=new Scanner(System.in).nextLine();

                while (  ! (answer.toLowerCase().equals("king bed") || answer.toLowerCase().equals("queen bed") || answer.toLowerCase().equals("queen bed"))){
                    System.out.println("Please re-enter a valid room name");
                    roomName=new Scanner(System.in).next();

                }

                if (roomName.equalsIgnoreCase("king bed")){
                    System.out.println("you are KRAL, 120$");
                }

        }



    }
}
