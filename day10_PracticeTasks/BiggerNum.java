package day10_PracticeTasks;

public class BiggerNum {
    public static void main(String[] args) {
        int n1=-80, n2=-50, n3=-20;
        String result="";
        boolean con1= n1>n2 && n1>n3;  //n1 is bigger
        boolean con2= n2>n1 && n2>n3;  // n2 is bigger
        boolean con3= n3>n1 && n3>n2;   // n2 is bigger

        if (con1 || con2 || con3)
            result =(con1)? "n1 is bigger" :(con2)?"n2 is bigger" : "n3 is bigger";

        else result = "Please use different number";

        System.out.println(result);



    }
}
