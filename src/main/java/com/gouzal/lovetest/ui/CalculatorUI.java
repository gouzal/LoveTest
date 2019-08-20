package com.gouzal.lovetest.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import com.gouzal.lovetest.logic.Calculator;
import com.gouzal.lovetest.ui.customui.IconSetter;
import com.gouzal.lovetest.ui.customui.MyJButton;
import com.gouzal.lovetest.ui.customui.MyJLabel;
import com.gouzal.lovetest.ui.customui.MyJTextField;

public class CalculatorUI extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private MyJButton bCalculate;
    private MyJButton bExit;
    private MyJButton bClean;

    private JLabel hLabel;
    private JLabel fLabel;
    private JLabel loveLabel;

    private MyJTextField tBoyName;
    private MyJTextField tGirlName;

    private JPanel intialPanel;
    private JPanel firstPanel;
    private JPanel secondPanel;
    private JPanel thirdPanel;

    private JProgressBar bar;

    public CalculatorUI() {
        this.init();

    }

    private void init() {
        this.setIconImage(new ImageIcon(this.getIconPath("icons8-love-50.png")).getImage());
        this.initButtons();
        this.initLabels();
        this.initProgressBar();
        this.initTextFields();
        this.initPanels();
        this.setLayouts();
        this.addComponentsToPanels();
        this.getContentPane().add(this.intialPanel);

    }

    /**
     * 
     * @param iconName
     * @return String image Pth
     */
    private String getIconPath(String iconName) {
        return getClass().getResource("").getPath() + "img/icon8/" + iconName;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.bClean)) {
            this.tGirlName.setText(null);
            this.tBoyName.setText(null);
        }
        if (e.getSource().equals(this.bExit)) {
            System.exit(0);
        }
        if (e.getSource().equals(this.bCalculate)) {
            String firstName = this.tGirlName.getText();
            String secondName = this.tBoyName.getText();
            Calculator calculator = new Calculator(firstName, secondName);
            int loveResult = calculator.getLoveResult();
            this.bar.setValue(loveResult);
        }
    }

    private void initButtons() {
        this.bCalculate = new MyJButton(new IconSetter(this.getIconPath("icons8-love-50.png")));
        this.bExit = new MyJButton(new IconSetter(this.getIconPath("icons8-exit-50.png")));
        this.bClean = new MyJButton(new IconSetter(this.getIconPath("icons8-trash-50.png")));

        this.bCalculate.addActionListener(this);
        this.bExit.addActionListener(this);
        this.bClean.addActionListener(this);
    }

    private void initLabels() {
        this.hLabel = new MyJLabel(new IconSetter(this.getIconPath("icons8-boy-50.png")));
        this.fLabel = new MyJLabel(new IconSetter(this.getIconPath("icons8-girl-50.png")));
        this.loveLabel = new MyJLabel(new IconSetter(this.getIconPath("icons8-love-50.png")));
    }

    private void initProgressBar() {
        this.bar = new JProgressBar();
        this.bar.setPreferredSize(new Dimension(600, 55));
        this.bar.setValue(50);
        this.bar.setStringPainted(true);
        this.bar.setForeground(Color.BLACK);
    }

    private void initTextFields() {
        this.tBoyName = new MyJTextField();
        this.tGirlName = new MyJTextField();
    }

    private void addComponentsToPanels() {
        this.intialPanel.add(this.firstPanel);
        this.intialPanel.add(this.secondPanel);
        this.intialPanel.add(this.thirdPanel);

        this.firstPanel.add(this.fLabel);
        this.firstPanel.add(this.tGirlName);
        this.firstPanel.add(this.loveLabel);
        this.firstPanel.add(this.tBoyName);
        this.firstPanel.add(this.hLabel);

        this.secondPanel.add(bar);

        this.thirdPanel.add(bClean);
        this.thirdPanel.add(bCalculate);
        this.thirdPanel.add(bExit);
    }

    private void initPanels() {
        this.intialPanel = new JPanel();
        this.firstPanel = new JPanel();
        this.secondPanel = new JPanel();
        this.thirdPanel = new JPanel();
    }

    private void setLayouts() {
        this.intialPanel.setLayout(new GridLayout(3, 1));
        this.firstPanel.setLayout(new FlowLayout());
        this.secondPanel.setLayout(new FlowLayout(0, 0, 0));
        this.thirdPanel.setLayout(new FlowLayout());
    }
}