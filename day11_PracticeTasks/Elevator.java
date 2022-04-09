package day11_PracticeTasks;

public class Elevator {
    public static void main(String[] args) {

        int floorNumber=4;
        String body = "Floor "+floorNumber+" selected";
        String c1="Lobby, Verizon,Starbucks";
        String c2="Cybertek, NASA, Intelsat";
        String c3="Lyft, BofA, Stake House";
        String body2 = ". Companies: "+c1;

        switch (floorNumber){
            case 1:
                System.out.println("Floor "+floorNumber+" selected. Companies: "+c1);
                break;
            case 2:
                System.out.println("Floor "+floorNumber+" selected. Companies: "+c2);
                break;
            case 3:
                System.out.println("Floor "+floorNumber+" selected. Companies: "+c3);
                break;
            default:
                System.out.println("Invalid floor "+floorNumber);

        }

    }
}
