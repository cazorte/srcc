package day31_ClassAndConstructors;

public class DefaultConstructor {

    public int age, height, weight;         // instance variable / fields /
    public String name, lastName;


    @Override
    public String toString() {
        return "DefaultConstructor{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public DefaultConstructor(int age){     // constructor   / when u creat new obj , this section called
        this.age = age;
    }

    public String instanceMethods(){        // dosnt have static keyword
        String a = "";                      // instance method / method / function
        return a;
    }



}
