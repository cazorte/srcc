package day39_InheritanceAndEncapsulationRecap.AnimalTask;

public class Dolphin extends FriendlyAnimal{

    public Dolphin(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void swim(){
        System.out.println("Dolphin ,"+getName()+ " is swimming");
    }

    @Override
    public void eat() {
        System.out.println("Dolphin ,"+getName()+ " is eating fish food");
    }
}
