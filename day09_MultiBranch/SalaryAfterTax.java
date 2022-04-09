package day09_MultiBranch;

import java.util.Objects;
import java.util.Scanner;

public class SalaryAfterTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int taxRate;
        int b;
        System.out.println("Please enter your Salary below");
        int salary = input.nextInt();
        int result = 0;
        boolean s1 = salary >=130_000;
        boolean s2 =salary >=100_000 && salary <130_000;
        boolean s3 =salary >=80_000 && salary <100_000;
        boolean s4 = salary <80000;
        
        System.out.println("Please if you married enter (1) ");
       int marry =input.nextInt();
       boolean mary = marry ==1;



        if (mary ) {
            b = 5;

            if (s1) {
                result = salary - (salary / 100 * (35 - b));
            } else if (s2) {
                result = salary - (salary / 100 * (30 - b));
            } else if (s3) {
                result = salary - (salary / 100 * (25 - b));
            } else if (s4) {
                result = salary - (salary / 100 * (20 - b));
            } else {
                System.out.println("Invalid entry");
            }
        } else {
            b=0;
            if (s1) {
                result = salary - (salary / 100 * (35));
            } else if (s2) {
                result = salary - (salary / 100 * (30 - b));
            } else if (s3) {
                result = salary - (salary / 100 * (25 - b));
            } else if (s4) {
                result = salary - (salary / 100 * (20 - b));
            } else {
                System.out.println("Invalid entry");
            }


        }

        System.out.println("your after tax Salary is = $" + result );








    }



}
