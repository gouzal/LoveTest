package com.gouzal.lovetest.ui.customui;

import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public final class IconSetter {

    private String iconPath;

    public IconSetter(String iconPath) {
        this.iconPath = iconPath;
    }

    public void setIcon(JComponent component) {
        try {
            Image img = ImageIO.read(new File(this.iconPath));
            if (component instanceof JButton) {
                ((JButton) component).setIcon(new ImageIcon(img));
            }
            if (component instanceof JLabel) {
                ((JLabel) component).setIcon(new ImageIcon(img));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Attention", JOptionPane.WARNING_MESSAGE);
        }
    }

}