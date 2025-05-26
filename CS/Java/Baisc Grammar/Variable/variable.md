## What Are Variable Types in Java?

In Java, a **variable type** tells the computer **what kind of data** the variable will hold.
For example: numbers, text, characters, or true/false values.

---

## Java Has Two Main Categories of Variable Types:

| Category            | Description                                |
| ------------------- | ------------------------------------------ |
| **Primitive types** | Basic built-in types (like numbers, chars) |
| **Reference types** | Used for objects, arrays, and strings      |

---

## 1. Primitive Types (8 total):


| Type      | Example               | Description                                 |
| --------- | --------------------- | ------------------------------------------- |
| `int`     | `int x = 10;`         | Whole numbers                               |
| `double`  | `double pi = 3.14;`   | Decimal numbers (high precision)            |
| `float`   | `float f = 2.5f;`     | Decimal numbers (less precise, ends in `f`) |
| `char`    | `char c = 'A';`       | Single character (in single quotes)         |
| `boolean` | `boolean ok = true;`  | True or false                               |
| `byte`    | `byte b = 100;`       | Very small integers (-128 to 127)           |
| `short`   | `short s = 30000;`    | Small integers                              |
| `long`    | `long big = 123456L;` | Big integers (ends in `L`)                  |

---

### Example:

```java
int age = 25;
double gpa = 3.75;
float height = 1.82f;
char grade = 'A';
boolean passed = true;
```

---

## 2. Reference Types


These are types that refer to **objects** (not raw values):

| Type         | Example                         | Description                   |
| ------------ | ------------------------------- | ----------------------------- |
| `String`     | `String name = "Alice";`        | A sequence of characters      |
| `Array`      | `int[] scores = {90, 85, 100};` | A group of values             |
| `Custom class` | `Student s = new Student();`    | Instances of your own classes |

---

### Example:

```java
String name = "Bob";
int[] numbers = {1, 2, 3, 4};
```





