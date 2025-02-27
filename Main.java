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
        frame.setLayout(null);

        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 600);

        // Create title label
        JLabel title = new JLabel("Survey form");
        title.setBounds(10, 10, 200, 30);
        title.setFont(bigFont);

        // Create start button
        JButton startButton = new JButton("Start!");
        startButton.setFont(bigFont);
        startButton.setBounds(10, 60, 100, 30);

        // Add components to the panel
        panel.add(title);
        panel.add(startButton);

        // Add panel to the frame
        frame.add(panel);

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
