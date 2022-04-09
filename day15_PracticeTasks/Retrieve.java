package day15_PracticeTasks;

public class Retrieve {
    public static void main(String[] args) {

        String word = "mn@#1  23Ab!";


        String digitResult="";
        String lettersResult="";
        String specialResult="";

/*
        for (int a = 0; a <= word.length()-1; a++) {
            for (char i ='0'; i <='9' ; i++) {
                if (word.charAt(a)== i) {
                    digitResult+= word.charAt(a);
                }
            }
            for (char i = 'a'; i <='z' ; i++) {
                if (word.charAt(a)== i){
                    lettersResult+= word.charAt(a);
                }
            }
            for (char i = 'A'; i <='Z' ; i++) {
                if (word.charAt(a)== i){
                    lettersResult+= word.charAt(a);
                }
            }
            for (char i = 0; i <=47 ; i++) {
                if (word.charAt(a)== i){
                    specialResult+= word.charAt(a);
                }
            }
            for (char i = 58; i <=64 ; i++) {
                if (word.charAt(a)== i){
                    specialResult+=word.charAt(a);
                }
            }
            for (char i = 91; i <=96 ; i++) {
                if (word.charAt(a)== i){
                    specialResult+=word.charAt(a);
                }
            }
            for (char i = 123; i <=256 ; i++) {
                if (word.charAt(a)== i){
                    specialResult+=word.charAt(a);
                }
            }



        }
        */
        for (int i = 0; i < word.length(); i++) {
            char ch=word.charAt(i);

            if (ch >= '0'&& ch<='9' ){
                digitResult+=ch;
            }else if (ch>='a' && ch<='z'){
                lettersResult+=ch;
            }else if (ch>='A' && ch<='Z'){
                lettersResult+=ch;
            }else{
                if ((ch!=' '))
                specialResult+=ch;
            }


        }
        System.out.println("digits: " + digitResult);
        System.out.println("letters: " + lettersResult);
        System.out.println("special: " + specialResult);








    }
}
