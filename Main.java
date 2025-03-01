import javax.swing.*;
import packages.informationPage;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create and configure the main frame
        Font bigFont = new Font("Times New Roman", Font.BOLD, 20);
        JFrame frame = new JFrame("Survey form");
        frame.setFont(bigFont);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Main panel with BorderLayout and yellow background
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(0xcdda3e)); // Set panel background color to yellow

        // Title label
        JLabel title = new JLabel("Survey form");
        title.setFont(bigFont);
        title.setHorizontalAlignment(JLabel.CENTER);
        panel.add(title, BorderLayout.NORTH);

        // Create a new panel 
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBackground(new Color(0xcdda3e));

        // Add vertical glue
        centerPanel.add(Box.createVerticalGlue());

        // Start button
        JButton startButton = new JButton("Start!");
        startButton.setFont(bigFont);
        startButton.setPreferredSize(new Dimension(100, 40));
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerPanel.add(startButton);

        // Add
        centerPanel.add(Box.createVerticalGlue());
        panel.add(centerPanel, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.CENTER);

        // Action listener for start button
        startButton.addActionListener(e -> {
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the information page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        frame.setVisible(true);
    }
}
