public class VariableScopeExample {

    private static int x = 1; // Class variable accessible in the whole class

    public static void main(String[] args) {
        int y = 5; 
        System.out.println("Class variable x: " + x);
        System.out.println("Local variable y: " + y);
        someMethod();
    }

    public static void someMethod() {
        System.out.println("Class variable x from someMethod: " + x);
        // Error: y cannot be accessed here
        // System.out.println("Local variable y from someMethod: " + y);
    }
}