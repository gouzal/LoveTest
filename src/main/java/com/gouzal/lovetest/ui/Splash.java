package com.gouzal.lovetest.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;

public class Splash extends JWindow implements Runnable {

    private static final long serialVersionUID = 1L;

    private JProgressBar progressBar;
    private Thread thread;

    public Splash() {
        Container container = this.getContentPane();
        container.setBackground(Color.RED);

        container.setLayout(new BorderLayout());

        container.add(new JLabel(new ImageIcon(this.getClass().getResource("").getPath()+"../../../../../../assets/splash.png")), "Center");
        this.progressBar = new JProgressBar(0, 100);
        this.progressBar.setMinimum(0);
        this.progressBar.setMaximum(100);
        this.progressBar.setValue(0);
        this.progressBar.setForeground(Color.PINK);

        container.add(this.progressBar, "South");

     
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

    @Override
    public void run() {
        for (int j = 1; j < 100; j += 5) {
            this.progressBar.setValue(j);
            try {
                this.thread.sleep(100L);
            } catch (Exception e) {
                System.out.println("thread: " + e.getMessage());
            }
        }
        dispose();
    }

}