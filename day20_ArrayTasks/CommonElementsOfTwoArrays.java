package day20_ArrayTasks;

public class CommonElementsOfTwoArrays {

    public static void main(String[] args) {

        int[] arr1 ={1,2,3,4,5,6,10,45};
        int[] arr2 = {4,5,45,7,8,47,52,69,78,3};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]== arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
            }


        }


    }


}
