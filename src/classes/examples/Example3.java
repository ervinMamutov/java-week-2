package classes.examples;

/**
 * Example 3: Inheritance
 * - Superclass and Subclass
 */
public class Example3
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.eat();   // inherited from Animal
        d.bark();  // Dog’s own method
    }
}

// Superclass
class Animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}

// Subclass
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is barking");
    }
}

