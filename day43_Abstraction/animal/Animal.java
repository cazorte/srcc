package day43_Abstraction.animal;

public abstract class Animal {

    private String name, breed, color;
    private int age;

    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public String getColor() {
        return color;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank() ){
            throw new RuntimeException("Invalid name "+ name);
        }

        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)){
                throw new RuntimeException("Invalid name"+ name);

            }
        }
        this.name = name;
    }
    public void setBreed(String breed) {
        if (breed.isEmpty() || breed.isBlank() ){
            throw new RuntimeException("Invalid name"+ breed);
        }
        this.breed = breed;
    }
    public void setColor(String color) {
        if (color.isEmpty() || color.isBlank() ){
            throw new RuntimeException("Invalid name"+ color);
        }
        this.color = color;
    }
    public void setAge(int age) {
        if (age<=0){
            throw new RuntimeException("Invalid age "+ age);
        }
        this.age = age;
    }

    public Animal(String name, String breed, String color, int age) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setAge(age);
    }

    public abstract void eat();

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
