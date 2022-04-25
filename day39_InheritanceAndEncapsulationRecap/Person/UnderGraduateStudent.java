package day39_InheritanceAndEncapsulationRecap.Person;

public class UnderGraduateStudent extends Student{


    public UnderGraduateStudent(String name, int age, char gender, int studentID,
                                String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentID, fieldOfStudy, schoolName, grade);
    }

    @Override
    public void study() {
        System.out.println(getName()+" continue study");
    }
}
