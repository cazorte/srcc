package day18_PracticeTasks;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result = 0;

        while (true) {
            System.out.println("Enter the first number");
            double number1 = input.nextDouble();

            System.out.println("Enter a math operator");
            char operator = input.next().charAt(0);

            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.err.println("Invalid operator, please re-enter again...");
                operator = input.next().charAt(0);
            }

            System.out.println("Enter the second number");
            double number2 = input.nextDouble();

            switch (operator) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    result = number1 / number2;
                    break;
            }
            System.out.println("result: " + result);

            System.out.println("Do you want to continue??");
            String continuE = input.next();
            while (!(continuE.equalsIgnoreCase("no") || continuE.equalsIgnoreCase("yes"))) {
                System.err.println("Invalid entry, please re-enter again...");
                continuE = input.next();
            }

            if (continuE.equalsIgnoreCase("no")) {
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }

        }


        input.close();

    }
}
