package day19_PracticeTasks;

import java.util.Scanner;

public class CalculateSquare {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter the side of the square:");
            Scanner input = new Scanner(System.in);
            double side = input.nextDouble();
            if (side == 0 || side < 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }
            double area = side * side;
            double perimeter = 4 * side;
            System.out.println("Area of square: " + area);
            System.out.println("Perimeter of square: " + perimeter);

            System.out.println("Would you like to calculate another Square?");
            String response = input.next();
            while (!(response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry, please re-enter again:");
                response = input.next();
            }
            if (response.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }
        }

    }
}
/*
Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */