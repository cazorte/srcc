package day10_PracticeTasks;

public class AgeGroups {
    public static void main(String[] args) {
        String result = "asd";
        int age=-50;
        boolean con1 = age<21;
        boolean con2 = age>=21 && age<55;
        boolean con3 = age>=55;

        if (age>0 && age<=150)
            if (con1) result="Teenager";
            else if (con2) result ="adult";
            else result="Senior";

            else result="Invalid";

        System.out.println(result);




    }
}
