package day36_Inheritance.ScrumTeam;

public class AmazonInc {

    public static void main(String[] args) {

        Employee person1 = new Employee();
        person1.setInfo(4113,"Tester",11100.0);
        person1.setInfo("Anıl", 35,'m');

        System.out.println(person1);

        Testers qa1 = new Testers();
        qa1.setInfo("Aygun", 32,'F');
        System.out.println(qa1);
        qa1.test();



    }


}
