package day21_ArrayForEach;

import java.util.Arrays;

public class Warming {
    public static void main(String[] args) {

        int[] arr = {45,7,5,6,8,45,78,9,46,65,654,645,4,};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------------------------");

        int oddCount=0, evenCount=0 ,a=0,b=0 ;
        int[] eachArr = new int[arr.length], oddArr = new int[arr.length];
        for (int each : arr) {
            if (each%2==0){
                evenCount++;
                eachArr[--evenCount] = each;
                evenCount++;

            }else{
                oddCount++;
                oddArr[--oddCount] = each;
                oddCount++;
            }
        }

        System.out.println("Even number's count: "+evenCount);
        System.out.println("Even array is : "+ Arrays.toString(eachArr));
        System.out.println("Odd number's count: "+oddCount);
        System.out.println("Odd array is : "+ Arrays.toString(oddArr));
        System.out.println("--------------------");

        int arr1[]= {1,2,3,4,5};
        int[] arr2= {4,5,6,7,8};

        for (int outerLoop : arr1) {
            for (int innerLoop : arr2) {
                if (outerLoop == innerLoop){
                    System.out.print(" "+outerLoop);
                }

            }
        }
        System.out.println();
        System.out.println("-------------");

        String[] palindrome ={"anna", "level", "Java", "adanada"};
        int count =0;

        for (String eachP : palindrome) {
            String reversed="";
            for (int i = eachP.length()-1; i >=0 ; i--) {
                reversed += "" + eachP.charAt(i);
            }
            if (eachP.equals(reversed)){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("-----------------");


        int[] arr4 = {30, 10, 20};
        int [] arr5 = {15, 40, 25, 35};
        int[] arr6 = {8, 9, 17, 5, 4, 1};

        int[] resultArr= new int[arr4.length+ arr5.length+ arr6.length];


        for (int each : arr4) {
            resultArr[a++]=each;
        }
        for (int each : arr5) {
            resultArr[a++] = each;
        }
        for (int each : arr6) {
            resultArr[a++] = each;
        }
        System.out.println(Arrays.toString(resultArr));





    }
}
