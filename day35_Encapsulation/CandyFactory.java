package day35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

        ArrayList<Candy> candies = new ArrayList<>();

        Candy c1 = new Candy("Sugar", 5, 4, true);
        Candy c2 = new Candy("Apple", 4, 7, true);
        Candy c3 = new Candy("Melon", 6, 0, true);
        Candy c4 = new Candy("Orange", 2, -5, true);
        Candy c5 = new Candy("Dark", 1, 10, true);

        candies.addAll(Arrays.asList(c1,c2,c3,c4,c5));

        for (Candy each : candies) {
            System.out.println(each.getBrand()+" : "+((each.getPrice() ==0) ? "free" : each.getPrice() ) );
        }


        System.out.println(c3);
        System.out.println(c4);


    }
}
