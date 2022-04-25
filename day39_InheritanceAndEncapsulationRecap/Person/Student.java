package day39_InheritanceAndEncapsulationRecap.Person;

public class Student extends Person {

    //Fields
    private int studentID;
    private String fieldOfStudy, schoolName;
    private char grade;

    //Constructor
    public Student(String name, int age, char gender, int studentID, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender);
        setSchoolName(schoolName);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
    }

    //Getters
    public int getStudentID() {
        return studentID;
    }
    public String getFieldOfStudy() {
        return fieldOfStudy;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public char getGrade() {
        return grade;
    }

    //Setters
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy==null){
            System.err.println("Invalid field of study");
            System.exit(1);
        }
        if (fieldOfStudy.isEmpty()){
            System.err.println("Invalid field of study");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }
    public void setSchoolName(String schoolName) {
        if (schoolName==null){
            System.err.println("Invalid school name");
            System.exit(1);
        }
        if (schoolName.isEmpty()){
            System.err.println("Invalid school name");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }
    public void setGrade(char grade) {
        if ( !(grade=='A' ||grade=='B' ||grade=='C' ||grade=='D' ||grade=='F')  ){
            System.err.println("Invalid grade "+ grade);
            System.exit(1);
        }
        this.grade = grade;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentID=" + studentID +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
