package day31_ClassAndConstructors;

public class Address {

    public int buldingNumber, zipcode;
    public String street, city, state;

    public Address(int buldingNumber, int zipcode, String street, String city, String state) {
        this.buldingNumber = buldingNumber;
        this.zipcode = zipcode;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String toString(){
        return buldingNumber+" "+street +"\n"
                + city + " "+ state+", "+zipcode;


    }




}
