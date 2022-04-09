package day13_PracticeTasks;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter user name:");
        String userName = input.nextLine();

        System.out.println("Please enter your password");
        String password = input.nextLine();
        input.close();

        if (userName.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged in.");
        }else System.out.println("Incorrect username or password");


    }
}
