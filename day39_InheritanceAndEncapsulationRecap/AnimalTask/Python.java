package day39_InheritanceAndEncapsulationRecap.AnimalTask;

public class Python extends WildAnimal{
    public Python(String name, String breed, String size, String color,
                  char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void hunt() {
        System.out.println("Python "+ getName()+" is hunting");
    }

    public void crawl(){
        System.out.println("Python "+ getName()+" is crawling");
    }
}
