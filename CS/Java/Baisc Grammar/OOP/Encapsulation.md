## What Is Encapsulation?

**Encapsulation** is the practice of **hiding internal data** and only allowing access to it through **public methods**.

This allows:

* Data protection
* Better control over how fields are used or changed
* Cleaner, more maintainable code

---

## Key Points

1. **Make fields `private`** so they cannot be accessed directly.
2. **Provide `public` methods** (`getters` and `setters`) to read or change the values.
3. Optionally, **validate values** in the setter methods.

---

## Example Without Encapsulation (not safe)

```java
public class Student {
    String name;
    int age;
}
```

Here, anyone can set a wrong age like `-1`. There's no control.

---

## Encapsulated Version

```java
public class Student {
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        if (a > 0) {
            age = a;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }
}
```

---

## Using the Class

```java
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Alice");
        s.setAge(20);

        System.out.println(s.getName()); // Alice
        System.out.println(s.getAge());  // 20
    }
}
```

---

## Summary

| Concept       | Explanation                                  |
| ------------- | -------------------------------------------- |
| `private`     | Restricts access to the variable             |
| `public`      | Allows controlled access via methods         |
| Getter        | Reads a private value (`getName()`)          |
| Setter        | Sets or changes a private value (`setAge()`) |
| Encapsulation | Combines data and methods safely in a class  |

---

