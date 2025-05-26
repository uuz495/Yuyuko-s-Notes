# Java Common Operaation
-------------
## 1.Arithmetic Operations
used for basic math.   
| Operator | Meaning           | Example | Result |
| -------- | ----------------- | ------- | ------ |
| `+`      | Addition       | `3 + 2` | `5`    |
| `-`      | Subtraction    | `5 - 3` | `2`    |
| `*`      | Multiplication | `4 * 2` | `8`    |
| `/`      | Division       | `8 / 2` | `4`    |
| `%`      | Modulus       | `7 % 3` | `1`    |  
Example:
```java 
int a = 10;
int b = 3;
System.out.println(a + b); // 输出 13
System.out.println(a % b); // 输出 1
```
## 2.Assignment Operations
used to assign values to variables. 
| Operator | Meaning             | Example                |
| -------- | ------------------- | ---------------------- |
| `=`      | Assign         | `x = 5`                |
| `+=`     | Add and assign      | `x += 3` → `x = x + 3` |
| `-=`     | Subtract and assign | `x -= 2`               |
| `*=`     | Multiply and assign | `x *= 4`               |
| `/=`     | Divide and assign   | `x /= 2`               |
Example:
```java
int x = 5;
x += 3; // x becomes 8
```
## 3.Comparsion Operation
used in conditions, return `true` or `false`.
| Operator | Meaning          | Example  |
| -------- | ---------------- | -------- |
| `==`     | Equal to         | `x == y` |
| `!=`     | Not equal to     | `x != y` |
| `>`      | Greater than     | `x > y`  |
| `<`      | Less than        | `x < y`  |
| `>=`     | Greater or equal | `x >= y` |
| `<=`     | Less or equal    | `x <= y` |
Example:
``` java
int a = 5;
int b = 10;
System.out.println(a > b); // false
```
## 4.Logical Operations
used with boolean values(`true` or `false`)
Example:
| Operator | Meaning          | Example  |
| -------- | ---------------- | -------- |
| `&&`     | AND         | `a > 1 && a < 10` |
| `\|\|`   | OR   | `a > 1 \|\| b < 10` |
| `!`      | NOT     | `! (x > y)`  |
## 5.Unary Operations
Operate on a single variable.
| Operator | Meaning       | Example        |
| -------- | ------------- | -------------- |
| `+`      | Positive sign | `+a`           |
| `-`      | Negative sign | `-a`           |
| `++`     | Increment | `a++` or `++a` |
| `--`     | Decrement | `a--` or `--a` |
Example:
```java 
int a = 5;
a++; // a becomes 6
```
## 6.Ternary Operation
Shorthand for if-else:
```java 
int a = 5;
int b = 10;
int max = (a > b) ? a : b; // 如果 a > b 成立，就取 a，否则取 b
```





