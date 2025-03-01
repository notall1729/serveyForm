
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

        // Change panel layout to BorderLayout
        frame.setLayout(new BorderLayout());

        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(0xcdda3e)); // Set panel color to yellow

        // Create title label
        JLabel title = new JLabel("Survey form");
        title.setFont(bigFont);
        title.setHorizontalAlignment(JLabel.CENTER); // Center-align the title
        panel.add(title, BorderLayout.NORTH);

        // Create start button
        JButton startButton = new JButton("Start!");
        startButton.setFont(bigFont);
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Center-align button
        startButton.setAlignmentY(Component.CENTER_ALIGNMENT);


        // Add rigid area to separate button
        panel.add(Box.createRigidArea(new Dimension(10, 20)), BorderLayout.CENTER); // Space between title and button
        panel.add(startButton, BorderLayout.CENTER); // Add start button in the center

        // Add panel to the frame
        frame.add(panel, BorderLayout.CENTER);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
