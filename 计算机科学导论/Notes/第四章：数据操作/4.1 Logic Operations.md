## ✅ 4.1 Logic Operations

### 📌 What are Logic Operations?

Logic operations apply **Boolean algebra rules** to **bits** (0 or 1).
They can be applied:

* **At the bit level** (single bits)
* **At the pattern level** (multiple bits simultaneously)

---

### 📌 4.1.1 Bit-Level Logic Operations

We treat:

* **$0$** as **False**
* **$1$** as **True**

There are **four basic logic operators**:

---

### 1. `NOT` 

| Input | Output |
| ----- | ------ |
| **$0$**     | **$1$**      |
| **$1$**     | **$0$**      |

* **Unary operator**
* Flips the bit

---

### 2. `AND` 

| A | B | A AND B |
| - | - | ------- |
| **$0$** | **$0$** | **$0$**       |
| **$0$** | **$1$** | **$0$**       |
| **$1$** | **$0$** | **$0$**       |
| **$1$** | **$1$** | **$1$**       |

* **Binary operator**
* Output is **$1$** **iff both inputs are $1$**

💡 **Property**:
If one input is **$0$**, output is always **$0$**.
which means:

 **$$x \space and \space 0 = 0$$**
 **$$0 \space and \space x = 0$$**

---

### 3. `OR` 

| A | B | A OR B |
| - | - | ------ |
| **$0$** | **$0$** | **$0$**      |
| **$0$** | **$1$** | **$1$**      |
| **$1$** | **$0$** | **$1$**      |
| **$1$** | **$1$** | **$1$**      |

* **Binary operator**
* Output is **$1$** if exist input is **$1$**

💡 **Property**:
If one input is **$1$**, output is always **$1$**.

 **$$x \space or \space 1 = 1$$**
 **$$1\space or \space x = 1$$**

---

### 4. `XOR` 

| A | B | A XOR B |
| - | - | ------- |
| **$0$** | **$0$** | **$0$**       |
| **$0$** | **$1$** | **$1$**       |
| **$1$** | **$0$** | **$1$**       |
| **$1$** | **$1$** | **$0$**       |

* **Binary operator**
* Output is **$1$** if **inputs are different**
* Output is **$0$** if **inputs are the same**





💡 **Property**:
If one input is `1`, output is the **complement** of the other input.

 **$$1 \space xor \space x = not \space x$$**
 **$$x \space xor \space 1 = not \space x$$**

---

### 🔁 Simulating XOR with AND, OR, and NOT

**$$x \oplus y \equiv (x \land \lnot y) \lor (\lnot x \land y)$$**



---

### ✅ Summary Table

| Operation | Symbol | # of Inputs | Description                  |
| --------- | ------ | ----------- | ---------------------------- |
| **NOT**       | **$¬x$**     | **$1$**           | **Flips bit**                    |
| **AND**       | **$x ∧ y$**  | **$2$**           | **True only if both are true**   |
| **OR**        | **$x ∨ y$**  | **$2$**           | **True if at least one is true** |
| **XOR**       | **$x ⊕ y$**  | **$2$**           | **True if inputs are different** |

---

## ✅ 4.1.2 Logic Operations at Pattern Level

### 📌 How It Works

If you have:

* Pattern A: `10011000`
* Pattern B: `00101010`

Then:

* `NOT A` → Apply NOT to each bit of A.
* `A AND B` → Compare each bit of A and B with the AND operator.
* `A OR B` → Same, using OR.
* `A XOR B` → Same, using XOR.

---

### ✳️ Example 4.3 — `NOT` Operation

Apply NOT to:
**Input**: `10011000`

| Bit | 1 | 0 | 0 | 1 | 1 | 0 | 0 | 0 |
| --- | - | - | - | - | - | - | - | - |
| NOT | 0 | 1 | 1 | 0 | 0 | 1 | 1 | 1 |

**Output**: `01100111`

---

### ✳️ Example 4.4 — `AND` Operation

**Input A**: `10011000`
**Input B**: `00101010`

