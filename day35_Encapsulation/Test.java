package day35_Encapsulation;

public class Test {

    public static void main(String[] args) {

        Square s1 = new Square(4.5);
        System.out.println(s1);


        Rectangle r1 = new Rectangle(4.5,6.1);
        System.out.println(r1);

        Carpet c1 = new Carpet(4.5,5, 3, true);
        System.out.println(c1);

        Carpet c2 = new Carpet(-1,5,1000, false);
        System.out.println(c2);

        Item i1 = new Item("pencil", 5, 2);
        Item i2 = new Item("", 6, 2);
        Item i3 = new Item(" ", 7, 2);
        Item i4 = new Item("toilet paper", 8, 2);
        Item i5 = new Item("1paipai", 9, 2);
        Item i8 = new Item("pen(sil", 10, 2);
        Item i6 = new Item("Toilet paper", 5, -2);
        Item i7 = new Item("banana", -5, 2);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i7);
        System.out.println(i8);

        System.out.println("-------------------------");


        Pizza pizza1 = new Pizza(1,2,"small");
        Pizza pizza2 = new Pizza(1,2,"medium");
        Pizza pizza3 = new Pizza(1,2,"large");

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
        System.out.println("-------------------------");

        Credentials cr1 = new Credentials("asdf1234","asdfasdf1!" );
        System.out.println(cr1);




    }


}
