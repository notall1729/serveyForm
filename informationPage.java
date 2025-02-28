package packages;

import javax.swing.*;
import java.awt.*;

public class informationPage {

    public void create(JFrame frame) {
        // Create the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));  // Set layout to BoxLayout (PAGE_AXIS)
        panel.setBackground(Color.YELLOW); // Set panel background color to yellow

        Font smallFont = new Font("Times New Roman", Font.BOLD, 13);

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setFont(smallFont);
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align label
        JTextField nameField = new JTextField(15);
        nameField.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align text field

        // Age Label and Text Field
        JLabel ageLabel = new JLabel("Age");
        ageLabel.setFont(smallFont);
        ageLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align label
        JTextField ageField = new JTextField(15);
        ageField.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align text field

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setFont(smallFont);
        emailLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align label
        JTextField emailField = new JTextField(15);
        emailField.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align text field

        // Software Familiarity Level
        JLabel levelLabel = new JLabel("Level of familiarity with similar software?");
        levelLabel.setFont(smallFont);
        levelLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align label

        JRadioButton level1 = new JRadioButton("Beginner");
        level1.setFont(smallFont);
        level1.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align radio button
        JRadioButton level2 = new JRadioButton("Intermediate");
        level2.setFont(smallFont);
        level2.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align radio button
        JRadioButton level3 = new JRadioButton("Advanced");
        level3.setFont(smallFont);
        level3.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align radio button
        JRadioButton level4 = new JRadioButton("Unfamiliar");
        level4.setFont(smallFont);
        level4.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align radio button

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        // Add rigid areas between components to add spacing
        panel.add(Box.createRigidArea(new Dimension(0, 20)));  // Space between name and age
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));  // Space between fields

        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));  // Space between fields

        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));  // Space between fields

        panel.add(levelLabel);
        panel.add(level1);
        panel.add(level2);
        panel.add(level3);
        panel.add(level4);

        panel.add(Box.createRigidArea(new Dimension(0, 20)));  // Space before next button
        // Next Page Button
        JButton nextButton = new JButton("Next page");
        nextButton.setFont(smallFont);
        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align button
        nextButton.addActionListener(e -> {
            // Remove current panel and move to Page2
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