| A       | 1 | 0 | 0 | 1 | 1 | 0 | 0 | 0 |
| ------- | - | - | - | - | - | - | - | - |
| B       | 0 | 0 | 1 | 0 | 1 | 0 | 1 | 0 |
| A AND B | 0 | 0 | 0 | 0 | 1 | 0 | 0 | 0 |

**Output**: `00001000`

---

### ✳️ Example 4.5 — `OR` Operation

**Input A**: `10011001`
**Input B**: `00101110`

| A      | 1 | 0 | 0 | 1 | 1 | 0 | 0 | 1 |
| ------ | - | - | - | - | - | - | - | - |
| B      | 0 | 0 | 1 | 0 | 1 | 1 | 1 | 0 |
| A OR B | 1 | 0 | 1 | 1 | 1 | 1 | 1 | 1 |

**Output**: `10111111`

---

### ✳️ Example 4.6 — `XOR` Operation

**Input A**: `10011001`
**Input B**: `00101110`

| A       | 1 | 0 | 0 | 1 | 1 | 0 | 0 | 1 |
| ------- | - | - | - | - | - | - | - | - |
| B       | 0 | 0 | 1 | 0 | 1 | 1 | 1 | 0 |
| A XOR B | 1 | 0 | 1 | 1 | 0 | 1 | 1 | 1 |

**Output**: `10110111`

---

## 🛠 4.1.3 Applications of Logic Operations


---

### ✅ 1. Complementing (NOT)

* >**Operator**: **NOT**
* >**Purpose**: **Flip every bit**  0 becomes 1, 1 becomes 0.

---

### ✅ 2. Unsetting Specific Bits (AND)

* >**Operator**: **AND**
* >**Purpose**: **Force selected bits to **0** using a mask**
* >**Mask rule**: **$1 → keep, 0 → unset (to \space 0)$**

📌 **Example 4.7**
**Input**: **$10100110$**
**Mask**:  **$00000111$**
 Unset the 5 leftmost bits.

| Bit  | 1 | 0 | 1 | 0 | 0 | 1 | 1 | 0 |
| ---- | - | - | - | - | - | - | - | - |
| Mask | 0 | 0 | 0 | 0 | 0 | 1 | 1 | 1 |
| AND  | 0 | 0 | 0 | 0 | 0 | 1 | 1 | 0 |

**Output**: **$00000110$**

---

### ✅ 3. Setting Specific Bits (OR)

* >**Operator : OR**
* >**Purpose**: **Force selected bits to **1** using a mask**
* >**Mask rule**: **$1 → set \space to 1, 0 → leave \space as-is$**

📌 **Example 4.8**
**Input**: **$10100110$**
**Mask**:  **$11111000$**
➡ Set the 5 leftmost bits.

| Bit  | 1 | 0 | 1 | 0 | 0 | 1 | 1 | 0 |
| ---- | - | - | - | - | - | - | - | - |
| Mask | 1 | 1 | 1 | 1 | 1 | 0 | 0 | 0 |
| OR   | 1 | 1 | 1 | 1 | 1 | 1 | 1 | 0 |

**Output**: **$11111110$**

---

### ✅ 4. Flipping Specific Bits (XOR)

* >**Operator: XOR**
* >**Purpose: Flip  specific bits using a mask**
* >**Mask rule**: **$1 → flip, 0 → keep \space original$**

📌 **Example 4.9**
**Input: $10100110$**
**Mask:  $11111000$**
➡ Flip the 5 leftmost bits.

| Bit  | 1 | 0 | 1 | 0 | 0 | 1 | 1 | 0 |
| ---- | - | - | - | - | - | - | - | - |
| Mask | 1 | 1 | 1 | 1 | 1 | 0 | 0 | 0 |
| XOR  | 0 | 1 | 0 | 1 | 1 | 1 | 1 | 0 |

**Output: $01011110$**

---

### 📌 Summary Table

| Operation | Effect                   | Mask `1` Does What? | 
| --------- | ------------------------ | ------------------- | 
| `NOT`     | Flip all bits            | –                   | 
| `AND`     | Unset selected bits to 0 | Leave as-is         | 
| `OR`      | Set selected bits to 1   | Set to 1            |  
| `XOR`     | Flip selected bits       | Flip                | 




