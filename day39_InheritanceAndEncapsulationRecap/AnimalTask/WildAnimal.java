package day39_InheritanceAndEncapsulationRecap.AnimalTask;

public class WildAnimal extends AnimalTask {

    //Fields
    private boolean isWild=false, isFriendly=false, isPlayable=false;

    //Constructor
    public WildAnimal(String name, String breed, String size, String color,
                      char gender, int age) {
        super(name, breed, size, color, gender, age);

    }

    //Methods
    public void hunt(){
        System.out.println(getName()+" hunting");
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "name=\t'" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}
