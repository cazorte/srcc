package day43_Abstraction.animal;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Çomar", "Kangal", "Yellow", 5);
        System.out.println(dog1);

        dog1.eat();
        dog1.setName("Kan gal");
        System.out.println(dog1.getName());


    }
}
