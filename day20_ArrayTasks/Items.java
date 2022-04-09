package day20_ArrayTasks;

import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] items = new String[5];
        double[] prices = new double[5];
        double sum =0;

        for (int i = 0; i < items.length; i++) {
            System.out.println("Item name: ");
            items[i] = scan.next();
            System.out.println("Items price: ");
            prices[i] = scan.nextDouble();
            sum+=prices[i];
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Items is:  \""+items[i] + "\" and it's price is: \t"+ prices[i]);
        }
        System.out.println("\t\tTotal price is: \t\t"+ sum);







    }
}
