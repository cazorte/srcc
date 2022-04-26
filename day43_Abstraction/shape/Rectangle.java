package day43_Abstraction.shape;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(String name, double width, double length) {
        super(name);
        setWidth(width);
        setLength(length);
    }

    @Override
    public double area() {

        return getLength()*getWidth();
    }

    @Override
    public double perimeter() {

        return 2*(getLength()+getWidth());
    }

    @Override
    public String toString() {
        return "Shape : {'"+getName()+"', "+
                "Area : "+area()+", "+
                "Perimeter : "+perimeter()+" }"
                ;
    }
}
