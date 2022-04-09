package day13_PracticeTasks;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
/*
        System.out.println("Enter a sentence");
        String sentence = input.nextLine();
        char first=sentence.charAt(0);
        char last = sentence.charAt( sentence.length()-1);
        System.out.println("the first and last characters of the sentence: "+first +" , "+ last);
        System.out.println("----------------");
        */
/*
        System.out.println("Enter two words: ");
        String word1= input.next();
        String word2= input.next();
        if (word1.length() >word2.length()){
            System.out.println(word1 + " longest string word");
        }else System.out.println(word2+ " longest string word");
        System.out.println("--------------");
*//*
        String name = "limanol";
        if (name.charAt(0)== name.charAt(name.length()-1)){
            System.out.println("same");

        }else System.out.println("different");
*/
        // initial program

        System.out.println("Enter two words:");
        String word1= input.next();
        String word2= input.next();
        word1 = word1.toUpperCase();
        char init1= word1.charAt(0);

        word2= word2.toUpperCase();
        char init2 = word2.charAt(0);
        System.out.println(init1 + "."+init2);






    }
}
