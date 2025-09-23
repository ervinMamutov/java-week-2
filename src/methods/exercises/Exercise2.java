package methods.exercises;

/**
 * Exercise 2: Modifiers
 * ----------------------
 * TODO:
 * 1. Create one method with each access modifier:
 *    - public, protected, default, private
 * 2. Create one static method and one final method.
 * 3. Try calling them inside main().
 */

public class Exercise2
{
    public static void main(String[] args)
    {
        Exercise2 obj = new Exercise2();

        // Example usage
        obj.publicMethod();

        obj.finalMethod();
        obj.privateMethod();
        obj.protectedMethod();
        obj.publicMethod();

        // TODO: Call other methods here
    }
    // Example: public method
    public void publicMethod()
    {
        System.out.println("Public method called");
    }

    // TODO: Add protectedMethod()
    protected void protectedMethod() {
        System.out.println("Protected");
    }

    // TODO: Add defaultMethod()
    public interface MyInterface {
        default void defaultMethod() {
            System.out.println("defaultMethod");
        }
    }

    // TODO: Add privateMethod()
    private void privateMethod() {
        System.out.println("privateMethod()");
    }

    // TODO: Add staticMethod()
    public static void staticMethod() {
        System.out.println("staticMethod()");
    }

    // TODO: Add finalMethod()
    public final void finalMethod() {
        System.out.println("finalMethod()");
    }
}
