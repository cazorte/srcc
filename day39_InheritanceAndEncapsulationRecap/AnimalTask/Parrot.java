package day39_InheritanceAndEncapsulationRecap.AnimalTask;

public class Parrot extends FriendlyAnimal{

    public Parrot(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void fly(){
        System.out.println("Parrot ,"+getName()+ " is flying");
    }

    @Override
    public void eat() {
        System.out.println("Parrot ,"+getName()+ " is eating bird food");
    }

    public void sing() {
        System.out.println("Parrot ,"+getName()+ " is singing");
    }
}
