# 数据类型

## 一、基础类型分类

### 1. 无类型（void）

* 表示无值。
* 常用于函数无返回值：`void func();`

### 2. 空指针类型（`std::nullptr_t`，C++11 起）

* 用于表示空指针 `nullptr` 的类型。

### 3. 布尔类型（`bool`）

* 取值：`true` 或 `false`。
* 一般占 1 字节（8 位），位数可通过 `CHAR_BIT` 宏获取。


### 4. 整数类型

分为符号性和大小两个维度：

* **符号性：**

  * `signed`：有符号（默认）
  * `unsigned`：无符号
* **大小（位宽）：**

  * `char` ≥ 8位
  * `short` ≥ 16位
  * `int` ≥ 16位（通常为 32 位）
  * `long` ≥ 32位
  * `long long` ≥ 64位（C++11 起）

> **表示范围公式：**
>
> * 有符号：$\[-2^{x-1}, 2^{x-1} - 1]\$
> * 无符号：$\[0, 2^x - 1]\$

### 5. 字符类型（char）

* 类型：`char`、`signed char`、`unsigned char`。
* 实际存储为整数，通常按 ASCII 编码。
* `char` 的符号性依赖平台

### 6. 浮点类型

| 类型            | 格式           | 位宽  | 最大值                 | 精度      |
| ------------- | ------------ | --- | ------------------- | ------- |
| `float`       | binary32     | 32  | \~\$3.4×10^{38}\$   | \~6-9   |
| `double`      | binary64     | 64  | \~\$1.8×10^{308}\$  | \~15-17 |
| `long double` | binary128/扩展 | 80+ | \~\$1.2×10^{4932}\$ | \~18+   |

特殊值支持：

* 正负无穷：`INFINITY`
* 负零：`-0.0`
* 非数（NaN）：`NAN`, `std::nan`, `std::isnan`

## 二、定宽整数类型（C++11 起）

头文件：

* `<cstdint>` 提供类型：如 `int32_t`, `uint64_t`
* `<cinttypes>` 提供格式宏：如 `PRId64`, `SCNd64`

### 类型分类

* **精确位宽：** `intN_t`, `uintN_t`（如 `int32_t`）
* **最小位宽：** `int_leastN_t`, `uint_leastN_t`
* **最快类型：** `int_fastN_t`, `uint_fastN_t`

标准规定必须支持以下类型（共 16 种）：

```
int_fast8_t, int_fast16_t, int_fast32_t, int_fast64_t
int_least8_t, int_least16_t, int_least32_t, int_least64_t
uint_fast8_t, uint_fast16_t, uint_fast32_t, uint_fast64_t
uint_least8_t, uint_least16_t, uint_least32_t, uint_least64_t
```

常见扩展类型（如 GCC）：

* `__int128_t`, `__uint128_t`

⚠️ 输出这些扩展类型时不能直接使用 `std::cout`，需使用自定义函数或转换。

### 示例代码说明

```cpp
#include <cmath>
#include <iostream>

int f1(int n) {
  return abs(n);  // Good: C 风格
}

int f2(int n) {
  return std::abs(n);  // Good: C++ 风格
}

__int128_t f3(__int128_t n) {
  return abs(n);  // Bad: 被转换为 int
}
```

### 注意事项

* STL 不一定支持扩展整数类型。
* 使用定宽类型可提升跨平台移植性。

---

