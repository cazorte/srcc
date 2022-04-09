package day09_MultiBranch;

public class Calculator {
    public static void main(String[] args) {

        double n1, n2;
        char mathOperator;

        n1 = 10;
        n2 = 20;
        mathOperator = '-';

        boolean add = mathOperator == '+';
        boolean minus = mathOperator == '-';
        boolean multiply = mathOperator == '*';
        boolean divide = mathOperator == '/';

        if (add) {
            System.out.println("n1 = " + n1 + ", n2 = " + n2 + ", mathOperator = " + mathOperator);
            System.out.println("result = " + (n1+n2));
        }
            else if (minus){
                    System.out.println("n1 = " + n1 + ", n2 = " + n2 + ", mathOperator = " + mathOperator);
            System.out.println("result = " + (n1-n2));
        }
            else if (multiply) {
            System.out.println("n1 = " + n1 + ", n2 = " + n2 + ", mathOperator = " + mathOperator);
            System.out.println("result = " + (n1*n2));
        }
            else if (divide) {
            System.out.println("n1 = " + n1 + ", n2 = " + n2 + ", mathOperator = " + mathOperator);
            System.out.println("result = " + (n1/n2));
        }
            else{
                System.out.println("Invalid operator");
        }








    }






}
