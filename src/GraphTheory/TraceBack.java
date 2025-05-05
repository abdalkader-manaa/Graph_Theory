package GraphTheory;

import javax.swing.*;
import java.awt.*;

/**
 * @author Abdalkader_Manaa
 *
 */
public class TraceBack extends JFrame {

    public TraceBack(String[] data) {

        setTitle("TraceBack");
        setSize(412, 600);
        setResizable(false);
        setType(Type.UTILITY);
        setLocationRelativeTo(rootPane);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        for (String data1 : data) {
            addArrow(panel);
            addState(panel, data1);
        }
        add(new JScrollPane(panel));
    }

    private void addState(JPanel panel, String state) {

        JPanel statePanel = new JPanel();
        statePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        JLabel stateLabel = new JLabel(state, JLabel.CENTER);
        stateLabel.setOpaque(true);
        stateLabel.setBackground(new Color(166, 177, 225));
        stateLabel.setFont(new Font("Times New Roman", 0, 40));

        stateLabel.setPreferredSize(new Dimension(360, 50));
        stateLabel.setHorizontalAlignment(SwingConstants.CENTER);
        stateLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        statePanel.add(stateLabel);
        panel.add(statePanel);
    }

    private void addArrow(JPanel panel) {

        JPanel arrowPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setStroke(new BasicStroke(2));
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                int startX = getWidth() / 2;
                int startY = 5;
                int endX = getWidth() / 2;
                int endY = getHeight() - 10;

                g2d.drawLine(startX, startY, endX, endY);

                int arrowSize = 10;
                int[] xPoints = {endX - arrowSize, endX, endX + arrowSize};
                int[] yPoints = {endY - arrowSize, endY, endY - arrowSize};
                g2d.fillPolygon(xPoints, yPoints, 3);
            }
        };
        arrowPanel.setPreferredSize(new Dimension(0, 50));
        panel.add(arrowPanel);
    }

}
