package day39_InheritanceAndEncapsulationRecap.AnimalTask;

public class Tiger extends WildAnimal{
    public Tiger(String name, String breed, String size, String color,
                 char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void hunt() {
        System.out.println("Tiger "+ getName()+" is hunting");
    }

    public void roar(){
        System.out.println("Tiger "+ getName()+" is roaring");
    }
}
