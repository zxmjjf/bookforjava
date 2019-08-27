package com.chaptor10;

import javax.swing.*;

public class PlafFrame extends JFrame {
    private JPanel buttonPanel;

    public static void main(String[] args) {
        PlafFrame plafFrame = new PlafFrame();
        plafFrame.setDefaultCloseOperation(3);
        plafFrame.setVisible(true);
        plafFrame.setBounds(100, 50, 300, 400);
    }

    public PlafFrame(){
        buttonPanel = new JPanel();

        UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo info : infos) {
            makeButton(info.getName(), info.getClassName());
        }

        add(buttonPanel);
        pack();
    }

    private void makeButton(String name, String className) {
        JButton jButton = new JButton(name);
        buttonPanel.add(jButton);

        jButton.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel(className);
                SwingUtilities.updateComponentTreeUI(this);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
    }
}
