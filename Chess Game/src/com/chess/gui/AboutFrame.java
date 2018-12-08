package com.chess.gui;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AboutFrame {

    public AboutFrame(){
        JFrame frame = new JFrame("About");
        frame.setVisible(true);
        frame.setSize(400,500);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);

        JPanel panel = (JPanel) frame.getContentPane();
        panel.setLayout(null);

        JLabel label = new JLabel();
        try {
            BufferedImage image = ImageIO.read(new File("art.png"));
            ImageIcon icon = new ImageIcon(image.getScaledInstance(250, 250, image.SCALE_SMOOTH));
            label.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(AboutFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        panel.add(label);
        Dimension size = label.getPreferredSize();
        label.setBounds(100, 300, size.width, size.height);


        JPanel panel1 = (JPanel) frame.getContentPane();
        panel1.setLayout(null);

        JLabel label1 = new JLabel();
        label1.setText("VUWIT15 - Hanoi University of Science and Technology");
        label1.setBounds(100, 100, 400, size.height);

        JLabel label2 = new JLabel();
        label2.setText("Nguyễn Thanh Hòa");
        label2.setBounds(100, 100, size.width, size.height);

        JLabel label3 = new JLabel();
        label3.setText("Nguyễn Đình Quân");
        label3.setBounds(100, 100, size.width, size.height);

        JLabel label4 = new JLabel();
        label4.setText("Nguyễn Thành Nam");
        label4.setBounds(100, 100, size.width, size.height);

        JLabel label5 = new JLabel();
        label5.setText("Huỳnh Hưng");
        label5.setBounds(100, 100, size.width, size.height);

        panel1.add(label1);
        panel1.add(label2);
        panel1.add(label3);
        panel1.add(label4);
        panel1.add(label5);

        label.setLocation(77, 50);
        label1.setLocation(30, 200);
        label2.setLocation(130,220);
        label3.setLocation(130, 240);
        label4.setLocation(130,260);
        label5.setLocation(130, 280);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}
