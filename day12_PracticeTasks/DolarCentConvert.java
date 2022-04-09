package day12_PracticeTasks;

import java.util.Scanner;

public class DolarCentConvert {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter cents");
        int cent= input.nextInt();
        int dolar = cent/100;
        int remain = cent % 100;

        System.out.println(cent+" cents equal to: "+dolar+ " dollars and "+ remain+ " cents");




    }
}
/*Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

 */