package day10_PracticeTasks;

public class GradeLevel {
    public static void main(String[] args) {

        byte number =19;
        String result="";

        if (number>0 && number <=18){
            if (number<6) result = "Elementer school";
            else if (number <9) result = "Middle school";
            else if (number <13) result = "High Scool";
            else if (number <17) result = "College";
            else result= "Grad School";
        }else{
            System.out.println("Invalid grade level given");
        }
        System.out.println(result);


    }



}
