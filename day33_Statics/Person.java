package day33_Statics;

public class Person {

    public String name;
    public int age;
    public char gender;
    public static boolean isHuman=true;
    public static boolean hasNose, hasWings;
    public static int numberOfHead;
    public static int numberOfEyes;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

        this.hasNose = true;
        this.hasWings = false;
        this.numberOfHead = 1;
        this.numberOfEyes = 2;

    }

    public void eat(String food){
        System.out.println("eating "+food);
    }
    public void drink(String drink){
        System.out.println("drinking "+ drink);
    }
    public void sleep(){
        System.out.println("sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", is a human=" + isHuman +
                '}';
    }

}
class personObject{
    public static void main(String[] args) {
        Person person1 = new Person("Anıl",35,'M');

        System.out.println(person1);
        System.out.println(person1.isHuman);
        person1.hasNose = false;
        System.out.println(person1.hasNose);
        System.out.println("----------");

        person1.isHuman = false;
        System.out.println(person1);

        Person person2 = new Person("Çağatay", 4, 'M');
        System.out.println(person2);
        person2.isHuman = true;
        System.out.println(person1);
        System.out.println(person2);
        System.out.println("-----------");

        person2.hasNose = true;
        System.out.println(person1.hasNose);
        System.out.println(person2.hasNose);

    }
}
