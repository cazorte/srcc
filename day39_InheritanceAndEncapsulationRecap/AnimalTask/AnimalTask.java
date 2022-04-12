package day39_InheritanceAndEncapsulationRecap.AnimalTask;

public class AnimalTask {
    //Fields
    private String name, breed, size, color;
    private char gender;
    private int age;

    //Constructor
    public AnimalTask(String name, String breed, String size, String color, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    //Getters
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public String getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }
    public char getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }

    //Setters
    public void setName(String name) {
        if (name.equals(null)){
            System.err.println("Invalid name"+name);
            System.exit(1);
        }
        if (name.isBlank() || name.isEmpty()){
            System.err.println("Invalid name"+name);
            System.exit(1);
        }
        this.name = name;
    }
    public void setBreed(String breed) {
        if (breed.equals(null)){
            System.err.println("Invalid breed"+breed);
            System.exit(1);
        }
        if (breed.isBlank() || breed.isEmpty()){
            System.err.println("Invalid breed"+breed);
            System.exit(1);
        }
        this.breed = breed;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setColor(String color) {
        if (color.equals(null)){
            System.err.println("Invalid color"+color);
            System.exit(1);
        }
        if (color.isBlank() || color.isEmpty()){
            System.err.println("Invalid color"+color);
            System.exit(1);
        }
        this.color = color;
    }
    public void setGender(char gender) {
        if ( ! (gender == 'M' || gender == 'F')){
            System.err.println("Invalid gender"+gender);
            System.exit(1);
        }
        this.gender = gender;
    }
    public void setAge(int age) {
        if (age<0){
            System.err.println("Age can not be negative"+age);
            System.exit(1);
        }
        this.age = age;
    }

    //Methods
    public void eat(){
        System.out.println(getName() + " is eating");
    }
    public void drink(){
        System.out.println(getName() + " is drinking");
    }
    public void sleep(){
        System.out.println(getName() + " is sleeping");
    }
    public void move(){
        System.out.println(getName() + " is moving");
    }

    public String toString() {
        return "Animal {" +
                "name=\t'" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
