package packages;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public void create(JFrame frame) {

        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 600);

        Font bigFont = new Font("Times New Roman", Font.BOLD, 25);

        // Create thank you label
        JLabel thankYouLabel = new JLabel("Thank you for your collaboration!");
        thankYouLabel.setFont(bigFont);
        thankYouLabel.setBounds(10, 10, 400, 30);

        // Add components to the panel
        panel.add(thankYouLabel);

        // Add panel to the frame
        frame.add(panel);


    }


}
