package progInt.lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    private JTextField textNorth = new JTextField("");
    private JTextField textSouth = new JTextField("");
    private JTextField textWest = new JTextField("", 10);
    private JTextField textEast = new JTextField("", 10);
    private JButton replace = new JButton("Переместить");

    MyFrame() {
        super("Лабораторная работа №3");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 250);
        setLocation(300, 300);
        JPanel panel = new JPanel();


        add(panel);
        panel.setLayout(new BorderLayout());

        panel.add(textNorth, BorderLayout.NORTH);
        panel.add(textSouth, BorderLayout.SOUTH);
        panel.add(textEast, BorderLayout.EAST);
        panel.add(textWest, BorderLayout.WEST);

        panel.add(replace, BorderLayout.CENTER);

        replace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textNorth.getText().length() > 0) {
                    textEast.setText(textNorth.getText());
                    textNorth.setText("");
                } else if (textEast.getText().length() > 0) {
                    textSouth.setText(textEast.getText());
                    textEast.setText("");
                } else if (textSouth.getText().length() > 0) {
                    textWest.setText(textSouth.getText());
                    textSouth.setText("");
                } else if (textWest.getText().length() > 0) {
                    textNorth.setText(textWest.getText());
                    textWest.setText("");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String args[]) {
        new MyFrame();
    }
}