## What Is an Interface?

An **interface** in Java is a special kind of reference type, similar to a class, that **only contains abstract methods (methods without implementation)** and constants (static final variables).

* It defines a **contract**: what methods a class must implement.
* It cannot have method implementations (until Java 8 introduced default methods, but we’ll keep it simple here).
* A class can **implement** multiple interfaces, which helps Java achieve multiple inheritance of type.

---

## Why Use Interfaces?

* To define **common behavior** without specifying how it’s done.
* To allow **different classes** to implement the same behavior in different ways.
* To support **multiple inheritance** of behavior (since Java does not allow multiple class inheritance).
* To provide **loose coupling** and improve code flexibility.

---

## Example Using Animals

Imagine we have different animals. Some can **fly**, some can **swim**, some can **run**.

We can define interfaces for these abilities:

```java
public interface Flyable {
    void fly();
}

public interface Swimmable {
    void swim();
}
```

---

## Implementing Interfaces in Classes

```java
public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

public class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}

public class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}
```

---

## Key Points

* Use the keyword `interface` to declare an interface.
* Use `implements` keyword for a class to implement an interface.
* A class **must implement all methods** declared in the interface.
* A class can implement **multiple interfaces**.
* Interfaces cannot hold state (no instance variables except constants).

---
We'll create a simulation where:

* A **Computer** has a USB port.
* It can accept any **USB device** (like a mouse, keyboard, flash drive) as long as it follows the **USB interface**.
* This allows the Computer to interact with any USB device **without knowing the exact type** — only that it follows the interface.

---

## Step-by-Step Implementation

### Step 1: Define the USB Interface

```java
public interface USB {
    void connect();
    void disconnect();
}
```

> Any device that implements `USB` must provide `connect()` and `disconnect()` methods.

---

### Step 2: Create USB Device Classes

#### A Flash Drive

```java
public class FlashDrive implements USB {
    @Override
    public void connect() {
        System.out.println("Flash Drive connected.");
    }

    @Override
    public void disconnect() {
        System.out.println("Flash Drive disconnected.");
    }
}
```

#### A Mouse

```java
public class Mouse implements USB {
    @Override
    public void connect() {
        System.out.println("Mouse connected.");
    }

    @Override
    public void disconnect() {
        System.out.println("Mouse disconnected.");
    }
}
```

---

### Step 3: Create the Computer Class

```java
public class Computer {
    public void useDevice(USB device) {
        device.connect();
        System.out.println("Using device...");
        device.disconnect();
    }
}
```

> The `Computer` doesn’t care what kind of USB device is passed in — as long as it implements the `USB` interface.

---

### Step 4: Main Program

```java
public class Main {
    public static void main(String[] args) {
        Computer pc = new Computer();

        USB flash = new FlashDrive();
        USB mouse = new Mouse();

        pc.useDevice(flash);
        System.out.println("-----");
        pc.useDevice(mouse);
    }
}
```

---

## Output

```
Flash Drive connected.
Using device...
Flash Drive disconnected.
-----
Mouse connected.
Using device...
Mouse disconnected.
```

---

## Why This Works

* `Computer` uses **polymorphism**: it treats all devices as `USB`, so it's flexible.
* Each device **implements the interface**, so `Computer` can safely call `connect()` and `disconnect()` without knowing the actual type.
* This pattern allows **plug-and-play behavior**, just like real USB devices.

