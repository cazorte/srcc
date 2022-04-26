package day43_Abstraction.shape;

public abstract class Shape {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            throw new RuntimeException("Invalid name");
        }
        if (name.isBlank()){
            throw new RuntimeException("Invalid name");
        }

        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)){
                throw new RuntimeException("Name should not contain digit number");
            }
        }

        this.name = name;
    }

    public Shape(String name) {
        setName(name);
    }

    public abstract double area();
    public abstract double perimeter();

    public abstract String toString();
}
