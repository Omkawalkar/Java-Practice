import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class swing {
    public static void main(String[] args) {

        // Run GUI on Event Dispatch Thread (best practice)
        SwingUtilities.invokeLater(() -> {

            // Create Frame
            JFrame frame = new JFrame("My First Swing App");
            frame.setSize(420, 420);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);

            // Create Label
            JLabel label = new JLabel("HEY Hello World!", JLabel.CENTER);
            label.setBounds(100, 100, 200, 200);

            // Styling
            Border border = BorderFactory.createLineBorder(Color.BLUE, 3);
            label.setBorder(border);
            label.setBackground(Color.BLACK);
            label.setForeground(Color.GREEN);
            label.setOpaque(true);

            label.setFont(new Font("Arial", Font.BOLD, 16));

            // Add label to frame
            frame.add(label);

            // Make frame visible
            frame.setVisible(true);
        });
    }
}