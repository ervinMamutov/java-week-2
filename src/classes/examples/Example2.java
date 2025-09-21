package classes.examples;

/**
 * Example 2: Constructors
 * - Default and Parameterized Constructors
 */

public class Example2
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student("Alice", 20);

        s1.display();
        s2.display();
    }
}

class Student
{
    String name;
    int age;

    // Default constructor
    Student()
    {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student(String n, int a)
    {
        name = n;
        age = a;
    }

    void display()
    {
        System.out.println(name + " is " + age + " years old");
    }
}
