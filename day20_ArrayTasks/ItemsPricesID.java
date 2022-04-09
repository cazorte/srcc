package day20_ArrayTasks;

public class ItemsPricesID {

    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        for (int i = 0; i < items.length; i++) {
            if ("Gloves".equals(items[i])){
                System.out.println("Gloves index number is: "+i);
            }
        }
        System.out.println("---------------");

        for (int k = 0; k < items.length; k++) {
            if ("iPad".equals(items[k])){
                System.out.println("this array contains iPad");
            }
        }

        System.out.println("--------------------");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]+" - "+prices[i]+" - "+itemIDs[i]);
        }

    }
}
