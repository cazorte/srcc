package day13_PracticeTasks;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a three letter word:");

        String word = input.nextLine();
        input.close();

        if (word.length()>3){
            System.out.println("Word is too long");
        }else if (word.length()<3){
            System.out.println("Word is too short");
        }else if (word.charAt(1)== 'a'){
            System.out.println("Cool word");
        }else
            System.out.println("Okay word");
    }
}
