package day31_ClassAndConstructors;

public class Carpet {

    public double width=3, length=4, unitPrice=10;
    public boolean isPersian=false;

    public Carpet(double width1, double length, double unitPrice, boolean isPersian) {
        width = width1;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double totalCost = width*length*unitPrice;

        if (isPersian) totalCost+=200;
        return totalCost;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price $" + calcCost() +
                '}';
    }
}
