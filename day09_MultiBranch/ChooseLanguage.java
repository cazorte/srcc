package day09_MultiBranch;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Chose your language "+"\n for English: \t1; "+"\n for Spanish: \t2; "+"\n for Turkish: \t3; " +
                ""+"\n for Russian: \t4; "+"\n for French: \t5; ");
        int num = input.nextInt();

        boolean english = num ==1;
        boolean spanish = num ==2;
        boolean turkish = num ==3;
        boolean russian = num ==4;
        boolean french = num ==5;




        if (english){
            System.out.println("Hello, thank for your call");
        }
        else if (spanish){
            System.out.println("Hola, gracias para llmar");
        }else if (turkish){
            System.out.println("Merhaba, aradiginiz için teşekkürler");
        }else if (russian){
            System.out.println("Privet, spasibo za vash zvonok");
        }
        else if (french){
            System.out.println("Merci, pour votre appel");
        }
        else{
            System.out.println("please choose correct number");
        }






    }






}
