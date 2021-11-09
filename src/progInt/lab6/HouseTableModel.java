package progInt.lab6;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class HouseTableModel extends AbstractTableModel {
    ArrayList<House> houses;

    HouseTableModel(ArrayList<House> houses) {
        super();
        this.houses = houses;
    }

    @Override
    public int getRowCount() {
        return houses.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public String getColumnName(int column) {

        String result = "";

        switch (column) {
            case 0:
                result = "Материал";
                break;
            case 1:
                result = "Количество этажей";
                break;
            case 2:
                result = "Застройщик";
                break;
            case 3:
                result = "Город";
                break;
            case 4:
                result = "Код";
                break;
            case 5:
                result = "Наименование";
                break;
            case 6:
                result = "Кол-во квартир";
                break;
            case 7:
                result = "Дата заселения";
                break;
        }
        return result;
    }

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }


    @Override
    public Object getValueAt(int r, int c) {

        switch (c) {
            case 0:
                return houses.get(r).getMaterial();
            case 1:
                return houses.get(r).getFloorCount();
            case 2:
                return houses.get(r).getDeveloper();
            case 3:
                return houses.get(r).getCity();
            case 4:
                return houses.get(r).getId();
            case 5:
                return houses.get(r).getName();
            case 6:
                return houses.get(r).getFlatCount();
            case 7:
                return houses.get(r).getDate();
            default:
                return "";
        }
    }
}