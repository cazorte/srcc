package day19_PracticeTasks;

import java.util.Scanner;

public class HighestFreqOfChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str ="aasseeeeeeeeeeddssaasddsasdasfgdrerfggnjtggwerg";
        int highest=0;
        char answer=' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count =0;
            for (int k = 0; k < str.length(); k++) {
                char each= str.charAt(k);
                if (ch==each){
                    count++;
                }
            }
            if (count>highest) {
                highest = count;
                answer = ch;
            }
        }
        System.out.println("highest frequency character is: "+answer+ " and frequency is "+highest);



    }
}
