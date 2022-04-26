package day43_Abstraction.animal;

public class Dog extends Animal{


    public Dog(String name, String breed, String color, int age) {
        super(name, breed, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog eating dog food");
    }





}
