package day17_PracticeTasks;

public class Divisible {
    public static void main(String[] args) {

        int number=100;
        String divisibleBy15="";
        String divisibleBy5="";
        String divisibleBy3="";

        for (int i = 1; i <=number ; i++) {

            if (i%15==0 && i%5==0 && i%3==0) divisibleBy15+=" "+i;

            if (i%5==0 && i%15!=0) divisibleBy5+=" "+i;

            if (i%3==0 && i%15!=0) divisibleBy3+=" "+i;

        }
        System.out.println(divisibleBy15);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3);



    }
}
