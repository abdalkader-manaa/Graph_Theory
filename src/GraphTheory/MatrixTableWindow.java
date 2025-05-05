package GraphTheory;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

/**
 * @author Abdalkader_Manaa
 *
 */
public class MatrixTableWindow extends JFrame {

    public MatrixTableWindow(String[][] matrix) {
        setTitle("Neighbor Matrix");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setType(Type.UTILITY);

        int cellSize = 50;
        setSize(matrix[0].length * cellSize + 25, matrix.length * cellSize + 30);
        setLocationRelativeTo(null);

        Object[][] data = new Object[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            data[i] = matrix[i].clone();
        }
        String[] columns = new String[matrix[0].length];
        JTable table = new JTable(new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        });

        table.setTableHeader(null);
        table.setFillsViewportHeight(true);
        table.setRowHeight(cellSize);
        table.setGridColor(Color.LIGHT_GRAY);
        table.setShowGrid(true);

        table.setRowHeight(0, 40);
        for (int i = 0; i <= 0; i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(40);
            table.getColumnModel().getColumn(i).setMaxWidth(40);
            table.getColumnModel().getColumn(i).setMinWidth(40);
        }

        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable tbl, Object val, boolean sel, boolean foc, int row, int col) {
                Component c = super.getTableCellRendererComponent(tbl, val, sel, foc, row, col);
                setHorizontalAlignment(SwingConstants.CENTER);
                boolean header = (row == 0 || col == 0);
                c.setForeground(new Color(header ? 30 : 60, 30, 30));
                c.setFont(new Font("Times New Roman", Font.BOLD, 26));
                c.setBackground(header ? new Color(166, 177, 225) : new Color(224, 218, 255));
                setBorder(BorderFactory.createLineBorder(Color.GRAY));
                return c;
            }
        });

        add(new JScrollPane(table), BorderLayout.CENTER);
        setVisible(true);
    }
}
