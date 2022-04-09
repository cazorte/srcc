package day10_PracticeTasks;

public class Grade {
    public static void main(String[] args) {
        char x='b';
        String result="";

        if (x=='A') result="excellent";
        else if (x=='B') result = "great job";
        else if (x=='C') result="good";
        else if (x=='D') result="passed";
        else if (x=='F') result="failed";
        else result="Invalid Grade";

        System.out.println(result);






    }
}
