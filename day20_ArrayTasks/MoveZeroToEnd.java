package day20_ArrayTasks;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {

        int arr[] ={10,0,5,0,1,0};
        int result[]= new int[arr.length];
        int k=arr.length-1;
        int l=0;
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int first =arr[i];

            if (first==0){
                result[k--]= first;
            }else {
                result[l++]= first;
            }
        }
        System.out.println(Arrays.toString(result));



    }
}
