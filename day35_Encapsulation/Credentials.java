package day35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Credentials {

    private String username, password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        for (char each : username.toCharArray()) {
            if (each==' ') return;
        }
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        for (char each : password.toCharArray()) {

            if (each==' ') return;
        }

        int countLetter=0;
        int countDigit=0;
        int countSpecial=0;
        for (char each : password.toCharArray()) {
            if (Character.isLetter(each)) countLetter++;
            if (Character.isDigit(each)) countDigit++;
            if (!Character.isLetterOrDigit(each)) countSpecial++;
        }
        if (countLetter<=0) return;
        if (countDigit<=0) return;
        if (countSpecial<=0) return;

        if (password.length()<8) return;
        this.password = password;
    }

    public Credentials(String username, String password) {
       setPassword(password);
       setUsername(username);
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
