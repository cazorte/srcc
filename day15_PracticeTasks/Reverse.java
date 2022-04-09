package day15_PracticeTasks;

public class Reverse {
    public static void main(String[] args) {

        String word = "Wooden Spoon";
        String result="";
        boolean result1=true;

        for (int i = word.length()-1; i >=0 ; i--) {

            result+= word.charAt(i);


        }
        System.out.println("result = " + result);


        System.out.println("----------------------");
        String palin = "AdanadA";

        for (int i = 0; i < palin.length(); i++) {
            result1= (palin.charAt(i)== palin.charAt(palin.length()-(i+1)));
        }
        System.out.println(result1);





    }




}
