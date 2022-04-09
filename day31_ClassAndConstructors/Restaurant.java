package day31_ClassAndConstructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner, location;
    public int numberOfStars;
    public ArrayList<Server> serverList = new ArrayList<>();
    public ArrayList<Chef> chefList = new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars /*, ArrayList<String> serverList, ArrayList<String> chefList*/   ) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        this.serverList = serverList;
        this.chefList = chefList;
    }

    public void hireServer(Server[] servers){
        serverList.addAll(Arrays.asList(servers));
    }

    public void hireServer(Server server1){
        serverList.add(server1);
    }

    public void hireChef(Chef chef){
        chefList.add(chef);
    }
    public void hireChef(Chef[] chefs){chefList.addAll(Arrays.asList(chefs));}

    public void terminateChef(int employeeID){
        chefList.removeIf(p -> p.employeeID == employeeID);
    }
    public void terminateServer(int employeeID){
        serverList.removeIf(p -> p.employeeID == employeeID);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", serverList=" + serverList +
                ", chefList=" + chefList +
                '}';
    }
}
