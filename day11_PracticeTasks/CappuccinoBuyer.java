package day11_PracticeTasks;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size="ventii";
        String result="";
        double value=0;
        int cal =0;


        if (size== "tall" || size=="grande" || size == "venti"){

            if (size=="tall"){
                value=3.69;
                cal=90;
            }else if (size=="grande"){
                value=3.99;
                cal=120;
            }else{
                value=4.29;
                cal=150;
            }


        }else System.out.println("Invalid size");
        System.out.println("price is $ "+value + "\n"+cal+" calories");


    }
}
