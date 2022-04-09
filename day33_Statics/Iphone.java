package day33_Statics;

public class Iphone {

    public String model, color, size;
    public int price;
    public static String brand = "Apple";
    public static String OS = "IOS";
    public static String madeIn = "China";

    public Iphone(String model, String color, String size, int price) {
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public void faceTime(long phoneNumber){
        System.out.println("calling "+phoneNumber);
    }
    public void faceTime (String email){
        System.out.println("calling "+email);
    }
    public void call (long phoneNumber){
        System.out.println("calling "+phoneNumber);
    }
    public void text ( long phoneNumber){
        System.out.println("texting "+phoneNumber);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
