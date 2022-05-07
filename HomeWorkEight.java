/**
* Java 1. Homework 8
*
* @ author Elena Zavarzina
* @ version 05.05.2022
*/



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWorkEight extends JFrame {
    private int counter;
    
    public HomeWorkEight(int initialCounter) {
        setTitle("Простой счетчик");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 300, 150);
        Font font = new Font("Arrial", Font.BOLD, 40);
        
        JButton leftButton = new JButton("<");
        leftButton.setFont(font);
        add(leftButton, BorderLayout.WEST);
        
        JButton rightButton = new JButton(">");
        rightButton.setFont(font);
        add(rightButton, BorderLayout.EAST); 
        
        JLabel counterText = new JLabel();
        counterText.setFont(font);
        add(counterText, BorderLayout.CENTER);
        counterText.setHorizontalAlignment(SwingConstants.CENTER);
        
        counter = initialCounter; 
        counterText.setText(String.valueOf(counter));
        
        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                counter--;
                counterText.setText(String.valueOf(counter));
            }
        });
        
        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                counter++;
                counterText.setText(String.valueOf(counter));
            }
        });
        
        setVisible(true);
    }
    
    public static void main(String[] arg) {
        new HomeWorkEight(0);
    }   
}

