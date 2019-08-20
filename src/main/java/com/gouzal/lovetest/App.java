package com.gouzal.lovetest;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import com.gouzal.lovetest.ui.Calculator;

public final class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     * @throws UnsupportedLookAndFeelException
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } finally {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
            calculator.pack();
            calculator.setTitle("Love Tester v1.0");
            calculator.setResizable(false);
            calculator.setLocationRelativeTo(null);
            calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    }
}
