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


## Inheritance + Constructors + `super`

When a **child class** inherits from a **parent class**, it does **not inherit constructors**, but it can **call the parent's constructor** using the keyword `super`.

---

### What is `super`?

* `super` refers to the **parent class**.
* You can use it to:

  1. **Call the parent’s constructor**.
  2. **Call the parent’s methods**.

---

### Example: Inheritance with Constructors

#### Step 1: Parent Class with Constructor

```java
public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}
```

#### Step 2: Child Class Uses `super`

```java
public class Dog extends Animal {
    public Dog(String name) {
        super(name); // calls Animal's constructor
        System.out.println("Dog constructor called");
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}
```

#### Step 3: Test in `main()`

```java
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy");
        d.eat();   // from Animal
        d.bark();  // from Dog
    }
}
```

**Output:**

```
Animal constructor called
Dog constructor called
Buddy is eating.
Buddy is barking.
```

---

## Summary Table

| Concept          | Explanation                                         |
| ---------------- | --------------------------------------------------- |
| `super()`        | Calls the parent class constructor                  |
| `super.method()` | Calls a method from the parent class                |
| Constructor      | Initializes the object; child can call parent’s one |
| Inheritance      | Child gets fields and methods from parent class     |

---

## Extra: Overriding with `super`

You can call the parent method in an overridden method:

```java
@Override
public void eat() {
    super.eat(); // Call parent version
    System.out.println(name + " is done eating.");
}
```

---
