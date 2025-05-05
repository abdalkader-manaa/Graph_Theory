package GraphTheory;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * @author Abdalkader_Manaa
 *
 */
public class ImageBackgroundPanel extends JPanel {

    private Image image;
    private float opacity;

    public ImageBackgroundPanel(String image, float opacity) {
        try {
            this.image = ImageIO.read(getClass().getResource(image));
            setOpaque(false);
            this.opacity = opacity;
        } catch (IOException e) {
        }
    }

    public void setBackgroundImage(String imagePath) {
        try {
            image = ImageIO.read(new File(imagePath));
            repaint();
        } catch (IOException e) {
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));
        g2d.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        g2d.dispose();

    }
}
