package com.gouzal.lovetest;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import com.gouzal.lovetest.ui.CalculatorUI;

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
        }

        CalculatorUI calculatorUI = new CalculatorUI();
        calculatorUI.setVisible(true);
        calculatorUI.pack();
        calculatorUI.setTitle("Love Tester v1.0");
        calculatorUI.setResizable(false);
        calculatorUI.setLocationRelativeTo(null);
        calculatorUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
