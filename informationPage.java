package packages;

import javax.swing.*;
import java.awt.*;

public class informationPage {

    public void create(JFrame frame) {
        // Main panel with BoxLayout (vertical) and yellow background
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(new Color(0xcdda3e)); // Yellow background

        Font smallFont = new Font("Times New Roman", Font.BOLD, 13);

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setFont(smallFont);
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField nameField = new JTextField(15);
        nameField.setMaximumSize(nameField.getPreferredSize());
        nameField.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Age Label and Text Field
        JLabel ageLabel = new JLabel("Age");
        ageLabel.setFont(smallFont);
        ageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField ageField = new JTextField(15);
        ageField.setMaximumSize(ageField.getPreferredSize());
        ageField.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setFont(smallFont);
        emailLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField emailField = new JTextField(15);
        emailField.setMaximumSize(emailField.getPreferredSize());
        emailField.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Software Familiarity Level Label
        JLabel levelLabel = new JLabel("Level of familiarity with similar software?");
        levelLabel.setFont(smallFont);
        levelLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Radio buttons for familiarity levels
        JRadioButton level1 = new JRadioButton("Beginner");
        level1.setFont(smallFont);
        JRadioButton level2 = new JRadioButton("Intermediate");
        level2.setFont(smallFont);
        JRadioButton level3 = new JRadioButton("Advanced");
        level3.setFont(smallFont);
        JRadioButton level4 = new JRadioButton("Unfamiliar");
        level4.setFont(smallFont);

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        // Panel for radio buttons: horizontal arrangement, center aligned
        JPanel radioPanel = new JPanel();
        radioPanel.setBackground(new Color(0xcdda3e)); // Match main panel color
        radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.X_AXIS));
        radioPanel.add(level1);
        radioPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        radioPanel.add(level2);
        radioPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        radioPanel.add(level3);
        radioPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        radioPanel.add(level4);
        radioPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Add components with rigid areas for spacing
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(levelLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(radioPanel);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Next Page Button, centered
        JButton nextButton = new JButton("Next page");
        nextButton.setFont(smallFont);
        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        nextButton.addActionListener(e -> {
            // Remove current panel and move to questions page
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            questionsPage questionsPage = new questionsPage();
            questionsPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });
        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}
