package com.gouzal.lovetest.ui.customui;

import javax.swing.JLabel;

public class MyJLabel extends JLabel {

    private static final long serialVersionUID = 1L;

    private IconSetter iconSetter;

    /**
     * @param iconSetter
     */
    public MyJLabel(IconSetter iconSetter) {
        this.iconSetter = iconSetter;
        this.iconSetter.setIcon(this);
    }

}