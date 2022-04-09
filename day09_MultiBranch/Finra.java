package day09_MultiBranch;

import java.util.Scanner;

public class Finra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter new number: ");
        int num= input.nextInt();
        boolean s1 = num %3 ==0 && num%5!=0;
        boolean s2 = num %3 !=0 && num%5 ==0;
        boolean s3 = num %3 ==0 && num%5 ==0;

        //num %3 ==0 && num%5!=0 FIN
        //num %3 !=0 && num%5 ==0 RA
        // num %3 ==0 && num%5 ==0  FINRA

        if (s1){
            System.out.println("FIN");
        }else if(s2){
            System.out.println("RA");
        }else if(s3){
            System.out.println("FINRA");
        }else{
            System.out.println("");
        }



    }
}
