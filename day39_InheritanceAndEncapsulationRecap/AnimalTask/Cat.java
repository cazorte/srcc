package day39_InheritanceAndEncapsulationRecap.AnimalTask;

public class Cat extends FriendlyAnimal{

    public Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void scratch(){
        System.out.println("Cat ,"+getName()+ " is scratching");
    }

    @Override
    public void eat() {
        System.out.println("Cat ,"+getName()+ " is eating cat food");
    }

    public void meow() {
        System.out.println("Cat ,"+getName()+ " is meowing");
    }
}
