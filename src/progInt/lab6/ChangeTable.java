package progInt.lab6;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;

public class ChangeTable implements TableModelListener {

    ArrayList<House> houses;
    JTable tbl;
    TableModel tblModel;

    public ChangeTable() throws ParseException {
        JFrame frm = new JFrame("Застройка");

        JPanel pnlTbl = new JPanel();
        JPanel pnlEdt = new JPanel();

        pnlTbl.setLayout(new BorderLayout());
        pnlEdt.setLayout(new FlowLayout());

        JTextField material = new JTextField(15);
        JTextField floorCount = new JTextField(4);
        JTextField developer = new JTextField(15);
        JTextField city = new JTextField(15);

        JTextField id = new JTextField(4);
        JTextField name = new JTextField(10);
        JTextField flatCount = new JTextField(7);
        JTextField date = new JTextField(10);

        JButton bAdd = new JButton("Добавить");
        JButton bClear = new JButton("Очистить");

        bAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    houses.add(new House(
                            material.getText(),
                            Integer.parseInt(floorCount.getText()),
                            developer.getText(),
                            city.getText(),
                            Integer.parseInt(id.getText()),
                            name.getText(),
                            Integer.parseInt(flatCount.getText()),
                            date.getText()));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                ((AbstractTableModel) tblModel).fireTableDataChanged();
                tbl.updateUI();
            }
        });

        bClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                material.setText("");
                floorCount.setText("");
                developer.setText("");
                city.setText("");
                id.setText("");
                name.setText("");
                flatCount.setText("");
                date.setText("");
            }
        });

        frm.setLayout(new BorderLayout());
        frm.setSize(800, 250);
        frm.setLocation(300, 300);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        House[] house = new House[5];

        house[0] = new House("Железобетон", 12, "Энергострой", "Москва", 12, "Дом 12", 250, "2021.15.04");
        house[1] = new House("Железобетон", 15, "Энергострой", "Омск", 11, "Дом 11", 150, "2016.15.04");
        house[2] = new House("Железобетон", 9, "Жилстрой", "Москва", 10, "Дом 10", 210, "2015.15.04");
        house[3] = new House("Кирпич", 2, "Дом под Ключ", "Тверь", 121, "Дом 121", 1, "2010.15.04");
        house[4] = new House("Железобетон", 16, "ИмиджСтрой", "Москва", 3, "Дом 3", 270, "2010.15.04");

        houses = new ArrayList<House>(Arrays.asList(house));

        tblModel = new HouseTableModel(houses);
        tblModel.addTableModelListener(this);

        tbl = new JTable(tblModel);

        RowSorter<HouseTableModel> sorter = new TableRowSorter<HouseTableModel>((HouseTableModel) tblModel);
        tbl.setRowSorter((RowSorter<? extends TableModel>) sorter);

        JScrollPane scroll = new JScrollPane(tbl);
        tbl.setPreferredScrollableViewportSize(new Dimension(800, 100));

        pnlTbl.add(scroll);

        pnlEdt.add(material);
        pnlEdt.add(floorCount);
        pnlEdt.add(developer);
        pnlEdt.add(city);
        pnlEdt.add(id);
        pnlEdt.add(name);
        pnlEdt.add(flatCount);
        pnlEdt.add(date);
        pnlEdt.add(bAdd);
        pnlEdt.add(bClear);

        frm.getContentPane().add(pnlTbl, BorderLayout.CENTER);
        frm.getContentPane().add(pnlEdt, BorderLayout.SOUTH);
        frm.pack();
        frm.setVisible(true);

        tbl.setDefaultRenderer(Object.class, new StrRenderer());
        tbl.setDefaultRenderer(Integer.class, new IntRenderer());
    }

    @Override
    public void tableChanged(TableModelEvent e) {
        System.out.println("Data has changed");
        int row = e.getFirstRow();
        int column = e.getColumn();

        TableModel model = (TableModel) e.getSource();

        String columnName = model.getColumnName(column);
        Object data = model.getValueAt(row, column);
    }

    public static void main(String args[]) {
        try {
            new ChangeTable();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
