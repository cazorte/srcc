package day19_PracticeTasks;

import java.util.Scanner;

public class FirstUniqueOtherSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "asdasdasdfqweqweqw";//scan.nextLine().toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.length() - 1 == str.replace(str.substring(i, i + 1), "").length()) {
                System.out.println("Index number of first unique character and the character: " + i + ", " + str.charAt(i));
                break;
            }
        }
    }
}
