package day14_PracticeTasks;

import java.util.Scanner;

public class CalledTravel {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Do you have a valid passport (Yes or No)");
        String passport=input.next();
        input.nextLine();
        double base=1000;
        double cost=0;

        System.out.println("What is the name of country where you want travel?");
        String country= input.nextLine();

        System.out.println("How many bags you will take with?");
        byte bags = input.nextByte();
        cost = base+bags*50;

        System.out.println("How many people you will travel with?");
        short people = input.nextShort();
        input.nextLine();
        if (people>3){
            cost =cost + people*base-300;
        }else if (people>0 && people<4){
            cost = cost + people*base-(100*people);
        }

        System.out.println("Please enter the name of the people they will travel with in one line:");
        System.out.println("Please use comma with names");
        String names = input.nextLine();

        if (passport.equals("Yes")){




            System.out.println("Your ticket is booked to "+ country +". We have charged extra for the "+ bags+" bags \n" +
                    "\t\tbut you are traveling with "+names+" . so we are giving a discount. Your total cost is "+cost);





        }else{
            cost=cost+200;
            System.out.println("When your passport expired?");
            int expired = input.nextInt();
            input.nextLine();
            cost=cost+ expired*75;

            System.out.println("Will you travel in the next year?");
            String nextYear = input.nextLine();
            if (nextYear.equals("Yes")){
                cost = cost +100;
            }else cost= cost-50;

            System.out.println("Looks like your password has been expired for "+expired+" years \n" +
                    "but not to worry we will get it ready for you to travel to "+country+". Your total cost has come out to "+cost);




        }






    }
}