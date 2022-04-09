package day33_Statics;

public class Circle {

    public double radius;
    public double diameter ;

    public static double pi=3.14;

    public Circle(double radius) {
        this.radius = radius;
        this.diameter=2*radius;

    }

    public double calcArea(){
        double area = pi*radius*radius;
        return area;
    }

    public double calcPerimeter(){
        double perimeter =pi*diameter;
        return perimeter;
    }

    public static void printPi(){
        System.out.println("Pi is = "+pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }

}

class circleObj{

    public static void main(String[] args) {

        Circle circle = new Circle(4.0);

        System.out.println(circle);


    }

}
