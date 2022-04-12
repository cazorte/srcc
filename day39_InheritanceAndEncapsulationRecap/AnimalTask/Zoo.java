package day39_InheritanceAndEncapsulationRecap.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Çomar", "Kangal", "big", "Brown", 'M',3);
        System.out.println(dog);
        dog.eat();
        dog.bark();
        dog.drink();
        dog.pet();
        FriendlyAnimal frAn = new FriendlyAnimal("", "kamoa", "small", "blue", 'F', 34);
        System.out.println(frAn);
        Crocodile crocodile = new Crocodile("Harts","Nils", "Small", "Green", 'F', 5);






    }


}
