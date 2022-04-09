package day09_MultiBranch;

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter three numbers below");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        boolean s1 = n1 == n2 && n1 == n3;
        boolean s2 = n1 == n2;
        boolean s3 = n2 == n3;
        boolean s4 = n1 == n3;


        if (s1){
            System.out.println("all equal");
        }else if (s2){
            System.out.println("n1" + " "+ "n2" + " are equal");
        }else if (s3){
            System.out.println("n2" + " "+ "n3" + " are equal");
        }else if (s4){
            System.out.println("n1" + " "+ "n3" + " are equal");
        }else{
            System.out.println("none of them are equal");
        }








    }






}
