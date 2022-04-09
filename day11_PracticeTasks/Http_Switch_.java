package day11_PracticeTasks;

import java.util.Scanner;

public class Http_Switch_ {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int StatusCode =203;
        String out="";

        switch (StatusCode){
            case 200: out= "OK"; break;  case 201:out= "Created"; break; case 202: out= "Accepted"; break;
            case 301: out= "Moved Permanently"; break;  case 303:out= "See Other"; break; case 304: out= "Not Modified"; break;
        }
        System.out.println(out);



    }
}
