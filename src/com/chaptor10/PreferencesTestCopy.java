package com.chaptor10;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class PreferencesTest {
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            try {
                PreferencesFrame frame = new PreferencesFrame();
                frame.setDefaultCloseOperation(3);
                frame.setVisible(true);
            } catch (BackingStoreException e) {
                System.out.println("BackingStoreException");
            }
        } );

    }
}

class PreferencesFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final  int DEFAULT_HEIGHT = 200;
    private Preferences root = Preferences.userRoot(); //绝对路径是当前路径“/”
    private Preferences node = root.node("com/chaptor10/zxm");

    public PreferencesFrame() throws BackingStoreException {
        System.out.println(root.name());
        System.out.println(root.absolutePath());
        System.out.println(node.name());
        System.out.println(node.absolutePath());
        System.out.println(Arrays.toString(root.keys()));
        System.out.println(root.get("JetBrains.UserIdOnMachine", "not value"));;

        int left = node.getInt("left", 0);
        int top = node.getInt("top", 0);
        int width = node.getInt("width", DEFAULT_WIDTH);
        int height = node.getInt("height", DEFAULT_HEIGHT);
        setBounds(left, top, width, height);

        String title = node.get("title", "");
        if (title.equals("")) {
            title = JOptionPane.showInputDialog("Please supply a frame title");
        }
        if (title == null) {
            title = "";
        }
        setTitle(title);

        final JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.setFileFilter(new FileNameExtensionFilter("XML files", "xml"));

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        JMenuItem exportItem = new JMenuItem("Export preferences");
        menu.add(exportItem);
        exportItem.addActionListener(e -> {
            if (chooser.showSaveDialog(PreferencesFrame.this) == JFileChooser.APPROVE_OPTION) {
                try {
                    savePreferences();
                    OutputStream out = new FileOutputStream(chooser.getSelectedFile());
                    node.exportSubtree(out);
                    out.close();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        JMenuItem importItem = new JMenuItem("Import preference");
        menu.add(importItem);
        importItem.addActionListener(e -> {
            if (chooser.showOpenDialog(PreferencesFrame.this) == JFileChooser.APPROVE_OPTION) {
                try {
                    InputStream in = new FileInputStream(chooser.getSelectedFile());
                    Preferences.importPreferences(in);
                    in.close();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(e -> {
            savePreferences();
            System.exit(0);
        });
    }

    public void savePreferences(){
        node.putInt("left", getX());
        node.putInt("top", getY());
        node.putInt("width", getWidth());
        node.putInt("height", getHeight());
        node.put("title", getTitle());

    }
}
