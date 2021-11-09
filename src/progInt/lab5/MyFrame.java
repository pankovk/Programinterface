package progInt.lab5;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame {
    private JLabel labelTop = new JLabel("Параметры камеры видео фиксации");

    private JLabel labelId = new JLabel("Идентификатор");
    private JTextField textId = new JTextField();
    private JCheckBox checkBox = new JCheckBox("Архивная");

    private JLabel labelName = new JLabel("Наименование");
    private JTextField textName = new JTextField();

    private JLabel labelClass = new JLabel("Класс");
    private String[] list = {
            "",
            "1",
            "2",
            "3"
    };
    private JComboBox comboClass = new JComboBox(list);
    private JLabel labelModel = new JLabel("Модель", 10);
    private JTextField textModel = new JTextField();

    private JLabel labelNumber = new JLabel("Заводской номер");
    private JTextField textNumber = new JTextField();

    private JLabel labelType = new JLabel("Тип");
    private JComboBox comboType = new JComboBox();

    private JButton save = new JButton("Сохранить");
    private JButton cancel = new JButton("Отменить");

    private JPanel panelStart = new JPanel();
    private JPanel panelCenter = new JPanel();
    private JPanel panelEnd = new JPanel();

    public MyFrame() {
        super("Лабораторная работа №4");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(300, 300);

        setLayout(new MigLayout());
        setSize(600, 700);
        add(panelStart, "wrap, center");
        add(panelCenter, "wrap, pushx, growx");
        add(panelEnd, "wrap, right");

        panelStart.add(labelTop);

        panelCenter.setLayout(new MigLayout());

        panelCenter.add(new JSeparator(), "wrap, span");
        panelCenter.add(new JSeparator(), "wrap, w 500!, span");
        panelCenter.add(labelId, "al right, left");
        panelCenter.add(textId, "pushx, growx, w 200!, h 25!");
        panelCenter.add(new JLabel(""));
        panelCenter.add(new JLabel(""));
        panelCenter.add(checkBox, "wrap, right");

        panelCenter.add(labelName, "al right, left");
        panelCenter.add(textName, "wrap, pushx, growx, span, h 25!");

        panelCenter.add(labelClass, "al right, left");
        panelCenter.add(comboClass, "pushx, growx, w 200!");
        panelCenter.add(new JLabel(""), "right, w 40!");
        panelCenter.add(labelModel, "right");
        panelCenter.add(textModel, "wrap, right, pushx, growx, w 70!, h 25!");

        panelCenter.add(labelNumber, "al right, left");
        panelCenter.add(textNumber, "wrap, pushx, growx, w 200!, h 25!");

        panelCenter.add(labelType, "al right, left");
        panelCenter.add(comboType, "wrap, pushx, growx, w 200!");

        panelCenter.add(new JSeparator(), "wrap, w 500!, span");

        panelEnd.add(save, "right");
        panelEnd.add(cancel, "right");

        comboClass.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                comboClass.setSelectedItem(2);
                if (comboClass.getSelectedItem().equals(""))
                    textNumber.setText("");

                if (comboClass.getSelectedItem().equals("1"))
                    textNumber.setText("N-");

                if (comboClass.getSelectedItem().equals("2"))
                    textNumber.setText("ML-");

                if (comboClass.getSelectedItem().equals("3"))
                    textNumber.setText("AP-");

            }
        });

        textId.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textId.setBackground(Color.yellow);
            }

            @Override
            public void focusLost(FocusEvent e) {
                textId.setBackground(Color.WHITE);
            }
        });

        textName.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textName.setBackground(Color.yellow);
            }

            @Override
            public void focusLost(FocusEvent e) {
                textName.setBackground(Color.WHITE);
            }
        });

        textModel.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textModel.setBackground(Color.yellow);
            }

            @Override
            public void focusLost(FocusEvent e) {
                textModel.setBackground(Color.WHITE);
            }
        });

        textNumber.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textNumber.setBackground(Color.yellow);
            }

            @Override
            public void focusLost(FocusEvent e) {
                textNumber.setBackground(Color.WHITE);
            }
        });

        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(cancel,
                        "Вы уверенны? Вся информация будет утерянна");
            }
        });

        pack();
        setVisible(true);
    }

    public static void main(String args[]) {
        new MyFrame();
    }
}