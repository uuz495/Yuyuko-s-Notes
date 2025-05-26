## What Is Inheritance?

**Inheritance** means one class (child class) can **reuse** the code from another class (parent class).

This allows:

* Code reuse (don’t repeat yourself)
* Logical structure (like "is-a" relationships)
* Easy extension of existing functionality

---

## Syntax

```java
class Parent {
    // parent class code
}

class Child extends Parent {
    // child class code
}
```

---

## Basic Example

### 1. Define the Parent Class

```java
public class Animal {
    String name;

    public void eat() {
        System.out.println(name + " is eating.");
    }
}
```

### 2. Define the Child Class

```java
public class Dog extends Animal {
    public void bark() {
        System.out.println(name + " is barking.");
    }
}
```

### 3. Using Inheritance

```java
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Buddy";
        d.eat();     // Inherited from Animal
        d.bark();    // Defined in Dog
    }
}
```

**Output:**

```
Buddy is eating.
Buddy is barking.
```

---

## Key Terms

| Term             | Meaning                                        |
| ---------------- | ---------------------------------------------- |
| `extends`        | Creates an inheritance relationship            |
| Parent class     | The base class (also called super class)       |
| Child class      | The class that inherits (also called subclass) |
| Inherited method | A method the child class gets from the parent  |

---

## Method Overriding

The child class can **change** the behavior of a method from the parent.

```java
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println(name + " eats dog food.");
    }
}
```

---

## Summary

* Use `extends` to create a child class.
* The child gets all non-private methods and fields from the parent.
* You can add new methods or override old ones in the child class.

---

Let me know if you want to learn about `super`, constructors with inheritance, or try a practice example!
