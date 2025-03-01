package packages;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public void create(JFrame frame) {
        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));  // Set layout to BoxLayout (PAGE_AXIS)
        panel.setBackground(new Color(0xcdda3e));  // Set background color to yellow

        Font bigFont = new Font("Times New Roman", Font.BOLD, 25);

        // Create thank you label
        JLabel thankYouLabel = new JLabel("Thank you for your collaboration!");
        thankYouLabel.setFont(bigFont);
        thankYouLabel.setAlignmentX(Component.CENTER_ALIGNMENT);  // Center align the label

        // Add rigid area to add spacing
        panel.add(Box.createRigidArea(new Dimension(0, 100)));  // Space before the label
        panel.add(thankYouLabel);  // Add the thank you label
        panel.add(Box.createRigidArea(new Dimension(0, 200)));  // Space after the label

        // Add panel to the frame
        frame.add(panel);

        // Revalidate and repaint to ensure correct rendering
        frame.revalidate();
        frame.repaint();
    }
}

