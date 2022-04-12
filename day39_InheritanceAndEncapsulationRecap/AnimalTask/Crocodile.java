package day39_InheritanceAndEncapsulationRecap.AnimalTask;

public class Crocodile extends WildAnimal{
    public Crocodile(String name, String breed, String size, String color,
                     char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void hunt() {
        System.out.println("Crocodile "+ getName()+" is hunting");
    }

    public void crawl(){
        System.out.println("Crocodile "+ getName()+" is crawling");
    }
}
