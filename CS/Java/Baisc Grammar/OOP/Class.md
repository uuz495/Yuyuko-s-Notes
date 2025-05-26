### 1. What is a Class?

A **class** is a blueprint for creating objects.
It defines what **attributes (variables)** and **behaviors (methods)** the objects will have.

```java
public class Person {
    String name;
    int age;

    void sayHello() {
        System.out.println("Hi, my name is " + name);
    }
}
```

---

### 2. Creating Objects from the Class

```java
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Alice";
        p1.age = 20;
        p1.sayHello();  // Output: Hi, my name is Alice
    }
}
```

---

### 3. Constructor: Setting Values When Creating an Object

```java
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void sayHello() {
        System.out.println("Hi, I'm " + name + ", I'm " + age + " years old.");
    }
}
```

---

### 4.  `static` Variable: The variable belong to class 

A `static` variable belongs to the **class**, not to any object.
All instances of the class share the **same** `static` variable.

#### Use case: Count how many `Person` objects are created.

```java
public class Person {
    String name;
    int age;

    // Static variable shared by all Person objects
    static int count = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++; // Increases each time a new Person is created
    }

    void sayHello() {
        System.out.println("Hi, I'm " + name);
    }
}
```

#### Using the `static` variable:

```java
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Tom", 18);
        Person p2 = new Person("Jerry", 19);

        // Accessing the static variable using class name
        System.out.println("Total persons: " + Person.count); // Output: 2
    }
}
```

---

### 5. Summary Table

| Term           | Meaning                                     |
| -------------- | ------------------------------------------- |
| Class          | Template for objects                        |
| Object         | Instance of a class                         |
| Field          | Variable in a class                         |
| Method         | Function in a class                         |
| Constructor    | Special method for initializing an object   |
| `static` field | Shared by all objects, belongs to the class |

---

