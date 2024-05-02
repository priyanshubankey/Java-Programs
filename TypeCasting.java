public class TypeCasting {

    public static void main(String[] args) {
        
        // Implicit casting (automatic type conversion)
        int myInt = 9;
        double myDouble = myInt;
        
        System.out.println("Int value: " + myInt);
        System.out.println("Converted to double: " + myDouble);
        
        // Explicit casting (manual type conversion)
        double anotherDouble = 9.78;
        int anotherInt = (int) anotherDouble;
        
        System.out.println("Double value: " + anotherDouble);
        System.out.println("Converted to int: " + anotherInt);
    }
}