package frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel implements ActionListener {

    private static final int HEIGHT = 64;
    private static final int WIDTH = 512;
    private JButton checkButton;
    private JButton exitButton;
    private JTextField numberField;
    private JLabel nLabel;
    private JLabel correctness;
    private String text = "";

    ButtonPanel() {
        //set buttons and fields
        checkButton = new JButton("Sprawdz");
        exitButton = new JButton("Wyjdz");
        numberField = new JTextField();
        nLabel = new JLabel("Numer: ");
        correctness = new JLabel();

        //set listeners
        checkButton.addActionListener(this);
        exitButton.addActionListener(this);
        numberField.addActionListener(this);

        //set layout
        setLayout(new GridLayout(2, 2));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(nLabel);
        add(numberField);
        add(correctness);
        add(checkButton);
        add(exitButton);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == checkButton) {
            Validator validator = new Validator(text);
            if (validator.check()) {
                correctness.setText(validator.getNumberType() + " poprawny");
            } else {
                correctness.setText(validator.getNumberType() + " niepoprawny");
            }

        } else if (source == exitButton) {
            System.exit(0);

        } else if (source == numberField) {
            text = numberField.getText();
        }
    }
}
