## Method 1: Use `Arrays.sort()` (Easy way)

```java
import java.util.Array;
public class Main() {
    public static void main(String[]args) {
        int[] uuz = {1, 2, 5, -1 ,13};

        
    }
}
```

### Output:

```
[1, 2, 5, 7, 9]
```

### Notes:

* `Arrays.sort()` is a built-in method in Java.
* Don’t forget to `import java.util.Arrays;`.

---

## Method 2: Write your own sorting algorithm (for learning)

Here’s a simple **bubble sort** example:

```java
public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};

        // Bubble sort
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
```

