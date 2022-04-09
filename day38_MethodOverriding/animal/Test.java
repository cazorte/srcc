package day38_MethodOverriding.animal;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Boncuk", "Tekir", "blue", "big",4,'F');

        Dog dog = new Dog("Kaya", "Kangal", "blue", "small",4,'M');

        cat.eat();
        dog.eat();
        System.out.println(cat);
        System.out.println(dog);
    }




}
