## Goal
Arrange an array from **small to large** (ascending order).

For example:
Input: `[5, 3, 8, 4, 2]`
Output: `[2, 3, 4, 5, 8]`

---

## Core Idea (Step-by-Step)

### ➤ Passes (外层循环控制轮数)

We loop over the array **multiple times**. Each round pushes the **largest unsorted number to the end**.

### ➤ Compare & Swap (内层循环控制比较)

For each pair of adjacent elements:

* If **left > right**, swap them.
* This way, larger numbers "bubble" to the right.

---

##  Visualization

Imagine the array: `[5, 3, 8, 4, 2]`

### **Pass 1:**

* Compare 5 & 3 → swap → `[3, 5, 8, 4, 2]`
* Compare 5 & 8 → OK
* Compare 8 & 4 → swap → `[3, 5, 4, 8, 2]`
* Compare 8 & 2 → swap → `[3, 5, 4, 2, 8]` ✅

**Biggest number (8) reaches the end**

### **Pass 2:**

* Compare 3 & 5 → OK
* Compare 5 & 4 → swap → `[3, 4, 5, 2, 8]`
* Compare 5 & 2 → swap → `[3, 4, 2, 5, 8]` ✅

### Continue until sorted...

---

## ✅ Java Code (with Explanation)

```java
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        bubbleSort(arr);

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Bubble sort method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Outer loop - controls number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop - compares pairs
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap if out of order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
```

---

## 📈 Algorithm Analysis

| Feature      | Description                                  |
| ------------ | -------------------------------------------- |
| Type         | Comparison sort                              |
| Time (Best)  | O(n) — if already sorted (with optimization) |
| Time (Worst) | O(n²)                                        |
| Space        | O(1) – in-place                              |
| Stable       | ✅ Yes                                        |

---

## 📌 Add Optimization (Early Exit)

If no swaps in a pass, array is sorted.

```java
boolean swapped = false;
for (...) {
    swapped = false;
    for (...) {
        if (...) {
            swap
            swapped = true;
        }
    }
    if (!swapped) break; // exit early
}
```

---

## ✅ Summary of Bubble Sort

| Step    | Action              |
| ------- | ------------------- |
| Compare | Each adjacent pair  |
| Swap    | If out of order     |
| Repeat  | Until no more swaps |
| Result  | Sorted array        |

---


