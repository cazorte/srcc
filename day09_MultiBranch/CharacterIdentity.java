package day09_MultiBranch;

import java.util.Scanner;

public class CharacterIdentity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Character Identity Program \n Please write a character below:");

        String str=input.nextLine();
        char ch = str.charAt(0);
        int chNum = (int) ch;


        System.out.println("entry = "+ str);
        System.out.println("ascii number is :"+chNum );


        if (ch > 47 && ch < 58) {                          //59 72
            System.out.println(" Digit");
        } else if ((ch > 64 && ch < 91) || (ch >96 && ch <123)) {
            System.out.println("Alphabetic Character");
        } else if ((ch > 0 && ch < 48) || (ch >57 && ch <65)|| (ch >90 && ch <97)|| (ch >122)) {
            System.out.println("Special Character");
        } else{
            System.out.println("unkown");
    }





    }




}
