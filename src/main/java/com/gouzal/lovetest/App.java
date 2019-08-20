package com.gouzal.lovetest;

import com.gouzal.lovetest.ui.Calculator;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Calculator calculator=new Calculator();
        calculator.setVisible(true);
        calculator.pack();
        calculator.setLocationRelativeTo(null);
    }
}
