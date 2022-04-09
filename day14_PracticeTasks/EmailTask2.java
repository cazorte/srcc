package day14_PracticeTasks;

import java.util.Locale;
import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your mail:");
        String mail = input.nextLine();

        String name = mail.substring(0, mail.indexOf("_"));
        String surname = mail.substring(mail.indexOf("_")+1 , mail.indexOf("@") );
        String domain = mail.substring(mail.indexOf("@")+1, mail.indexOf(".")  );

        String nameF =mail.substring(0,1);
        nameF = nameF.toUpperCase();
        name = nameF+ name.substring(1);

        String surnameF =surname.substring(0,1);
        surnameF = surnameF.toUpperCase();
        surname = surnameF+surname.substring(1);



        System.out.println("First name: "+name);
        System.out.println("Last name: "+surname);
        System.out.println("Domain: "+domain);






    }
}
