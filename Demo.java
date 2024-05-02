class AccessSpecifierDemo {

    public int publicVar = 100; // Accessible from any other class
    private int privateVar = 200; // Accessible only within the class
    protected int protectedVar = 300; // Accessible within the class and by derived classes

    public void display() {
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
    }
}

public class Demo {
    public static void main(String[] args) {
        AccessSpecifierDemo demo = new AccessSpecifierDemo();
        demo.display();
        System.out.println("PublicVar: " + demo.publicVar);
        // System.out.println("PrivateVar: " + demo.privateVar); // Error: Cannot access private variable
        // System.out.println("ProtectedVar: " + demo.protectedVar); // Error: Cannot access protected variable outside the class without inheritance
    }
}