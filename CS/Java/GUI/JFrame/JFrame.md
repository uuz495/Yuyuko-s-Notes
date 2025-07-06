---

## 🧠 What is `JFrame`?

* `JFrame` is a **top-level container** from `javax.swing`.
* It represents a window on the screen.
* You use it to add and organize your UI components.

---

## ✅ Basic `JFrame` Example

```java
import javax.swing.*;

public class MyFirstWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Window"); // Create window with a title

        frame.setSize(400, 300);                      // Set width and height
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close app when "X" is clicked
        frame.setVisible(true);                       // Show the window
    }
}
```

---

## 🧱 Common `JFrame` Methods

| Method                           | What it does                                  |
| -------------------------------- | --------------------------------------------- |
| `setTitle(String)`               | Sets the title of the window                  |
| `setSize(int width, int height)` | Sets the window size                          |
| `setVisible(boolean)`            | Shows or hides the window                     |
| `setDefaultCloseOperation(int)`  | What happens when you click the close button  |
| `add(Component)`                 | Adds a component (like `JLabel`) to the frame |
| `setLayout(LayoutManager)`       | Sets layout manager (e.g., FlowLayout)        |

---

## 🎯 Step-by-Step with Components

### 👣 1. Create a Window with a Label

```java
import javax.swing.*;

public class LabelWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Example");

        JLabel label = new JLabel("Hello, JFrame!");
        frame.add(label); // Add the label to the frame

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

---

### 👣 2. Add Button and Layout

```java
import javax.swing.*;

public class ButtonWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");

        JButton button = new JButton("Click me!");
        frame.add(button); // By default, uses FlowLayout

        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

---

## 🧩 JFrame + JPanel (Recommended)

`JPanel` lets you group components and apply layout more cleanly.

```java
import javax.swing.*;
import java.awt.*;

public class PanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel Example");
        JPanel panel = new JPanel(); // Default is FlowLayout

        JLabel label = new JLabel("Welcome!");
        JButton button = new JButton("OK");

        panel.add(label);
        panel.add(button);
        frame.add(panel); // Add panel to frame

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

---

## 📌 Layout Tip

If your components **don’t show**, make sure you:

1. Call `frame.setVisible(true)` **after** adding components.
2. Set proper **size** or use `pack()` to auto-size.

---

## 🛠 Exercise for You

Try modifying this code:

```java
JLabel label = new JLabel("Not clicked");
JButton button = new JButton("Click me!");
```

Make it so that when the button is clicked, the label changes text to “Button clicked!”. Want help with that? 😄

---

Would you like me to explain that next? Or build a small app with `JFrame`, `JButton`, and `JLabel` together?
