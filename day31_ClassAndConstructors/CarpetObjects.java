package day31_ClassAndConstructors;

public class CarpetObjects {

    public static void main(String[] args) {

        Carpet myCarpet = new Carpet( 5,3.6,150,false);
        System.out.println(myCarpet);

        Carpet my2 =new Carpet(1,1,1,true);
        System.out.println(my2);

        my2.width = 10.5;
        int a = (int) my2.calcCost();
        System.out.println(my2 );
        System.out.println(a);





    }


}
