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
    
   private void plotLineLow(int x0, int y0, int x1, int y1, Color rgb){
        int dx = x1-x0;
        int dy = y1-y0;
        int yi = 1;
        if (dy<0){
            yi = -1;
            dy = -dy;
        }
        int d = 2*dy-dx;
        int y = y0;
        for (int x = x0; x < x1; x++) {
            desenharPixel(x, y, rgb);
            if (d>0){
                y = y + yi;
                d = d-2*dx;
            }
            d = d + 2*dy;
        }
    }
    
   private void plotLineHigh(int x0, int y0, int x1, int y1, Color rgb){
        int dx = x1-x0;
        int dy = y1-y0;
        int xi = 1;
        if (dx<0){
            xi = -1;
            dx = -dx;
        }
        int d = 2*dx-dy;
        int x = x0;
        for (int y = y0; y < y1; y++) {
            desenharPixel(x, y, rgb);
            if (d>0){
                x = x + xi;
                d = d-2*dy;
            }
            d = d + 2*dx;
        }
    }    
    
   public void desenharSegmentoRetaBresenham(int x0, int y0, int x1, int y1, Color rgb){
        if (Math.abs(y1-y0) <Math.abs(x1-x0)){
            if(x0>x1){
                plotLineLow(x1, y1, x0, y0,rgb);
            }else{
                plotLineLow(x0, y0, x1, y1,rgb);
            }
        }else{
            if(y0>y1){
                plotLineHigh(x1, y1, x0, y0,rgb);
            }else{
                plotLineHigh(x0, y0, x1, y1,rgb);
            }
        }   
    }
    
   public void circlePoints(int x, int y, Color rgb) {
       
       // deslocar o centro de massa para o centro do JPanel
       int cx = this.getWidth() / 2;
       int cy = this.getWidth() / 2;
       
       desenharPixel(x+cx, y+cy, rgb);
       desenharPixel(x+cx, -y+cy, rgb);
       desenharPixel(-x+cx, y+cy, rgb);
       desenharPixel(-x+cx, -y+cy, rgb);
       desenharPixel(y+cx, x+cy, rgb);
       desenharPixel(y+cx, -x+cy, rgb);
       desenharPixel(-y+cx, x+cy, rgb);
       desenharPixel(-y+cx, -x+cy, rgb);
   }
    
    public void desenharCircunferencia(int raio, Color rgb) {
        int x = 0;
        int y = raio;
        int d = 1 - raio;
        
        circlePoints(x, y, rgb);

        while (y > x) {
            if (d < 0) {
                // seleciona E
                d = d + 2 * x + 3;
                x++;
            } else {
                // seleciona SE
                d = d + 2 * (x - y) + 5;
                x++;
                y--;
            }
            circlePoints(x, y, rgb);
        }
     }
}
