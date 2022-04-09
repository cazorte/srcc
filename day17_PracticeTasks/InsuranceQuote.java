package day17_PracticeTasks;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = "Anıl";

        System.out.println("Enter your gender");
        String gender = "male";
        while (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))) {
            System.out.println("Invalid entry, please re-enter again");
            gender = input.next();
        }

        System.out.println("Are you married?");
        String isMarried = "yes";
        while (!(isMarried.equalsIgnoreCase("yes") || isMarried.equalsIgnoreCase("no"))) {
            System.out.println("Invalid entry, please re-enter again");
            isMarried = input.next();
        }

        System.out.println("Enter your age:");
        int age = 35;
        while (!(age > 0 && age < 120)) {
            System.out.println("Invalid entry, please re-enter again");
            age = input.nextInt();
        }
        System.out.println("How many miles you drives in a day?");
        int mile = 6;
        while (!(mile > 5)) {
            System.out.println("Invalid entry, please re-enter again");
            mile = input.nextInt();

        }
        System.out.println("Do you want full coverage or liability insurance?");
        String isCovLia = "coverage";
        while (!(isCovLia.equalsIgnoreCase("coverage") || isMarried.equalsIgnoreCase("liability"))) {
            System.out.println("Invalid entry, please re-enter again");
            isCovLia = input.next();
        }

        System.out.println("Do you have any accident or claim in past 5 years ");
        String isAccident = "yes";
        while (!(isAccident.equalsIgnoreCase("yes") || isAccident.equalsIgnoreCase("no"))) {
            System.out.println("Invalid entry, please re-enter again");
            isAccident = input.next();
        }

        System.out.println("Do you have in your car any Anti-Thief device?");
        String isAntiThief = "yes";
        while (!(isAntiThief.equalsIgnoreCase("yes") || isAntiThief.equalsIgnoreCase("no"))) {
            System.out.println("Invalid entry, please re-enter again");
            isAntiThief = input.next();
        }

        int price=0;
        if (mile<=10) {
            if (isCovLia.equalsIgnoreCase("liability")) price += 10;
            else price += 20;
        }else if (mile>10 && mile<=50) {
            if (isCovLia.equalsIgnoreCase("liability")) price += 30;
            else price += 40;
        }else {
            if (isCovLia.equalsIgnoreCase("Liability")) price+=50;
            else price+= 70;
        }


        if (age<25){
            if (isCovLia.equalsIgnoreCase("liability")) price+=90;
            else price+=160;
        }else{
            if (isCovLia.equalsIgnoreCase("liability")) price+=50;
            else price +=120;
        }

        if (isAntiThief.equalsIgnoreCase("yes")){
            price*=0.95;
        }
        if (isAccident.equalsIgnoreCase("yes")){
            price*=1.15;
        }
        if (isMarried.equalsIgnoreCase("yes")){
            price*=0.95;
        }

        System.out.println("price = " + price);

    }
}
