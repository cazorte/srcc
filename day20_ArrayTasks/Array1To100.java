package day20_ArrayTasks;

import java.util.Arrays;

public class Array1To100 {

    public static void main(String[] args) {

        int num =100;

        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers [i]= i+1;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("-------------------");

        int[] numbersReverse = new int[num];

        for (int j = num; j >0; j--,num-=2) {
            numbersReverse [j-num] =j;
        }
        System.out.println(Arrays.toString(numbersReverse));



    }
}
