package classes.exercises;

/**
 * Exercise 4: Abstract, Final, Inner Classes
 * ------------------------------------------
 * TODO:
 * 1. Create an abstract class Animal with abstract method sound().
 * 2. Create a subclass Cat that implements sound().
 * 3. Create a final class MathUtil with method square(int).
 * 4. Create an inner class inside Exercise4_AbstractFinalInner that prints a message.
 */
public class Exercise4
{
    public static void main(String[] args)
    {
        // TODO: Implement all requirements and test them
        Animal cat = new Cat();
        cat.sound();

        MathUtil sq = new MathUtil();
        sq.square();

    Exercise4 outer = new Exercise4();
    Inner inner = new Inner();
    inner.show();

    }

    static class Inner {
        public void show() {
            System.out.println("Hi it's Inner class");
        }
    }
}

abstract class Animal {
    abstract void sound();
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("May");
    }
}

final class MathUtil {
    public void square() {
        System.out.println("Math-Util");


    }
}