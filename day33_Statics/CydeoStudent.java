package day33_Statics;

public class CydeoStudent {
    public String name;
    public int age, id, batchNumber, groupNumber;
    public char gender, grade;

    public static String schoolName, programmingLanguage;

    public CydeoStudent(String name, int age, int id, int batchNumber, int groupNumber, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade = grade;
    }

    public void study(){
        System.out.println("Student is studying ");
    }
    public void attendClass(){
        System.out.println( "Student attend");
    }

    public static void printSchoolName(){
        System.out.println(schoolName);
    }

    public static void printProgLanguage(){
        System.out.println(programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                ", school name=" + schoolName +
                ", programming language name=" + programmingLanguage +
                '}';
    }

}

    class Students {

        public static void main(String[] args) {
            CydeoStudent student1 = new CydeoStudent("Anıl",35,4113,8,27,'M', 'A');

            System.out.println(student1);

            CydeoStudent.schoolName = "Cydeo";
            CydeoStudent.programmingLanguage = "Java";

            System.out.println(student1);

            CydeoStudent.printProgLanguage();

        }
}

