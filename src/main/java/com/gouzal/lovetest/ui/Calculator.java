package com.gouzal.lovetest.ui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JButton bCalculate;
    private JButton bExite;
    private JButton bClean;

    private JPanel intialPanel;
    private JPanel firstPanel;
    private JPanel secondPanel;
    private JPanel thirdPanel;

    public Calculator() {
        this.init();

    }

    private void init() {
        this.bCalculate = new JButton();
        this.bExite = new JButton();
        this.bClean = new JButton();

        this.intialPanel = new JPanel();
        this.firstPanel = new JPanel();
        this.secondPanel = new JPanel();
        this.thirdPanel = new JPanel();

        this.intialPanel.setLayout(new GridLayout(3, 1));
        this.firstPanel.setLayout(new FlowLayout());
        this.secondPanel.setLayout(new FlowLayout());
        this.thirdPanel.setLayout(new FlowLayout());

        this.intialPanel.add(this.firstPanel);
        this.intialPanel.add(this.secondPanel);
        this.intialPanel.add(this.thirdPanel);

        this.thirdPanel.add(bClean);
        this.thirdPanel.add(bCalculate);
        this.thirdPanel.add(bExite);

        this.getContentPane().add(this.intialPanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}