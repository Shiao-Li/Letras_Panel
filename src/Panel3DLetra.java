import javax.swing.*;
import java.awt.*;

public class Panel3DLetra extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int [] puntosX = {80,80,110,110,150,180,140,180,180,80};
        int [] puntosY = {60,220,220,140,220,220,140,140,60,60};
        int [] puntosX1 = {120,120,140,140,120};
        int [] puntosY2 = {80,120,120,80,80};

        g.drawPolygon(puntosX,puntosY,10);
        g.drawPolygon(puntosX1,puntosY2, 5);

    }
}
