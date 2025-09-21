# 📘 Java Classes – Complete Reference

---

## 🔹 What is a Class in Java?

* A **class** is a blueprint or template for creating objects.
* It defines **fields (attributes/variables)** and **methods (behavior)**.
* Objects are created from classes using the `new` keyword.

Example:

```java
class Car 
{
    String color;   // field
    int speed;      // field

    void drive() 
    {  // method
        System.out.println("Car is driving");
    }
}

public class Demo 
{
    public static void main(String[] args) 
    {
        Car myCar = new Car(); // create object
        myCar.color = "Red";
        myCar.drive();
    }
}
```

---

## 🔹 Class Syntax

```java
class ClassName 
{
    // Fields (variables)
    // Methods (functions)
    // Constructors
}
```

---

## 🔹 Components of a Class

1. **Fields (Variables)**

    * Instance variables
    * Static variables

2. **Methods**

    * Instance methods
    * Static methods

3. **Constructors**

    * Special methods used to initialize objects.

4. **Blocks**

    * Instance initialization block `{ }`
    * Static initialization block `static { }`

---

## 🔹 Types of Classes

1. **Regular Classes** – Basic user-defined classes.
2. **Abstract Classes** – Cannot be instantiated; may have abstract methods.
3. **Final Classes** – Cannot be extended.
4. **Inner Classes** – Classes inside another class.

    * Member inner class
    * Static nested class
    * Local inner class
    * Anonymous inner class

---

## 🔹 Inheritance

* A class can inherit fields & methods from another class using `extends`.

```java
class Animal 
{
    void eat() 
    { 
        System.out.println("Eating..."); 
    }
}

class Dog extends Animal 
{
    void bark() 
    { 
        System.out.println("Barking..."); 
    }
}
```

---

## 🔹 Access Modifiers in Classes

* **public** – Accessible everywhere.
* **default** – Accessible only within the same package.
* **abstract** – Declares an abstract class.
* **final** – Class cannot be extended.

---

## 🔹 UML Representation (Simple)

```bash
+------------------+
|     ClassName    |
+------------------+
| - field1         |
| - field2         |
+------------------+
| + method1()      |
| + method2()      |
+------------------+
```