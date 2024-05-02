interface Animal {
    void sound(); // Interface method (does not have a body)
}

class Dog implements Animal {
    public void sound() {
        // The body of sound() is provided here
        System.out.println("Woof");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meow");
    }
}

public class Klion{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat(); // Corrected syntax: added parentheses
        myDog.sound();
        myCat.sound();
    }
}