package packages;

import javax.swing.*;
import java.awt.*;

public class questionsPage {

    public void create(JFrame frame) {
        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));  // Vertical layout
        panel.setBackground(new Color(0xcdda3e)); // Yellow background

        Font smallFont = new Font("Times New Roman", Font.BOLD, 15);

        // Question 1
        JLabel question1 = new JLabel("How attractive do you find the software's user interface?");
        question1.setFont(smallFont);
        question1.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton radio1_1 = new JRadioButton("1");
        radio1_1.setFont(smallFont);
        JRadioButton radio1_2 = new JRadioButton("2");
        radio1_2.setFont(smallFont);
        JRadioButton radio1_3 = new JRadioButton("3");
        radio1_3.setFont(smallFont);
        JRadioButton radio1_4 = new JRadioButton("4");
        radio1_4.setFont(smallFont);
        JRadioButton radio1_5 = new JRadioButton("5");
        radio1_5.setFont(smallFont);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(radio1_1);
        group1.add(radio1_2);
        group1.add(radio1_3);
        group1.add(radio1_4);
        group1.add(radio1_5);

        // Panel for Question 1 radio buttons (horizontal alignment)
        JPanel radioPanel1 = new JPanel();
        radioPanel1.setBackground(new Color(0xcdda3e));
        radioPanel1.setLayout(new BoxLayout(radioPanel1, BoxLayout.X_AXIS));
        radioPanel1.add(radio1_1);
        radioPanel1.add(Box.createRigidArea(new Dimension(10, 0)));
        radioPanel1.add(radio1_2);
        radioPanel1.add(Box.createRigidArea(new Dimension(10, 0)));
        radioPanel1.add(radio1_3);
        radioPanel1.add(Box.createRigidArea(new Dimension(10, 0)));
        radioPanel1.add(radio1_4);
        radioPanel1.add(Box.createRigidArea(new Dimension(10, 0)));
        radioPanel1.add(radio1_5);
        radioPanel1.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(question1);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(radioPanel1);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Question 2
        JLabel question2 = new JLabel("Is it easy for you to access the various features of the software?");
        question2.setFont(smallFont);
        question2.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton radio2_1 = new JRadioButton("1");
        radio2_1.setFont(smallFont);
        JRadioButton radio2_2 = new JRadioButton("2");
        radio2_2.setFont(smallFont);
        JRadioButton radio2_3 = new JRadioButton("3");
        radio2_3.setFont(smallFont);
        JRadioButton radio2_4 = new JRadioButton("4");
        radio2_4.setFont(smallFont);
        JRadioButton radio2_5 = new JRadioButton("5");
        radio2_5.setFont(smallFont);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(radio2_1);
        group2.add(radio2_2);
        group2.add(radio2_3);
        group2.add(radio2_4);
        group2.add(radio2_5);

        JPanel radioPanel2 = new JPanel();
        radioPanel2.setBackground(new Color(0xcdda3e));
        radioPanel2.setLayout(new BoxLayout(radioPanel2, BoxLayout.X_AXIS));
        radioPanel2.add(radio2_1);
        radioPanel2.add(Box.createRigidArea(new Dimension(10, 0)));
        radioPanel2.add(radio2_2);
        radioPanel2.add(Box.createRigidArea(new Dimension(10, 0)));
        radioPanel2.add(radio2_3);
        radioPanel2.add(Box.createRigidArea(new Dimension(10, 0)));
        radioPanel2.add(radio2_4);
        radioPanel2.add(Box.createRigidArea(new Dimension(10, 0)));
        radioPanel2.add(radio2_5);
        radioPanel2.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(question2);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(radioPanel2);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Question 3
        JLabel question3 = new JLabel("How simple and user-friendly is the software page design?");
        question3.setFont(smallFont);
        question3.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton radio3_1 = new JRadioButton("1");
        radio3_1.setFont(smallFont);
        JRadioButton radio3_2 = new JRadioButton("2");
        radio3_2.setFont(smallFont);
        JRadioButton radio3_3 = new JRadioButton("3");
        radio3_3.setFont(smallFont);
        JRadioButton radio3_4 = new JRadioButton("4");
        radio3_4.setFont(smallFont);
        JRadioButton radio3_5 = new JRadioButton("5");
        radio3_5.setFont(smallFont);

        ButtonGroup group3 = new ButtonGroup();
        group3.add(radio3_1);
        group3.add(radio3_2);
        group3.add(radio3_3);
        group3.add(radio3_4);
        group3.add(radio3_5);

        JPanel radioPanel3 = new JPanel();
        radioPanel3.setBackground(new Color(0xcdda3e));
        radioPanel3.setLayout(new BoxLayout(radioPanel3, BoxLayout.X_AXIS));
        radioPanel3.add(radio3_1);
        radioPanel3.add(Box.createRigidArea(new Dimension(10, 0)));
        radioPanel3.add(radio3_2);
        radioPanel3.add(Box.createRigidArea(new Dimension(10, 0)));
        radioPanel3.add(radio3_3);
        radioPanel3.add(Box.createRigidArea(new Dimension(10, 0)));
        radioPanel3.add(radio3_4);
        radioPanel3.add(Box.createRigidArea(new Dimension(10, 0)));
        radioPanel3.add(radio3_5);
        radioPanel3.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(question3);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(radioPanel3);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Question 4
        JLabel question4 = new JLabel("Are the colors and fonts used in the software appropriate?");
        question4.setFont(smallFont);
        question4.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton radio4_1 = new JRadioButton("1");
        radio4_1.setFont(smallFont);
        JRadioButton radio4_2 = new JRadioButton("2");
        radio4_2.setFont(smallFont);
        JRadioButton radio4_3 = new JRadioButton("3");
        radio4_3.setFont(smallFont);
        JRadioButton radio4_4 = new JRadioButton("4");
        radio4_4.setFont(smallFont);
        JRadioButton radio4_5 = new JRadioButton("5");
        radio4_5.setFont(smallFont);

        ButtonGroup group4 = new ButtonGroup();
        group4.add(radio4_1);
        group4.add(radio4_2);
        group4.add(radio4_3);
        group4.add(radio4_4);
        group4.add(radio4_5);

        JPanel radioPanel4 = new JPanel();
        radioPanel4.setBackground(new Color(0xcdda3e));
        radioPanel4.setLayout(new BoxLayout(radioPanel4, BoxLayout.X_AXIS));
        radioPanel4.add(radio4_1);
        radioPanel4.add(Box.createRigidArea(new Dimension(10, 0)));
        radioPanel4.add(radio4_2);
        radioPanel4.add(Box.createRigidArea(new Dimension(10, 0)));
        radioPanel4.add(radio4_3);
        radioPanel4.add(Box.createRigidArea(new Dimension(10, 0)));
        radioPanel4.add(radio4_4);
        radioPanel4.add(Box.createRigidArea(new Dimension(10, 0)));
        radioPanel4.add(radio4_5);
        radioPanel4.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(question4);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(radioPanel4);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Next button to go to Thank You page
        JButton nextButton = new JButton("Next page");
        nextButton.setFont(smallFont);
        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        nextButton.addActionListener(e -> {
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            thankYouPage thankYouPage = new thankYouPage();
            thankYouPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}
