package day20_ArrayTasks;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArrayFindMinMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int num = input.nextInt();
        int referance=0;
        int maxNumber=0;

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter a number: ");
            arr[i] = input.nextInt();

            if (arr[i]>referance){          //bug because of neg number
                maxNumber = arr[i];
                referance= maxNumber;
            }

        }
        int minNumber = arr[0];
        for (int k = 0; k < num; k++) {
            if (arr[k] < minNumber){
                minNumber = arr[k];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum number is : "+maxNumber);
        System.out.println("Minimum number is : "+minNumber);




    }
}
