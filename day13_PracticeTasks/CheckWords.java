package day13_PracticeTasks;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter three words and i calculate this words length");
        String word1= input.next();
        String word2= input.next();
        String word3= input.next();
        input.close();

        int l1 =word1.length();
        int l2= word2.length();
        int l3= word3.length();

        if (l1==l2 && l1==l3){
            System.out.println("All words are same length");
        }else if (l1==l2 || l1==l3 || l2==l3){
            System.out.println("Not Same nor Different lengths");
        }else System.out.println("All different length");

    }
}
