package day36_Inheritance;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone i1 = new Iphone();
        i1.setInfo("Iphone", "13S", "7 inch", "white", 3000);
        i1.faceTime(1234565654);
        System.out.println(i1);

        System.out.println("--------------------");

        Samsung Galaxy15 = new Samsung();
        Galaxy15.color = "Blue";
        System.out.println(Galaxy15);


    }


}
