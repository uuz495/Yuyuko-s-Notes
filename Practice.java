import javax.swing.*;
public class Practice {
   public static void main(String[]args) {
      JFrame frame = new JFrame("Touhou Project");
      frame.setVisible(true);
      frame.setSize(495,495);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JLabel label = new JLabel("Hello, JFrame!");
      frame.add(label); // Add the label to the frame
   }
}
