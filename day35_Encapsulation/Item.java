package day35_Encapsulation;

//import java.util.ArrayList;
//import java.util.Arrays;

public class Item {

    private String name;
    private int unitPrice;
    private int quantity;

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) return;

        for (char eachChar : name.toCharArray()) {
            if (Character.isSpaceChar(eachChar)){
                break;
            }
           if (!Character.isLetterOrDigit(eachChar)) return;
        }

        if (!Character.isLetter(name.charAt(0))) return;

        this.name = name;
    }

    public void setQuantity(int quantity) {
        if (quantity<0) return;
        this.quantity = quantity;
    }

    public void setUnitPrice(int unitPrice) {
        if (unitPrice<0) return;
        this.unitPrice = unitPrice;
    }


    public String getName() {
        return name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public int calcCost(){
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + calcCost() +
                '}';
    }

    public Item(String name, int unitPrice, int quantity) {
     setName(name);
     setQuantity(quantity);
     setUnitPrice(unitPrice);
    }
}
