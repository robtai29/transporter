package com.tlglearning.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame {
    private GamePanel panel;
    private JTextArea consoleDisplay;
    private JTextField inputArea;
    public GameFrame(){
        init();
    }

    public void init(){
        setTitle("Trucker Game MVP");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(new Dimension(1200, 700));
        setLocationRelativeTo(null);
        panel = new GamePanel();


        panel.setBackground(Color.LIGHT_GRAY);
        consoleDisplay = new JTextArea(20, 60);
        consoleDisplay.setBackground(Color.GRAY);
        consoleDisplay.setEditable(false);
        consoleDisplay.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        inputArea = new JTextField(50);
        inputArea.setBackground(Color.CYAN);
        inputArea.setForeground(Color.RED);
        panel.add(consoleDisplay);
        panel.add(inputArea);
        add(panel);
        setVisible(true);


        inputArea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consoleDisplay.append(inputArea.getText());
            }
        });

    }

    public void appendToGUI(String text){
        consoleDisplay.append(text);
    }


}
