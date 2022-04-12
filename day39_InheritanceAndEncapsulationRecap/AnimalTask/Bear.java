package day39_InheritanceAndEncapsulationRecap.AnimalTask;

public class Bear extends WildAnimal{
    public Bear(String name, String breed, String size, String color,
                char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void hunt() {
        System.out.println("Bear "+ getName()+" is hunting");
    }

}
