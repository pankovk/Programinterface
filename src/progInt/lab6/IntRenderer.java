package progInt.lab6;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class IntRenderer extends DefaultTableCellRenderer {

    IntRenderer() {
        setHorizontalAlignment(SwingConstants.CENTER);
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        if (value == null)
            return this;

        Component renderer = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        Integer mn = (Integer) value;
        renderer.setBackground((mn < 250) ? Color.WHITE : Color.YELLOW);

        return renderer;
    }
}
