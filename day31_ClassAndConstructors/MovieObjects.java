package day31_ClassAndConstructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieObjects {
    public static void main(String[] args) {




        Movie myMovie = new Movie("USA", "Journey of the movie", "Adventure, Comedy, Thriller",
                "10/25/2021", "Kuzzat");

        myMovie.casts.add("Asiya");
        String castArr[] = {"Adam", "Muhtar", "Ali", "Ahmet", "Veli", "Mehmet"};
        myMovie.casts.addAll(Arrays.asList(castArr));


        System.out.println(myMovie);





    }






}
