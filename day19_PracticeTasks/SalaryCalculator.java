package day19_PracticeTasks;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        while(true){
            System.out.println("How much you make an hour?");
            double hourlyRate = input.nextDouble();
            if (hourlyRate<=0){
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }
            System.out.println("How many hours do you work per week?");
            double weeklyHour = input.nextDouble();
            if (weeklyHour<1 || weeklyHour>144){
                System.err.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }
            System.out.println("Enter your state tax rate");
            double tax = input.nextDouble();
            if (tax<1 || tax>10){
                System.err.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }
            double gross=hourlyRate*weeklyHour*4;
            double federal =gross*0.26;
            double state = gross/100*tax;
            double totalTax = federal+state;
            double netIncome = gross-totalTax;
            System.out.println("Gross Salary \t:" +gross );
            System.out.println("Federal Tax \t:" +federal );
            System.out.println("State Tax \t:" +tax );
            System.out.println("Total Tax \t:" +totalTax );
            System.out.println("Net Income \t:" +netIncome );

            System.out.println("Would you like to continue?");
            String response = input.next();
            if (!(response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("no"))){
                System.err.println("Invalid Entry");
                System.exit(0);
            }
            if (response.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }


        }

    }
}
/*
Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative,
terminate the program after displaying the error message "Invalid Entry for Hourly Rate"
			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144,
terminate the program after displaying the error message "Invalid Entry for Weekly Hours"
			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%,
terminate the program after displaying the error message "Invalid Entry for state tax Rate"
			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income
			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message
"Invalid Entry"
 */