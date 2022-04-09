package day20_ArrayTasks;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int[] reversedArray =new int[arr.length];

        for (int i = reversedArray.length-1, k=0; i >=0; i--,k++) {
            reversedArray[k]= arr[i];
        }
        System.out.println(Arrays.toString(reversedArray));

    }
}
