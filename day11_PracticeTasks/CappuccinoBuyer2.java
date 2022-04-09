package day11_PracticeTasks;

public class CappuccinoBuyer2 {
    public static void main(String[] args) {
        String size="venti";
        String result="";
        double price=0;
        int cal=0;

        if (size=="tall"|| size=="grande" || size=="venti" ){
        switch (size) {
            case "tall":
                price = 3.69;
                cal = 90;
                break;
            case "grande":
                price = 3.99;
                cal = 120;
                break;
            case "venti":
                price = 4.29;
                cal = 150;
                break;
        }
            System.out.println("price is $"+price +"\n"+cal+" calories");


        }
        else System.out.println("Invalid Size");





    }
}
