package com.gouzal.lovetest;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import com.gouzal.lovetest.ui.CalculatorUI;
import com.gouzal.lovetest.ui.Splash;

public final class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     * @throws UnsupportedLookAndFeelException
     */
    public static void main(String[] args) {
        setLookAndFeel();
        displaySplash();

        CalculatorUI calculatorUI = new CalculatorUI();
        setInitialUIProperties(calculatorUI);
    }

    public static void displaySplash() {
        Splash splash = new Splash();
        Thread thread = new Thread(splash);
        thread.start();
        while (thread.isAlive()) {

        }
    }

    public static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }

    public static void setInitialUIProperties(JFrame frame) {
        frame.setVisible(true);
        frame.pack();
        frame.setTitle("Love Tester v1.0");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
