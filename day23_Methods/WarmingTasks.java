package day23_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class WarmingTasks {

    public static void main(String[] args) {

        oddNumber1to100();
        System.out.println("\n---------------------");
        evenNumber1to100();
        System.out.println("\n-------Checking eligible to buy alcohol--------------");
        System.out.println("What is your age?");
        Scanner input = new Scanner(System.in);
        int age = 18;//input.nextInt();
        eligibleBuyAlcohol(age);
        System.out.println("\n-------Checking eligible to vote--------------");

        int num =18;
        String country ="USA";
        eligibleToVote(num,country);
        System.out.println("---------------------");

        gradeCalculation(75);
        System.out.println("-----------------");
        double radius= 5.5;
        System.out.println("radius "+ radius );
        calculateCircle(radius);
        System.out.println("-----------------------");

        double shortEdge = 4, longEdge = 10;
        calculateSquareArea(shortEdge,longEdge);
        System.out.println("-----------------");

        double dolar = 10;
        convertDollarEuro(dolar);
        System.out.println("--------------");

        dolar = 20;
        convertDolarTL(dolar);
        System.out.println("-----------------");

        double kilo = 100;
        convertKiloLibre(kilo);
        System.out.println("-----------------");

        int number = -5;
        System.out.print(number + " ");
        numberPosNegZero(number);
        System.out.println("----------------");

        printEachChar("Anıl Aydemir");
        System.out.println();
        System.out.println("----------------");
    
        int[] arr = {1,2,3,4,5};
        printEachElement(arr);
        System.out.println("\n-------------------");

        calculator(5,4,'/');
        System.out.println("----------------");

        printFullname("aNil","ayDeMIr" );
        System.out.println("-----------------------");

        checkingAnagram("silent", "listeni");
    }

    public static void checkingAnagram(String firstWord, String secondWord) {

        char [] arr1 = firstWord.toCharArray();
        char [] arr2 = secondWord.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)){
            System.out.println(firstWord+" and "+secondWord+ " are anagram");
        }else System.out.println(firstWord+" and "+secondWord+ " are NOT anagram");

    }
    //create a method that can check if two strings are anagram
    //    		ex:
    //    			anagram("silent", "listen")
    //
    //
    //			output:
    //				silent and listen are anagram

    public static void printFullname(String name, String lastName) {
        String fullName ="";
        fullName+=name.toUpperCase().substring(0,1)+name.toLowerCase().substring(1)+" ";
        fullName+=lastName.toUpperCase().substring(0,1)+lastName.toLowerCase().substring(1);
        System.out.println(fullName);
    }
    //write a method that can print out the full name of a person in regular format
    //            ex:
    //               fullName("cYdEo", "SCHOOL");
    //
    //                output:
    //                    "Cydeo School"

    public static void calculator(double num1, double num2, char mathOperator) {
        double result=0;
        if(mathOperator=='+' || mathOperator=='-' || mathOperator=='*' || mathOperator=='/'){
            switch (mathOperator){
                case '+': result =num1+num2; break;
                case '-': result = num1-num2; break;
                case '*': result = num1*num2; break;
                case '/': result = num1/num2; break;
            }

            System.out.println("result of: "+num1+" "+mathOperator+" "+num2+" = "+result);
            }
        if (!(mathOperator=='+' || mathOperator=='-' || mathOperator=='*' || mathOperator=='/')){
            System.out.println("Invalid math operator\nPlease try again");
        }

    }
    //15. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result

    public static void printEachElement(int[] arr)  {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    //14. create a method named printEachElement that can print each elements of an integer array

    public static void printEachChar(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i)+" ");
        }
    }
    //13. create a method named printEachChar that can print each characters of a string

    public static void numberPosNegZero(int num) {
        String result = (num==0)? "Zero" :(num >0)? "Positive" : "Negative";
        System.out.println("Number is "+result);
    }
    //12. create a method that can if the given integer is positive, negative or zero

    public static void convertKiloLibre(double kilo) {
        Double libre = kilo/1.8;
        System.out.println(kilo+" kilo is equal "+libre+" libre.");
    }
    //11. create a method that can convert kg to lb

    public static void convertDolarTL(double dolar) {
        double TL = dolar*14.5;
        System.out.println(dolar+" $ is equal "+ TL+" Turkish Lira");
    }
    //10. create a method that can can convert dollar to lira

    public static void convertDollarEuro(double dolar) {
        double euro = dolar/1.2;
        System.out.println(dolar+ " $ is the "+ euro+ " Euro");

    }
    //create a method that can convert dollar to euro

    public static void calculateSquareArea(double shortEdge, double longEdge) {
        double area = shortEdge*longEdge;
        System.out.println("Area of the Square "+area);
    }
    //7. create a method that can calculate the area of a square

    //6. create a method that can calculate the area of a circle
    public static void calculateCircle(double radius) {
        double area = radius*radius*3.14;
        System.out.println("Area of the circle : "+ area);

    }

    //create a method that can calculate the grade of the student based on the score
    public static void gradeCalculation(int score) {
        String grade="";
        grade = (score<=100 && score>=90)? "A" : (score<90 && score>=80) ? "B" :(score>=70 && score<80)? "C" : "F";
        System.out.println(grade);
    }

    public static void eligibleToVote(int num, String country ) {
        if (num>18 && country.equalsIgnoreCase("usa")){
            System.out.println("Person is eligible to vote");
        }
        else System.err.println("Person is not eligible to vote");
    }
/* create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!
 */

    //3. create a method that can check if a person is eligible to buy alcohol
    public static void eligibleBuyAlcohol(int age) {
        if (age>18){
            System.out.println("Person eligible to buy alcohol");
        }else System.err.println("Person is not eligible to buy alcohol");
    }

    //2. create a method that can print even numbers between 1~100 in a same line saperated by space
    public static void evenNumber1to100() {
        for (int i = 0; i < 101; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
    }

    //1. create a method that can print odd numbers between 1~100 in a same line saperated by space
    public static void oddNumber1to100() {
        for (int i = 2; i <101 ; i++) {
            if (i%2 ==0){
                System.out.print(i+" ");
            }
        }

    }




}
