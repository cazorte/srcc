package day17_PracticeTasks;

import java.util.Scanner;

public class DivideWithoutDivisionAndMultpy {
    public static void main(String[] args) {

        //Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();
        int divisor = 0;
        int remainder = 0;
        int multply10 = 0;
        while (num1 >= num2) {        //  35  3
            num1 -= num2;
            divisor++;
        }
        for (int i = 1; i <= 10; i++) {
            multply10 += num1;
        }
        while (multply10 >= num2) {
            multply10 -= num2;
            remainder++;
        }
        System.out.println("result = " + divisor + "," + remainder);

    }
}
