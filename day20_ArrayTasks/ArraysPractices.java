package day20_ArrayTasks;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractices {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a size of the array:");
        int size = scan.nextInt();
        double sum =0;

        double[] arr = new double[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number");
            arr[i]= scan.nextDouble();
            sum+=arr[i];

        }
        double result =sum/size;
        System.out.println("average of the numbers = " + result);



    }
}
