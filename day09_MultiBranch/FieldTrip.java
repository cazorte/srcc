package day09_MultiBranch;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Please enter your grade number below:");
        String area1= "Apple orchard", teacher1= "Ms. Smith";
        String area2= "Zoo",teacher2= "Mr. Lee";
        String area3= "Aquarium",teacher3= "Ms. Wilson";
        String area4= "Movie theather",teacher4= "Ms. Reyes";
        String area5= "Museum",teacher5= "Ms. Lela";
        String area6= "Six Flags",teacher6= "Ms. Watt";



        int g = input.nextInt();

        if (g == 1){
            System.out.println(("Location - \t\t\t\t"+ area1) +
                    ( "\nNumber of group - \t\t")+g+
                    ("\nTeacher in charge - \t" )+ teacher1);
        }else if (g == 2){
            System.out.println(("Location - \t\t\t\t"+ area2) +
                    ( "\nNumber of group - \t\t")+g+
                    ("\nTeacher in charge - \t" )+ teacher2);
        }else if (g == 3){
            System.out.println(("Location - \t\t\t\t"+ area3) +
                    ( "\nNumber of group - \t\t")+g+
                    ("\nTeacher in charge - \t" )+ teacher3);
        }else if (g == 4){
            System.out.println(("Location - \t\t\t\t"+ area4) +
                    ( "\nNumber of group - \t\t")+g+
                    ("\nTeacher in charge - \t" )+ teacher4);
        }else if (g == 5){
            System.out.println(("Location - \t\t\t\t"+ area5) +
                    ( "\nNumber of group - \t\t")+g+
                    ("\nTeacher in charge - \t" )+ teacher5);
        }else if (g == 6) {
            System.out.println(("Location - \t\t\t\t" + area6) +
                    ("\nNumber of group - \t\t") + g +
                    ("\nTeacher in charge - \t") + teacher6);
        }


        else{
            System.out.println("Please enter CORRECT grade numbers");
        }







    }
}
