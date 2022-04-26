package day43_Abstraction.shape;

public class ShapeObjects {


    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle("Dikdörtgen", 15.2, 4.3);
        System.out.println(rectangle1);

        Square square1 = new Square("Kare", 4.5);
        System.out.println(square1);

        Circle circle1 = new Circle("Daire", 8);
        System.out.println(circle1);



    }
}
