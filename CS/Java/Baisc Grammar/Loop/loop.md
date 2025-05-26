##  Java has 3 main loop types:

| Loop Type    | When to use                                          |
| ------------ | ---------------------------------------------------- |
| `for`        | When you know **how many times** to repeat something |
| `while`      | When you want to loop **while a condition is true**  |
| `do...while` | Like `while`, but it always runs **at least once**   |

---

## 1. `for` Loop

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Hello " + i);
}
```

**What it does:**

* Starts `i = 0`
* Runs while `i < 5`
* Increases `i` each time
* Prints 5 times: Hello 0, Hello 1, ..., Hello 4

---

## 2. `while` Loop

```java
int i = 0;
while (i < 5) {
    System.out.println("Count: " + i);
    i++;
}
```

**What it does:**

* Starts with `i = 0`
* Runs the loop while `i < 5` is true
* Stops when `i` reaches 5

---

## 3. `do...while` Loop

```java
int i = 0;
do {
    System.out.println("i is " + i);
    i++;
} while (i < 3);
```

**What it does:**

* Runs the block first
* Then checks the condition
* Always runs **at least once**, even if the condition is false

---

## Extra: `for-each` loop (for arrays)

```java
int[] nums = {10, 20, 30};
for (int n : nums) {
    System.out.println(n);
}
```

**Used for:** looping through arrays or lists
**What it does:** prints each number in `nums`

---
