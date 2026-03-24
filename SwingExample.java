import javax.swing.*;
import java.awt.event.*;

public class SwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");  // Create a JFrame (Window)
        
        JButton button = new JButton("Click Me");  // Create a button
        button.setBounds(50, 50, 100, 50);  // Set button position and size
        
        // Adding an ActionListener for button click
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");  // Display a message when the button is clicked
            }
        });
        
        frame.add(button);  // Add the button to the frame
        frame.setSize(300, 200);  // Set frame size
        frame.setLayout(null);  // Set layout to null for absolute positioning
        frame.setVisible(true);  // Make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close application on close button click
    }
}
