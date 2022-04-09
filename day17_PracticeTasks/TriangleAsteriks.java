package day17_PracticeTasks;

import java.util.Scanner;

public class TriangleAsteriks {

    public static void main(String[] args) {

        System.out.println("Enter a number:");
        int num =new Scanner(System.in).nextInt();

        for (int i = 0; i <= num; i++) {
            for (int j= 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
   /*     // Method 1 Nested Loop
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
// Method 2 For loop with String
        String output = "";
        for (int i = 1; i <=10 ; i++) {
            output += "* " ;
            System.out.println(output);
        }
// Method 3 For loop with String repeat() method
        output = "* " ;
        for (int i = 1; i <=10 ; i++) {
            System.out.println(output.repeat(i));
        }
*/




    }
}
