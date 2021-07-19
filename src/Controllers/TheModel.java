package Controllers;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

public class TheModel extends AbstractTableModel {

    private String[] col;
    private Object[][] row;

    public TheModel() {

    }

    public TheModel(Object[][] row, String[] col) {
        this.row = row;
        this.col = col;
    }

    public Class getColumn(int col) {
        if (col == 2) {
            return Icon.class;
        } else {
            return getValueAt(0, col).getClass();
        }
    }

    @Override
    public int getRowCount() {
        return this.row.length;
    }

    @Override
    public int getColumnCount() {
        return this.col.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int colIndex) {
        return this.row[rowIndex][colIndex];
    }

    @Override
    public String getColumnName(int col) {
        return this.col[col];
    }
}
