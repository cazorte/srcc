package day14_PracticeTasks;

import java.util.Scanner;

public class WarmingTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    /*    System.out.println("Please enter two words:");

        String word1= input.next();
        String word2 = input.next();

        System.out.println(word1.substring(1)+word2.substring(1));

        System.out.println("----------------");
*/
   /*     System.out.println("Please enter any word:");
        String anyWord = input.next();
        char last21 = anyWord.charAt(anyWord.length()-2);
        char last22 = anyWord.charAt(anyWord.length()-1);

        if (last21 == 'l' && last22 == 'y'){
            System.out.println("really???");
        }else System.out.println("never mind");

        System.out.println("----------------------");
*/          /*
        System.out.println("Enter a word");
        String wordx = input.next();

        if (wordx.charAt(0) == 'x'){
            System.out.println(wordx.substring(1));
        }else {
            System.out.println(wordx);
        }
        System.out.println("-----------------");
*/          /*
        System.out.println("Enter two words:");
        String word1 = input.next();
        String word2 = input.next();

        if (word1.charAt(word1.length() - 1) == word2.charAt(0)) {
            System.out.println(word1 + word2.substring(1));
        } else System.out.println(word1 + word2);
*/
        System.out.println("Enter word");
        String word = input.next();
        char firstChar = word.charAt(0);
        if (firstChar>=48 && firstChar<=57 )             //48 --->57
            System.out.println("First character is digit");

        else if (firstChar>= 65 && firstChar<=90){
            System.out.println("First character is uppercase");              //65 --->90
        }else if (firstChar>= 97 && firstChar<=122){
            System.out.println("First character is lowercase");                //97 ---->122
        }else System.out.println("First character is special character");



    }
}
