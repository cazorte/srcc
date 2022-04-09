package day09_MultiBranch;

public class OxygenTank {
    public static void main(String[] args) {
        int level = 60;
        String text;
        String text1= "Your tank is full";
        String text2= "Still okay";
        String text3= "Don't go too far";
        String text4= "Start to head back";
        String text5= "Be careful now you at 50%";
        String text6= "WARNING WARNING WARNING";
        boolean s1= level >90,
        s2=level>80 && level<=90,
                s3 =level>70 && level<=80,
        s4=level>60 && level<=70,
                s5=level>50 && level<=60
        ;

        if (s1){
            text = text1;
        }else if (s2) {
            text = text2;
        } else if (s3){
            text = text3;
        }else if (s4){
            text = text4;
        }else if (s5){
            text = text5;
        }else {
            text = text6;
        }
        System.out.println(text);




    }
}
