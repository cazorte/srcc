package day24_Methods;

import java.util.Arrays;

public class PracticeTask {

    public static void main(String[] args) {

        String sentence = "Java java java python python";
        String word1 = "java";
        int result = frequencyOfWord(sentence,word1);
        System.out.println(result);

        System.out.println("-----------------");
        isAnagram("cba", "abcs");

        System.out.println("---------------------");
        String a =reversed("AnilAydemir");
        System.out.println(a);


        System.out.println("------------------");
        isPalindrome("Level");

        System.out.println("------------------------");
        int[] arrayNumbers={1,1,1,1,1,2,2};

        int freqNumber =freqNumber(arrayNumbers, 1);
        System.out.println(freqNumber);
        System.out.println("----------------");

        int[] qwe ={1,5,45,7};
        addElement(qwe, 1005);
        System.out.println("---------------");

        int asd[]={1,4,5,6,2,45,78,9};
        int [] qwe1 = {1002,14578,0};
        merge(asd,qwe1);
        System.out.println("---------------");

        int[] dfgdfg = reverse(qwe1);

        System.out.println(Arrays.toString(dfgdfg));
        System.out.println("---------------------");

        int[] ornek = {4,7,5,987,56,21,65,45,6,6};
        System.out.println(contain(ornek, 6));

        System.out.println("--------------------");

        int[] ornek2 = {4,5,65,65,41,2,54,65,1};
        int [] newOrnek2 =remove(ornek2, 5);
        System.out.println(Arrays.toString(newOrnek2));

    }
    // remove integer(index)
    public static int[] remove(int[] arr, int index){
        int[] newArray =new int[arr.length-1];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if (i==index){
                continue;
            }
            newArray[k++] = arr[i];
        }


        return newArray;
    }

    //contains
    public static boolean contain(int[] arr, int number){
        boolean x = false;
        for (int each : arr) {
            if (each == number){
                x = true;
            }
            }

        return x;
    }

    //reverse
    public static int[] reverse(int[] arr2){
        int leng= arr2.length;
        int result1[]=new int[arr2.length];
        for (int i = 0; i <leng; i++) {
            result1[i] = arr2[arr2.length-(i+1)];
        }
        return result1;
    }

    //merge
    public static void merge(int arr1[],int [] arr2) {
        int result[]= Arrays.copyOf(arr1, arr1.length+arr2.length);
        int a = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            result[a++] = arr2[i];
            //return;
        }
        System.out.println(Arrays.toString(result));
    }

    //addElement
    public static void addElement(int[] arr, int number){
        int result[] =Arrays.copyOf(arr, arr.length+1);
        result[arr.length] = number;
        System.out.println(Arrays.toString(result));
    }

    //Frequency of the numbers
    public static int freqNumber (int[] array, int number2) {
        int counter =0;
        for (int i : array) {
            if (i==number2){
                counter++;
            }
        }
        return counter;
    }

    // isPalindrome
    public static void isPalindrome(String wordP) {
        boolean result1 =wordP.equalsIgnoreCase(reversed(wordP));
        System.out.println(result1);
    }

    //reversed
    public static String reversed(String word) {
        String temp =word;
        word="";
        for (int i = temp.length()-1; i >=0 ; i--) {
            word+=""+temp.charAt(i);

        }
        return word;
    }

    //isAnagram
    public static void isAnagram(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = word2.toCharArray();
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)){
            System.out.println("true");
        }else System.out.println("false");

    }

    //frequencyOfWord
    public static int frequencyOfWord(String sentence, String word) {
        String temp="";
        int freq=0;
        String arr[] =sentence.split(" ");
        for (String s : arr) {
            if (s.equalsIgnoreCase(word)){
                freq++;
            }
        }
        return freq;

    }




}
