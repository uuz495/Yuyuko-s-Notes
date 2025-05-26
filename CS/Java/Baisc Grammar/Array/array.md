## What is an Array?

An **array** is a container that **holds multiple values** of the **same type**.

Think of it as a **list of boxes**, where each box has a number (called an **index**) and holds one value.

---

## How to Declare an Array

```java
int[] numbers;   // declare an array of integers
```

This only **declares** the array — it doesn’t create it yet.

---

## How to Create and Fill an Array

```java
numbers = new int[5];  // create an array of 5 integers
```

Now you have an array that can hold 5 integers, all default to 0.

---

## Declare + Create + Fill (All-in-One)

```java
int[] numbers = {10, 20, 30, 40, 50};
```

This creates an array with 5 values already inside.

---

## Access Elements

Array positions start at **0**.

```java
System.out.println(numbers[0]);  // prints 10
System.out.println(numbers[2]);  // prints 30
```

---

## Modify Elements

```java
numbers[1] = 99;  // change second value to 99
System.out.println(numbers[1]);  // prints 99
```

---

## Loop Through an Array

### Option 1: `for` loop

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

### Option 2: `for-each` loop

```java
for (int n : numbers) {
    System.out.println(n);
}
```

---

