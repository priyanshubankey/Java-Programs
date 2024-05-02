class Vehicle { // Base class (parent)
    protected String brand = "Ford"; // Vehicle attribute

    public void honk() { // Vehicle method
        System.out.println("Tut tut!");
    }
}

class Car extends Vehicle { // Derived class (child)
    private String modelName = "Mustang"; // Car attribute

    public void displayModel() {
        System.out.println("Brand: " + brand + ", Model: " + modelName);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        myCar.displayModel();
    }
}