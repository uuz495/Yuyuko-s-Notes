## What Is Abstraction?

**Abstraction** is the process of defining **a general structure** (like "Animal") while **hiding the specific details** (like how each animal sounds).

In Java, abstraction lets you:

* **Define what an object *should do*** (`makeSound()`),
* But **leave the implementation to subclasses**.

---

## Why Use Abstraction with Animals?

In real life:

* There’s **no real "Animal"** object.
* You only see real animals like **Dog**, **Cat**, **Bird**...

But these animals all **share common behaviors**, like:

* `makeSound()`
* `eat()`
* `sleep()`

So in Java:

* We create an **abstract class `Animal`** to describe **common behavior**.
* We then create **specific classes** like `Dog`, `Cat` that implement those behaviors.

---

## Code Example: Abstract Class with Animal

### Step 1: Define the Abstract Class

```java
public abstract class Animal {
    public abstract void makeSound(); // no implementation

    public void sleep() {
        System.out.println("Sleeping...");
    }
}
```

> `makeSound()` is abstract → every animal **must** define its own sound.

---

### Step 2: Create a Child Class (Dog)

```java
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
}
```

---

### Step 3: Create Another Child Class (Cat)

```java
public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
```

---

### Step 4: Test in Main

```java
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // Bark!
        cat.makeSound(); // Meow!

        dog.sleep();     // Sleeping...
        cat.sleep();     // Sleeping...
    }
}
```

---


## 🔍 Key Points

* We use abstraction when we have a **concept** (like `Animal`), but we **only implement real versions** (like `Dog`, `Cat`).
* It ensures **structure + flexibility**.
* **Abstract classes** cannot be instantiated — they **must be extended**.

---



## Summary

| Concept           | Code                                |
| ----------------- | ----------------------------------- |
| Abstract class    | `abstract class Animal`             |
| Abstract method   | `public abstract void makeSound();` |
| Can't instantiate | `new Animal()` ❌                    |
| Must override     | `makeSound()` in each subclass ✔️   |

---

