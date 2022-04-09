package KahhotIcinSorular;

import java.util.Arrays;

public class ArsivSorular {
    public static void main(String[] args) {

        int[] qwe ={1,5,45,7};
        addElement(qwe, 1005);  // qwe[] mi olmalı yoksa qwe mi olmalı???

        System.out.println("---------------------");

        int c=0;
        int d=0;
        int num1 =3;
        int num2 =4;
        deneme(num1,num2);
        System.out.println(c);
        System.out.println(denemeReturn(num1,num2));
        System.out.println(d);



    }
    public static void deneme(int a, int b){
        int c = a*a+b*b;
        System.out.println(c);
    }
    public static int denemeReturn(int a, int b){
        int d = a*b+a*b;
        return d;
    }




    //addElement
    public static void addElement(int[] arr, int number){
        int result[] = Arrays.copyOf(arr, arr.length+1);
        result[arr.length] = number;
        System.out.println(Arrays.toString(result));
    }

    public static int[] sort(int[] arr){     //farklı return isimleri gönder, başta farklı isimde arr çeşitleri main içinde tanımla
        int arr1[]={1,2,3};
        return arr;
    }


    //System.out.println(wordCount("hello java how re u"));

    //count word
    public static int wordCount(String words){
        int count =0;
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == ' '){
                count++;
            }
        }
        return count++;     //SONUC NE OLUR??
    }


}
