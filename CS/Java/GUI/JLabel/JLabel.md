Of course! Let's **deeply learn `JLabel`**, one of the most basic but important components in Java Swing GUI programming.

---

## 🧠 什么是 `JLabel`？

**`JLabel` 是一个用于显示文字或图像的 Swing 组件**，但它是**只读**的，不能被用户修改。

> `JLabel` 用于显示文字、图标、状态信息、标签名等。

---

## ✅ 最简单的例子：创建一个文本标签

### 📄 示例代码

```java
import javax.swing.*;

public class LabelDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel 示例");

        JLabel label = new JLabel("你好，JLabel！");

        frame.add(label);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

### 📖 解说：

| 行                  | 作用          |
| ------------------ | ----------- |
| `JLabel label`     | 创建一个显示文字的标签 |
| `frame.add(label)` | 把标签加到窗口中    |
| `setVisible(true)` | 显示窗口        |

---

## 🎨 设置文字样式（字体、颜色、位置）

```java
import javax.swing.*;
import java.awt.*;

public class StyledLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("样式标签");
        JLabel label = new JLabel("蓝色加粗文字");
        
        // 设置字体 Font(String 字体, int 样式, int 大小)
        label.setFont(new Font("Serif", Font.BOLD, 24));

        // 设置文字颜色
        label.setForeground(Color.BLUE);

        // 设置水平居中
        label.setHorizontalAlignment(SwingConstants.CENTER);

        frame.add(label);
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

---

## 🖼️ 显示图像（ImageIcon）

```java
import javax.swing.*;

public class ImageLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("图像标签");

        ImageIcon icon = new ImageIcon("example.png");
        JLabel label = new JLabel(icon);

        frame.add(label);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

📌 注意：图片路径 `"example.png"` 应该是项目根目录下的文件。

---

## ✨ 同时显示文字和图片

```java
import javax.swing.*;

public class TextImageLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("图文标签");

        ImageIcon icon = new ImageIcon("icon.png");
        JLabel label = new JLabel("图标标签", icon, SwingConstants.LEFT); // 左边是图标，右边是文字

        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

---

## 🧰 常用方法总结

| 方法名                           | 作用                     |
| ----------------------------- | ---------------------- |
| `setText(String text)`        | 设置标签显示的文字              |
| `getText()`                   | 获取当前标签显示的文字            |
| `setIcon(Icon icon)`          | 设置图片                   |
| `setHorizontalAlignment(int)` | 设置水平对齐方式（LEFT, CENTER） |
| `setVerticalAlignment(int)`   | 设置垂直对齐方式（TOP, CENTER）  |
| `setFont(Font)`               | 设置文字字体                 |
| `setForeground(Color)`        | 设置文字颜色                 |

---

## 🧪 小练习

你可以试试以下挑战：

* 显示一张图片 + 文字，并让文字在图片下方
* 创建多个标签，排成一行
* 点击按钮后改变标签的内容（需要配合 `JButton` 和监听器）

---

## 📌 你现在可以试试这个：

```java
JLabel label = new JLabel("点击按钮前");
JButton button = new JButton("点击我");

button.addActionListener(e -> label.setText("按钮被点击了！"));
```

要不要我帮你把完整程序写出来？还是你想继续学习 `JButton` 或 `JTextField` 呢？👀

你说学习方向，我陪你学到底！💪
