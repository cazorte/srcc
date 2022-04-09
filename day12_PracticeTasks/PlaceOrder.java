package day12_PracticeTasks;

import java.util.Scanner;

public class PlaceOrder {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("What is the product name: ");
        String product = input.nextLine();

        System.out.println("Enter price please!");
        double price = input.nextDouble();

        System.out.println("Enter the quantity please!");
        int qua = input.nextInt();
        input.nextLine();

        System.out.println("Enter your first name: ");
        String name = input.nextLine();

        System.out.println(name+", your order for "+qua+ " Apples has been places. Your total is "+ qua * price       );

    }
}
/*PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)
            Print in the following format:
                Ex:                     Input: "Apples" , 1.5, 5. "Luke"
                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.


 */