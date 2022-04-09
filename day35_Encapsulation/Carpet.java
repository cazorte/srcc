package day35_Encapsulation;

public class Carpet {

    private double width;
    private double length;
    private double unitPrice;
    private boolean isPersian;

    public void setWidth(double width) {
        if (width<0) return;
        this.width = width;
    }

    public void setLength(double length) {
        if (length<0) return;
        this.length = length;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice<0) return;
        this.unitPrice = unitPrice;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        this.isPersian = isPersian;
    }

    public double calcCost(){
        int a =0;
        if (isPersian) a=200;

        return width*length*unitPrice + a;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", cost=" + calcCost() +
                '}';
    }
}
