package day14_PracticeTasks;

import java.util.Scanner;

public class CalledEmailTask1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your email:");
        String mail= input.nextLine();

        String mailFirst = mail.substring(0, mail.indexOf("_"));
        String mailSecond = mail.substring(mail.indexOf("_")+1 ,  mail.indexOf("@") );
        String mailRemain = mail.substring(mail.indexOf("@") );

        System.out.println(mailSecond+"_"+mailFirst+mailRemain);


    }
}
