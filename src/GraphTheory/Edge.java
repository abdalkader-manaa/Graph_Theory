package GraphTheory;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 * @author Abdalkader_Manaa
 *
 */
public class Edge extends JComponent {

    public Node node1, node2;
    public boolean isSelected = false;

    private int x1Edge, y1Edge, x2Edge, y2Edge;
    public static Color changeColor;
    private final Color colorEdge;
    private Color tempColorEdge;
    public static Color selectedColorEdge = Color.RED;
    private final int RADIUS = 20;

    public Edge(Node node1, Node node2) {
        super();
        this.node1 = node1;
        this.node2 = node2;
        this.x1Edge = node1.xNode;
        this.y1Edge = node1.yNode;
        this.x2Edge = node2.xNode;
        this.y2Edge = node2.yNode;
        int width = Math.abs(x1Edge - x2Edge);
        int height = Math.abs(y1Edge - y2Edge);
        super.setSize(width + RADIUS, height + RADIUS);
        fixCoordinates(width, height);
        colorEdge = tempColorEdge = changeColor == null ? Color.BLACK : changeColor;

        addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                toggleSelection();
            }
        });
    }

    @Override
    public void paint(Graphics graphics) {

        int dx = x2Edge - x1Edge;
        int dy = y2Edge - y1Edge;
        double length = Math.sqrt(dx * dx + dy * dy);

        // Calculate offset for the line ends
        int offsetX = (int) (dx / length) * (-RADIUS / 2);
        int offsetY = (int) (dy / length) * (-RADIUS / 2);

        // Calculate the end points
        int startX = x1Edge + RADIUS - 2 + offsetX;
        int startY = y1Edge + RADIUS - 2 + offsetY;
        int endX = x2Edge + RADIUS - 2 - offsetX;
        int endY = y2Edge + RADIUS - 2 - offsetY;

        graphics.setColor(tempColorEdge);
        graphics.drawLine(startX, startY, endX, endY);
    }

    private void toggleSelection() {

        tempColorEdge = isSelected ? colorEdge : selectedColorEdge;
        isSelected = !isSelected;
        repaint();

    }

    public void unSelected() {
        tempColorEdge = colorEdge;
        isSelected = false;
        repaint();
    }

    private void fixCoordinates(int X, int Y) {

        x1Edge = x1Edge > x2Edge ? X : 0;
        y1Edge = y1Edge > y2Edge ? Y : 0;
        x2Edge = x1Edge == 0 ? X : 1;
        y2Edge = y1Edge == 0 ? Y : 1;
    }

}
