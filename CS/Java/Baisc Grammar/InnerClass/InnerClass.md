## ✅ What Are Inner Classes?

**Inner classes** are classes defined **inside another class**. They are used when you want to logically group classes together and **access members of the outer class** from the inner class.

---

## ✅ Types of Inner Classes

Java has **four main types** of inner classes:

| Type                     | Defined Inside                   | Can Access Outer Class Members | Needs Outer Class Instance? |
| ------------------------ | -------------------------------- | ------------------------------ | --------------------------- |
| 1. Member Inner Class    | Inside a class (outside methods) | ✅ Yes                          | ✅ Yes                       |
| 2. Local Inner Class     | Inside a method                  | ✅ Yes (with limitations)       | ❌ No (local use only)       |
| 3. Static Nested Class   | Inside a class                   | ❌ Only static members          | ❌ No                        |
| 4. Anonymous Inner Class | Inside a method                  | ✅ Yes                          | ❌ No (used once)            |

---

## 📌 Member Inner Class

```java
public class Outer {
    private String name = "OuterClass";

    public class Inner {
        public void show() {
            System.out.println("Outer name is " + name);
        }
    }
}
```

Usage:

```java
Outer outer = new Outer();
Outer.Inner inner = outer.new Inner(); // Needs outer instance
inner.show();
```

---

## 📌 Local Inner Class

```java
public class Outer {
    public void method() {
        int num = 10; // Must be effectively final
        class LocalInner {
            public void show() {
                System.out.println("num = " + num);
            }
        }
        LocalInner inner = new LocalInner();
        inner.show();
    }
}
```

---

## 📌 Static Nested Class

```java
public class Outer {
    private static String message = "Hello";

    public static class StaticInner {
        public void display() {
            System.out.println("Message is: " + message);
        }
    }
}
```

Usage:

```java
Outer.StaticInner inner = new Outer.StaticInner(); // No outer object needed
inner.display();
```

---

## 📌 Anonymous Inner Class

Used for **one-time use**, often in callbacks or threads:

```java
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("Running anonymously");
    }
};
new Thread(r).start();
```

---

## ✅ Summary Table

| Inner Class Type      | Static? | Can Access Outer Members? | Common Use Case                    |
| --------------------- | ------- | ------------------------- | ---------------------------------- |
| Member Inner Class    | ❌ No    | ✅ Yes                     | Grouping classes logically         |
| Static Nested Class   | ✅ Yes   | ❌ Only static             | Utility/helper classes             |
| Local Inner Class     | ❌ No    | ✅ Yes (final only)        | Temporary use in methods           |
| Anonymous Inner Class | ❌ No    | ✅ Yes                     | Single-use logic (e.g. `Runnable`) |

---

