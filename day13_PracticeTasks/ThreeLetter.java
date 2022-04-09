package day13_PracticeTasks;

import java.util.Scanner;

public class ThreeLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();

        if (word.length() > 0) {

            if (word.length() > 3)
                System.out.println(word.substring(word.length()-3, word.length()));
            else System.out.println(word);

        } else System.out.println("String is empty");


    }
}
