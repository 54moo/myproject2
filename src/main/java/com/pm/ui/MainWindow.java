package com.pm.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainWindow {
    public static void main(String[] args) {
        //Graphical User Interface (GUI)
        //swing, JavaFX
        //extension
        JFrame frame = new JFrame();
        frame.setSize(400,300);
        frame.setLocation(200,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton button = new JButton("OK");
        //???? Anonymous class

        //MyActionListener listener = new MyActionListener();
        //button.addActionListener(listener);

         button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hello!");
            }
        });

        frame.setLayout(new FlowLayout());
        //frame.setLayout(new BorderLayout()); //???
        frame.add(button);

        //Layout
        frame.setVisible(true);
        System.out.println("END?");
    }
}
