package com.chaptor10;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class IamgeUse extends JFrame {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Image");

        MyPanel myPanel = new MyPanel();

        jFrame.add(myPanel);

        jFrame.setVisible(true);
        jFrame.setBounds(110, 60, 400, 300);
        jFrame.setDefaultCloseOperation(3);

    }

}

class MyPanel extends JPanel {
    private int width = 300;
    private int heigh = 200;
    Image image = new ImageIcon("E:\\java核心技术卷一\\bookforjava\\src\\com\\chaptor10\\Myself1.jpg").getImage();

    @Override
    public void paintComponents(Graphics g) {
        g.drawImage(image, 10, 10, 250, 150, null);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(width, heigh);
    }

}


