package com.gouzal.lovetest.ui.customui;

import javax.swing.JButton;

public class MyJButton extends JButton {

    private static final long serialVersionUID = 1L;
    private IconSetter iconSetter;

    public MyJButton() {
        // this.setBorder(null);
    }

    public MyJButton(IconSetter iconSetter) {
        this.iconSetter = iconSetter;
        this.iconSetter.setIcon(this);

        // this.setOpaque(false);
        // this.setFocusPainted(false);
        // this.setBorderPainted(false);
        // this.setContentAreaFilled(false);
        // this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }

    public void setIconSetter(IconSetter iconSetter) {

    }

    public void setIcon(String iconPath) {
        this.iconSetter.setIcon(this);
    }

}