package frame;

import javax.swing.*;

public class Frame extends JFrame {

    public Frame(){
        super("Sprawdzanie poprawnosci numerow");

        JPanel buttonPanel = new ButtonPanel();
        add(buttonPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
