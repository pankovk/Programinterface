package progInt.lab4;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private JLabel labelTop = new JLabel("Параметры камеры видео фиксации");

    private JLabel labelId = new JLabel("Идентификатор");
    private JTextField textId = new JTextField();
    private JCheckBox checkBox = new JCheckBox("Архивная");

    private JLabel labelName = new JLabel("Наименование");
    private JTextField textName = new JTextField();

    private JLabel labelClass = new JLabel("Класс");
    private JComboBox comboClass = new JComboBox();
    private JLabel labelModel = new JLabel("Модель", 10);
    private JTextField textModel = new JTextField();

    private JLabel labelNumber = new JLabel("Заводской номер");
    private JTextField textNumber = new JTextField();

    private JLabel labelType = new JLabel("Тип");
    private JComboBox comboType = new JComboBox();

    private JButton save = new JButton("Сохранить");
    private JButton cancel = new JButton("Отмена");

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
        panelCenter.add(createTextField(), "pushx, growx, w 200!");
        panelCenter.add(new JLabel(""));
        panelCenter.add(new JLabel(""));
        panelCenter.add(checkBox, "wrap, right");

        panelCenter.add(labelName, "al right, left");
        panelCenter.add(createTextField(), "wrap, pushx, growx, span");

        panelCenter.add(labelClass, "al right, left");
        panelCenter.add(comboClass, "pushx, growx, w 200!");
        panelCenter.add(new JLabel(""), "right, w 40!");
        panelCenter.add(labelModel, "right");
        panelCenter.add(createTextField(), "wrap, right, pushx, growx, w 70!");

        panelCenter.add(labelNumber, "al right, left");
        panelCenter.add(createTextField(), "wrap, pushx, growx, w 200!");

        panelCenter.add(labelType, "al right, left");
        panelCenter.add(comboType, "wrap, pushx, growx, w 200!");

        panelCenter.add(new JSeparator(), "wrap, w 500!, span");

        panelEnd.add(save, "right");
        panelEnd.add(cancel, "right");

        pack();
        setVisible(true);
    }

    private JTextField createTextField() {
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(1, 27));
        return textField;
    }

    public static void main(String args[]) {
        MyFrame frame = new MyFrame();
    }
}