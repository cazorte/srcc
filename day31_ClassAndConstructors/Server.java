package day31_ClassAndConstructors;

public class Server {
    public String name;
    public int employeeID;
    public double hourlyRate ;
    public boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void takeOrder(){
        System.out.println( name+" is taking an order");
    }
    public void cleanTable(){
        System.out.println( name+" cleaning the table");
    }

    public String isFullTime(){
        String result="";
        if (fullTime == true) result= "full-time";
        if (fullTime == false) result = "part-time";
        return result;
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                " full time status=" + isFullTime() +
                '}';
    }






}
