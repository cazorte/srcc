package day35_Encapsulation;

public class Pizza {

    private int numberOfCheeseTopping, numberOfPepperniTopping;
    private String size;

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperniTopping() {
        return numberOfPepperniTopping;
    }

    public void setNumberOfPepperniTopping(int numberOfPepperniTopping) {
        this.numberOfPepperniTopping = numberOfPepperniTopping;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") ||
                size.equalsIgnoreCase("large") ) ) System.exit(0);
        this.size = size;
    }

    public Pizza(int numberOfCheeseTopping, int numberOfPepperniTopping, String size) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperniTopping(numberOfPepperniTopping);
    }

      public int calcCost(){
          int cost = 0;
          int topping = numberOfCheeseTopping + numberOfPepperniTopping;

          switch (size){
              case "small": cost = 10; break;
              case "medium": cost = 12; break;
              case "large": cost = 14; break;
          }

          return cost + topping*2;
      }


    public String toString() {
        return "Pizza{" +
                "numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperniTopping=" + numberOfPepperniTopping +
                ", cost=" + calcCost() +
                ", size='" + size + '\'' +
                '}';
    }
}
