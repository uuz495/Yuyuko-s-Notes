# **Input and Output**
## **`cin` and  `cout`**
``` c
#include <iostream>

int main() {
    int x , y;
    std::cin >> x >> y;
    std::cout << y << std::endl << x;
    return 0;
}
```
## **`scanf` and `printf`**
``` c
#include <cstdio>
int main() {
    int x, y;
    scanf("%d%d", &x, &y);
    printf("%d\n%d", y, x);
    return 0;
}
```


## 常用格式控制符

| 格式符    | 对应类型                 | 说明          |
| ------ | -------------------- | ----------- |
| `%d`   | `int`                | 有符号整型（整数）   |
| `%u`   | `unsigned int`       | 无符号整型       |
| `%lld` | `long long`          | 长整型         |
| `%llu` | `unsigned long long` | 无符号长整型      |
| `%lf`  | `double`             | 双精度浮点数      |
| `%c`   | `char`               | 单个字符        |
| `%s`   | `char[]`             | 字符串（读入不含空格） |

⚠️ 注意：使用 `scanf` 时，变量名前要加 `&` 取地址符（如 `&a`），除非是字符串（`char[]`）。

---

## 常用格式控制技巧

| 格式      | 含义说明                      |
| ------- | ------------------------- |
| `%1d`   | 读取/输出一个宽度为 1 的整数。         |
| `%5d`   | 输出宽度为 5，不足补空格。            |
| `%.6lf` | 输出小数，保留 6 位小数。            |
| `%04d`  | 输出整数，宽度为 4，不足补零，例如 `0721`。 |

---

