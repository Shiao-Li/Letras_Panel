import javax.swing.*;
import java.awt.*;

public class PanelDibujo extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int anchura=getWidth();
        int altura=getHeight();

        g.drawLine(30,30,30,300);
        g.drawLine(30,30,200, 30);
        g.drawLine(200, 30, 200,150);
        g.drawLine(30,150, 200, 150);
        g.drawLine(65, 150, 200, 300);
    }
}
