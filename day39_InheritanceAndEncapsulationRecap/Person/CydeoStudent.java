package day39_InheritanceAndEncapsulationRecap.Person;

public class CydeoStudent extends Student {

    private int batchNumber, groupNumber;
    private String progLanguage;

    //Constructor
    public CydeoStudent(String name, int age, char gender, int studentID, String fieldOfStudy, char grade, int batchNumber, int groupNumber, String progLanguage ) {
        super(name, age, gender, studentID, fieldOfStudy, "Cydeo", grade);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgLanguage(progLanguage);
    }

    //Getters
    public int getBatchNumber() {
        return batchNumber;
    }
    public int getGroupNumber() {
        return groupNumber;
    }
    public String getProgLanguage() {
        return progLanguage;
    }

    //Setters
    public void setBatchNumber(int batchNumber) {
        if (batchNumber<=0){
            System.err.println("Invalid batch number "+batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }
    public void setGroupNumber(int groupNumber) {
        if (groupNumber<=0){
            System.err.println("Invalid group number "+groupNumber);
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }
    public void setProgLanguage(String progLanguage) {
        if (progLanguage==null){
            System.err.println("Invalid programming language");
            System.exit(1);
        }
        if (progLanguage.isEmpty()){
            System.err.println("Invalid programming language");
            System.exit(1);
        }
        this.progLanguage = progLanguage;
    }

    //Methods
    @Override
    public void eat() {
        System.out.println("eating "+ progLanguage);
    }
    @Override
    public void drink() {
        System.out.println("drinking "+ progLanguage);
    }
    @Override
    public void sleep() {
        System.out.println("sleeping "+ progLanguage);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentID=" + getStudentID() +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", schoolName='" + getSchoolName() + '\'' +
                ", grade=" + getGrade() +
                ", batchNumber=" + getBatchNumber() +
                ", groupNumber=" + getGroupNumber() +
                ", progLanguage='" + getProgLanguage() + '\'' +
                '}';
    }
}
