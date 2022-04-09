package day19_PracticeTasks;

import java.util.Scanner;

public class GradeCalculate {

    public static void main(String[] args) {

        while (true){
            System.out.println("Enter your score");
            Scanner input=new Scanner(System.in);
            int score = input.nextInt();

            if (!( score>0 && score<=100 )){
                System.err.println("Invalid entry");
                System.exit(0);
            }

            String result =(score<=100 && score>=90 )? "A"  :(score>=80 && score<89)? "B" :(score>=70 && score<79)? "C"
                    :(score>=60 && score<69)? "D": "F";
            System.out.println(result);

            System.out.println("Would you like to continue?");
            String response = input.next();

            if ( !(response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("no"))){
                System.err.println("Invalid entry");
                System.exit(0);
            }

            if (response.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                System.exit(0);
            }


        }





    }
}
/*
Write a program for grade calculator:
			1. Ask the user "Enter your score"
				If user enters invalid score, terminate the program after displaying the error message
"Invalid Entry"

			 2. Display the grade of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F

			2. Ask the user would you like to continue
				If "yes" --> repeat the previous steps
				If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message
"Invalid Entry"
 */