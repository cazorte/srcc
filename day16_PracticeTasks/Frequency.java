package day16_PracticeTasks;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Please enter a sentence: ");
        String sentence = input.nextLine().toLowerCase();
        System.out.println("Please enter a character: ");
        char ch= input.nextLine().charAt(0);
        int counter=0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i)==ch){
                counter++;
            }
        }
        System.out.println(counter + " times this charter has used in this sentence");


    }
}
