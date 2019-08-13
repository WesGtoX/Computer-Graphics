package primitivas;

import util.JPanelGraphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;

/**
 *
 * @author wesley
 */
public class Primitivas extends JPanelGraphics {

    public Primitivas(Dimension d) {
        super(d);
    }

    public void desenharPixel(int x, int y, Color rgb) {
        Graphics2D g = (Graphics2D) image.getGraphics();
        g.setColor(rgb);
        g.drawLine(x, y, x, y);
        repaint();
    }
    
    public void desenharSegmentoReta(int x1, int y1, int x2, int y2, Color rgb) {
        Graphics2D g = (Graphics2D) image.getGraphics();
        g.setColor(rgb);
        g.drawLine(x1, y1, x2, y2);
        repaint();
    }
    
    public void limpar() {
        Graphics2D g = (Graphics2D) image.getGraphics();
        g.setColor(Color.white);
        g.fillRect(1, 1, image.getWidth()-2, image.getHeight()-2);
        repaint();
    }
}
