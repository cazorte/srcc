package day16_PracticeTasks;

import java.util.Scanner;

public class CounterPosAndNeg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 5 times ");
        int counterPositive = 0;
        int counterNegative = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("Number " + i + " : ");
            int num = input.nextInt();
            if (num >= 0) {
                counterPositive++;
            } else counterNegative++;
        }
        System.out.println(counterPositive + " positive and " + counterNegative + " negative");

    }
}
