import java.awt.*;
import java.awt.event.*;

public class AWTExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");  // Creating a frame

        Button button = new Button("Click Me");  // Creating a button
        button.setBounds(50, 50, 100, 50);  // Set button position and size

        // Adding a window listener for closing the window
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);  // Exit the program when the window is closed
            }
        });

        frame.add(button);  // Adding button to the frame
        frame.setSize(300, 200);  // Set the size of the frame
        frame.setLayout(null);  // Use no layout manager (absolute positioning)
        frame.setVisible(true);  // Make the frame visible
    }
}
