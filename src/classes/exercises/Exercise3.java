package classes.exercises;

/**
 * Exercise 3: Inheritance
 * ------------------------
 * TODO:
 * 1. Create a superclass Vehicle with method start().
 * 2. Create a subclass Bike that adds method ride().
 * 3. In main(), create a Bike object and call both methods.
 */
public class Exercise3
{
    public static void main(String[] args)
    {
        // TODO: Create Bike object and test methods

        Bike trip = new Bike();

        trip.start();

        trip.ride();
    }
}

class Vechnicle {
    public void start() {
        System.out.println("Are you ready for the trip?");
    }
}

class Bike extends Vechnicle {
    public void ride(){
        System.out.println("Go. Go. Go");
    }
}
