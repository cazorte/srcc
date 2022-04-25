package day39_InheritanceAndEncapsulationRecap.Person;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {

    //Fields
    private String name;
    private int age;
    private char gender;

    //Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public char getGender() {
        return gender;
    }

    //Setters
    public void setName(String name) {
        if (name == null){
            System.err.println("Invalid name");
            System.exit(1);
        }
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }

        for (char each : name.toCharArray()) {
            if (Character.isSpaceChar(each)){
                continue;
            }
            if (!Character.isLetter(each)) {
                System.err.println("Name can not contain any special character "+"' "+each+ " '");
                System.exit(1);
            }

        }

        this.name = name;
    }
    public void setAge(int age) {
        if (age<0){
            System.err.println("Age can not be negative "+age);
            System.exit(1);
        }
        this.age = age;
    }
    public void setGender(char gender) {
        if (!(gender=='M' || gender=='F')){
            System.err.println("Gender must be valid "+gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    //Constructor
    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
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

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
