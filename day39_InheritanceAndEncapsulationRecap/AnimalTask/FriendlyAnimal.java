package day39_InheritanceAndEncapsulationRecap.AnimalTask;

public class FriendlyAnimal extends AnimalTask {
    //Fields
    private boolean isWild=true, isFriendly=true, isPlayable=true;

    //Constructor
    public FriendlyAnimal(String name, String breed, String size, String color,
                          char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    //Methods
    public void play(){
        System.out.println(getName() + " is playing");
    }
    public void pet(){
        System.out.println(getName() + " can be pet");
    }

    @Override
    public String toString() {
        return "FriendlyAnimal{" +
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
