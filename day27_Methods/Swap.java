package day27_Methods;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        arr = swap(arr, 0,4);
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------");
        String arr2[] ={"qwe","asd","rty","xzcv"};
        arr2 = swap(arr2,1,3);
        System.out.println(Arrays.toString(arr2));

    }

    public static int[] swap(int[] array, int index1, int index2){
        if (index1<0 || index1> array.length-1 || index2<0 || index2> array.length-1){
            System.err.println("Invalid index number");
            System.exit(0);
        }

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }
    public static double[] swap(double[] array, int index1, int index2){
        if (index1<0 || index1> array.length-1 || index2<0 || index2> array.length-1){
            System.err.println("Invalid index number");
            System.exit(0);
        }

        double temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }
    public static char[] swap(char[] array, int index1, int index2){
        if (index1<0 || index1> array.length-1 || index2<0 || index2> array.length-1){
            System.err.println("Invalid index number");
            System.exit(0);
        }

        char temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }
    public static String[] swap(String[] array, int index1, int index2){
        if (index1<0 || index1> array.length-1 || index2<0 || index2> array.length-1){
            System.err.println("Invalid index number");
            System.exit(0);
        }

        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }



}
