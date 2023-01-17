import javax.swing.JFrame;
public class PruebaPanelDibujo {
    public static void main(String[] args) {
        PanelDibujo panel = new PanelDibujo();
        Panel3DLetra panel2 = new Panel3DLetra();
        JFrame aplicacion = new JFrame();

        /*aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add( panel );
        aplicacion.setSize(250,250);
        aplicacion.setVisible(true);*/

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add( panel2 );
        aplicacion.setSize(300,300);
        aplicacion.setVisible(true);
    }
}
