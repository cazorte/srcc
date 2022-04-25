package day39_InheritanceAndEncapsulationRecap.Person;

public class StudentObjects {

    public static void main(String[] args) {

        CydeoStudent cystudent = new CydeoStudent("Anıl",35,'M',4113,"SDET",'A',8,27,"JAVA");

        System.out.println(cystudent);
        cystudent.sleep();
        cystudent.eat();



    }


}
