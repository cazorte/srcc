package day43_Abstraction.shape;

public class Square extends Shape{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(String name, double side) {
        super(name);
        setSide(side);
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square : {'"+getName()+"', "+
                "Area : "+area()+", "+
                "Perimeter : "+perimeter()+" }"
                ;
    }
}
