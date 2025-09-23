package methods.exercises;

/**
 * Exercise 1: Basic Methods
 * -------------------------
 * TODO:
 * 1. Create a method `cube(int num)` that returns the cube of a number.
 * 2. Create a method `sayHello(String name)` that prints "Hello, <name>".
 * 3. Call both methods from main().
 */

public class Exercise1
{
    public static void main(String[] args)
    {
        Exercise1 obj = new Exercise1();

        // Example usage
        System.out.println("Square of 4 = " + obj.square(4));
        System.out.println(obj.cube(2));
        obj.sayHello("Hello");

        // TODO: Call cube() and sayHello() here
    }

    // Example method: square
    public int square(int num)
    {
        return num * num;
    }

    // TODO: Write cube(int num)
    public int cube(int number) {
        return number * number * number;
    }

    // TODO: Write sayHello(String name)
    public void sayHello(String name) {
        System.out.println("Say " + name);
    }
}

