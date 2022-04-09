package day10_PracticeTasks;

public class StatusCode {
    public static void main(String[] args) {

        int statusCode=200;
        String result="";

        result = statusCode==200 ? "OK": statusCode==201? "Created":statusCode==202? "Accepted": statusCode==301? "Moved Permanently":     "";

        System.out.println(result);

    }
}
