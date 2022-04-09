package day14_PracticeTasks;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)");
        String split= input.next();
        System.out.println("Enter the number of people");
        int number = input.nextInt();
        System.out.println("Enter the check amount:");
        double amount = input.nextInt();
        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String quality= input.next();
        input.close();
        double tip=0;
        if (quality.equals("Excellent")) tip=25;
        else if (quality.equals("Great")) tip=20;
        else if (quality.equals("Good")) tip=15;
        else if (quality.equals("Fair")) tip=10;
        else if (quality.equals("Poor")) tip=5;

        double totalTip= amount/100*tip;

        if (split.equals("Yes")) {
            System.out.println("Number of people entered: " + number);
            System.out.println("Total to pay: " + (amount + totalTip));
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total per person: " + (amount + totalTip) / number);
            System.out.println("Tip per person: " + totalTip / number);
        }else System.out.println("No split guys");




    }
}
