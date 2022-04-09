package day19_PracticeTasks;

import java.util.Scanner;

public class AreaPerimeterOfCircle {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        while (true){
            System.out.println("Enter the radius of the circle:");
            double radius =input.nextDouble();

            if (radius==0 || radius<0) {

                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }

            double diameter=radius*2;
            double area =3.14*radius*radius;
            double perimeter =diameter*3.14;
            System.out.println("1. Diameter of circle \t: "+diameter);
            System.out.println("2. Area of circle \t: "+area);
            System.out.println("3. Perimeter of circle \t: "+perimeter);

            System.out.println("Would you like to calculate another circle?");
            String response =input.next();
            if (response.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }
            while (!(response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("no"))){
                System.out.println("Invalid entry, please re-enter: ");
                response=input.next();
            }

        }









    }
}
