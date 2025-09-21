package methods.examples;

/**
 * Example 1: Basic Methods in Java
 * -------------------------------
 * This class demonstrates:
 * - Static vs Instance
 * - Parameters & Return Types
 */
public class Example1
{
    public static void main(String[] args)
    {
        // Call static method
        staticGreeting();

        // Create object to call instance methods
        Example1 obj = new Example1();
        obj.instanceGreeting();
        obj.displayMessage("Java Methods are powerful!");
        System.out.println("Square of 5 = " + obj.square(5));
    }

    // Static method (belongs to class)
    public static void staticGreeting()
    {
        System.out.println("Hello from a static method!");
    }

    // Instance method (requires object)
    public void instanceGreeting()
    {
        System.out.println("Hello from an instance method!");
    }

    // Method with parameters
    public void displayMessage(String message)
    {
        System.out.println("Message: " + message);
    }

    // Method with return type
    public int square(int num)
    {
        return num * num;
    }
}
