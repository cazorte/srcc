package day20_ArrayTasks;

import java.util.Scanner;

public class Classmates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result="";
        String[] classmates = {"asd q","qweq df ", "wqwe er", "ghjg rty", "trhr yyy ", "asdqw bv","qwdasd  zz"};

        for (int i = 0; i < classmates.length; i++) {
            System.out.println(classmates[i]);
        }

        System.out.println("-----------------");

        String[] classmates2 = {"Java", "python", "C#", "Selenium", "etc"};

        for (int k = 0; k < classmates2.length; k++) {
            String a = classmates2[k];
            result="";
            for (int i = a.length()-1; i >=0; i--) {
                result+=""+a.charAt(i);
            }
            System.out.println(result);
        }






    }
}
