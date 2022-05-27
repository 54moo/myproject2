package com.pm.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class GuessFrame extends JFrame {
    //Fields
    JButton button = new JButton("GO");
    JLabel label = new JLabel("Guess number 1-10");
    JTextField number = new JTextField(10);

    Random random = new Random();
    int secret = random.nextInt(10)+1;

    //Constructors
    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        System.out.println("secret number: " + secret);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Hello");
                //label.setText("Hello!!");
                int num = Integer.parseInt(number.getText());
                System.out.println(num);

                if (num>secret){
                    label.setText("Smaller");
                }else if (num<secret){
                    label.setText("Bigger");
                }else{
                    label.setText("Bingo!!" + "The secret number is: " + secret);
                }

                System.out.println(secret);
            }
        });

        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);
    }

    //Methods
    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
        /* guessFrame.setSize(600,400);
        guessFrame.setVisible(true); */
    }

}
