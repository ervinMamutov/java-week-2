package classes.examples;

/**
 * Example 4: Abstract, Final, and Inner Classes
 */

public class Example4
{
    public static void main(String[] args)
    {
        Shape s = new Circle();
        s.draw();

        Utility u = new Utility();
        u.printMessage();

        Example4 outer = new Example4 ();
        Inner inner = outer.new Inner();
        inner.show();
    }
    // Inner class
    class Inner
    {
        void show()
        {
            System.out.println("Inner class method");
        }
    }
}

// Abstract class
abstract class Shape
{
    abstract void draw();
}

class Circle extends Shape
{
    @Override
    void draw()
    {
        System.out.println("Drawing Circle");
    }
}

// Final class
final class Utility
{
    public void printMessage()
    {
        System.out.println("Utility class cannot be extended");
    }
}