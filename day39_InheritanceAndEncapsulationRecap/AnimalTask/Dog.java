package day39_InheritanceAndEncapsulationRecap.AnimalTask;

public class Dog extends FriendlyAnimal{

    public Dog(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void bark(){
        System.out.println("Dog ,"+getName()+ " is barking");
    }

    @Override
    public void eat() {
        System.out.println("Dog ,"+getName()+ " is eating dog food");
    }
}
