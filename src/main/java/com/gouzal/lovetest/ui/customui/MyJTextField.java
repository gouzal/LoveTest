package com.gouzal.lovetest.ui.customui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;

public class MyJTextField extends JTextField {

    private static final long serialVersionUID = 1L;

    public MyJTextField() {
        this.setPreferredSize(new Dimension(200, 55));
        this.setFont(new Font("Courier New", Font.BOLD, 24));
        this.setForeground(Color.GRAY);
    }

}