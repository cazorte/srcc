package day39_InheritanceAndEncapsulationRecap.AnimalTask;

public class Eagle extends WildAnimal{
    public Eagle(String name, String breed, String size, String color,
                 char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void hunt() {
        System.out.println("Eagle "+ getName()+" is hunting");
    }

    public void fly(){
        System.out.println("Eagle "+ getName()+" is flying");
    }
}
