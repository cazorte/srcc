package day15_PracticeTasks;

import java.util.Scanner;

public class SumOfEvenTo100 {
    public static void main(String[] args) {
        System.out.println("Please enter number that will calculated sum of from 1:");
        int num=new Scanner(System.in).nextInt();
        int sum=0;

        for (int i = 0; i <= num; i++) {
            if (i%2==0) {
                sum += i;
            }
        }
        System.out.println("sum of even number to "+num+ ": " + sum);
        sum=0;
        for (int i = 0; i <= num; i++) {

            if (i%2==1){
                sum +=i;
            }

        }
        System.out.println("sum of odd number to "+num+ ": " + sum);



    }
}
