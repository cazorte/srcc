package day21_ArrayForEach;

import java.util.Arrays;

public class NumbersOfAppearances {
    public static void main(String[] args) {

        String str = "I love Java, but Java more Powerful than Python. the best Java";
        str = str.replace(",", "").replace(".", "");
        String[] arr = str.split(" ");

        System.out.println(Arrays.toString(arr));
        int i=0 , count=0, countPy=0;
        for (String each : arr) {
            boolean a =each.equals("Java");
            boolean b = each.equals("Python");
            if (a){
                count++;
            }else if (b)
                countPy++;

        }
        System.out.println("Java appearances number is : "+ count);
        System.out.println("Python appearances number is : "+ countPy);



    }
}
