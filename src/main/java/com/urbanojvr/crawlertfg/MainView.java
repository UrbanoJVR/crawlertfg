package com.urbanojvr.crawlertfg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView {
    private JPanel contentPane;
    private JButton startButton;

    public MainView() {
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello ");
            }
        });
    }

    public static void main(String[] args){
        setLookAndFeel();
        JFrame mainFrame = new JFrame("JSOUP CRAWLER");
        mainFrame.setContentPane(new MainView().contentPane);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1280, 720);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

    public static void setLookAndFeel(){
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        }
        catch (UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error loading L&F", JOptionPane.ERROR_MESSAGE);
        }
        catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error loading L&F", JOptionPane.ERROR_MESSAGE);
        }
        catch (InstantiationException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error loading L&F", JOptionPane.ERROR_MESSAGE);
        }
        catch (IllegalAccessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error loading L&F", JOptionPane.ERROR_MESSAGE);
        }
    }
}
