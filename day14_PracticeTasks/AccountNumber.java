package day14_PracticeTasks;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Please enter your account number:");
        String account = input.next();
        String firstChar =account.substring(0,1);

        if (firstChar.equals("2") && firstChar.length()==7){
            System.out.println("valid number");
        }else if (firstChar.equals("5") && firstChar.length()==10){
            System.out.println("valid number");
        }else System.out.println("Invalid account number");


    }

}
