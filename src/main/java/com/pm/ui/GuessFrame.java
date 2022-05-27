package com.pm.ui;

import javax.swing.*;

public class GuessFrame extends JFrame {
    //Fields

    //Constructors
    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button = new JButton("Hi");


        setVisible(true);
    }
    //Methods

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
        /* guessFrame.setSize(600,400);
        guessFrame.setVisible(true); */
    }

}
