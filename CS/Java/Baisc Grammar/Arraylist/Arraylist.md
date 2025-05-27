## What Is an ArrayList?

An `ArrayList` is a **resizable array** provided by Java. Unlike a regular array (`int[]`), it can grow or shrink as needed.

It belongs to the **`java.util`** package.

---

## Key Features

* Dynamic size: no need to specify length ahead of time.
* Can store **objects** (not primitives directly).
* Provides many useful methods: `add()`, `remove()`, `get()`, etc.

---

## Basic Syntax

### 1. Import the Class

```java
import java.util.ArrayList;
```

### 2. Create an ArrayList

```java
ArrayList<String> names = new ArrayList<>();
```

Here, `names` is a list of `String` objects.

---

## Common Methods

| Method             | Description                        |
| ------------------ | ---------------------------------- |
| `add(item)`        | Adds item to the end               |
| `add(index, item)` | Inserts item at given index        |
| `get(index)`       | Returns item at index              |
| `set(index, item)` | Replaces item at index             |
| `remove(index)`    | Removes item at index              |
| `remove(object)`   | Removes first occurrence of object |
| `size()`           | Returns number of elements         |
| `clear()`          | Removes all elements               |
| `contains(item)`   | Checks if item exists              |
| `isEmpty()`        | Returns true if list is empty      |

---

## Example

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println(fruits); // [Apple, Banana, Cherry]

        fruits.remove("Banana");
        System.out.println(fruits.get(1)); // Cherry

        fruits.set(0, "Avocado");
        System.out.println(fruits); // [Avocado, Cherry]

        System.out.println("Size: " + fruits.size()); // 2
    }
}
```

---

## Notes

* You **can't store primitives** directly (like `int`, `double`). Use wrapper classes: `Integer`, `Double`, etc.

  ```java
  ArrayList<Integer> numbers = new ArrayList<>();
  numbers.add(10); // works because of auto-boxing
  ```

* Generics (`<String>`, `<Integer>`, etc.) ensure type safety.

---

