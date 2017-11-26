
package proyecto;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

public class fondo implements Border{
    public BufferedImage Imag;
 
    public fondo(){
        try {
            URL imagePath = new URL(getClass().getResource("../Imagenes/Feather.png").toString());
            Imag = ImageIO.read(imagePath);
        } catch (Exception ex) {            
        }
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(Imag, (x + (width - Imag.getWidth())/2),(y + (height - Imag.getHeight())/2), null);
    }
 
    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }
 
    public boolean isBorderOpaque() {
        return false;
    }
 
}
