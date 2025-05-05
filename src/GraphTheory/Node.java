package GraphTheory;

import java.awt.Font;
import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 * @author Abdalkader_Manaa
 *
 */
public class Node extends JComponent {

    public int xNode;
    public int yNode;
    public int indexNode;
    public boolean isSelected;

    public static Color changeColor;
    private Color tempColorNode;
    private final Color colorNode;
    public static Color selectedColorNode = Color.RED;

    public static Color changeColorNumber;
    private Color tempColorNumber;
    private final Color colorNumber;
    public static Color selectedColorNumber = Color.WHITE;

    private final int sizeNode = 40;

    public Node(int xNode, int yNode, int indexNode) {

        super();
        this.xNode = xNode;
        this.yNode = yNode;
        this.indexNode = indexNode;
        isSelected = false;
        colorNode = tempColorNode = changeColor == null ? randomColor() : changeColor;
        colorNumber = tempColorNumber = changeColorNumber == null ? Color.BLACK : changeColorNumber;
        super.setSize(sizeNode, sizeNode);

        addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                toggleSelection();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(tempColorNode);
        g.fillOval(0, 0, sizeNode, sizeNode);
        g.setColor(tempColorNumber);
        g.setFont(new Font("Times New Roman", 0, (int) (sizeNode * .4)));
        g.drawString(indexNode + "", (int) (sizeNode / 2 - (indexNode + "").length() * sizeNode * .1), (int) (sizeNode * .65));
    }

    private Color randomColor() {

        return new Color(
                new Random().nextInt(120) + 120,
                new Random().nextInt(120) + 120,
                new Random().nextInt(120) + 120);

    }

    private void toggleSelection() {

        tempColorNode = isSelected ? colorNode : selectedColorNode;
        tempColorNumber = isSelected ? colorNumber : selectedColorNumber;
        isSelected = !isSelected;
        repaint();

    }

    public void unSelected() {
        tempColorNode = colorNode;
        tempColorNumber = colorNumber;
        isSelected = false;
        repaint();
    }

}
