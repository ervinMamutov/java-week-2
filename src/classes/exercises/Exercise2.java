package classes.exercises;

/**
 * Exercise 2: Constructors
 * -------------------------
 * TODO:
 * 1. Create a class `Person` with fields: name, age.
 * 2. Write a default constructor (assign default values).
 * 3. Write a parameterized constructor.
 * 4. Create objects using both constructors and display results.
 */
public class Exercise2
{
    public static void main(String[] args)
    {
        // TODO: Create Person objects using both constructors

        String name = "Andre";
        int age = 23;

        Person person1 = new Person(name, age);

        Person person2 = new Person();

        person1.display();
        person2.display();
     }
}

class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        name = "default";
        age = 0;
    }

    public void display() {
        System.out.println("This is " + name + " He is " + age + " old ");
    }


}