package day27_Methods;

import java.util.Arrays;

public class InsertArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,5,51,54,57};
        arr = insert(arr,3,500);
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------");
        String [] arr2 = {"hk","tfdh","jhkjh","oıuıu"};
        arr2 = insert(arr2, 1,"450");
        System.out.println(Arrays.toString(arr2));

    }


    public static int[] insert(int[] array, int index, int element){

        int result[] = new int[array.length+1];

        int k=0;
        for (int i = 0; i < result.length; i++) {
            if (i==index){
                continue;
            }
            result[i]=array[k++];
        }
        result[index] = element;

        return result;
    }
    public static double[] insert(double[] array, int index, double element){

        double result[] = new double[array.length+1];

        int k=0;
        for (int i = 0; i < result.length; i++) {
            if (i==index){
                continue;
            }
            result[i]=array[k++];
        }
        result[index] = element;

        return result;
    }
    public static char[] insert(char[] array, int index, char element){

        char result[] = new char[array.length+1];

        int k=0;
        for (int i = 0; i < result.length; i++) {
            if (i==index){
                continue;
            }
            result[i]=array[k++];
        }
        result[index] = element;

        return result;
    }
    public static String[] insert(String[] array, int index, String element){

        String result[] = new String[array.length+1];

        int k=0;
        for (int i = 0; i < result.length; i++) {
            if (i==index){
                continue;
            }
            result[i]=array[k++];
        }
        result[index] = element;

        return result;
    }



}
/*
1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array
 */
