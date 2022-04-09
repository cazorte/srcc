package day31_ClassAndConstructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country, title, genre, releaseDate, director;
    ArrayList<String> casts = new ArrayList<>();

    public Movie (String country, String title, String genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
        this.casts = casts;
    }

    public  void addCast(String artist) {
        casts.add(artist);
    }

    public void addCasts(String[] artists){
        casts.addAll(Arrays.asList(artists));
    }

    @Override
    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", total number of casts ='" + casts.size() + '\'' +
                '}';
    }
}
