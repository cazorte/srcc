package day43_Abstraction.shape;

public class Circle extends Shape{

    private static double PI = 3.14;

    private double r;

    public Circle(String name, double r) {
        super(name);
        setR(r);
    }

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        Circle.PI = PI;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return PI*r*r;
    }

    @Override
    public double perimeter() {
        return 2*PI*r;
    }

    @Override
    public String toString() {
        return "Circle : {'"+getName()+"', "+
                "Area : "+area()+", "+
                "Perimeter : "+perimeter()+" }"
                ;
    }
}
