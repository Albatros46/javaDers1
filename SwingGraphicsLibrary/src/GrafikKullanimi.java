
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class GrafikKullanimi extends JPanel {

    public GrafikKullanimi() {
        setBackground(Color.WHITE);
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
    //Eger kendi tasarimizi olusturmak istiyorsak JComponent icindeki Paint metodunu kullanmaliyiz.
    /*Kullanimi ise :
    X,Y koordinat belirtir- width, height ise nesnenin ebatını belirtir.
        Graphics g = create();
        if (g == null) return null;
        g.translate(x, y);
        g.clipRect(0, 0, width, height);
        return g;
    */
        g.setColor(Color.RED);
        //g.drawRect(X, Y, En, Boy);
        g.drawRect(100, 20, 30, 50); //Bos dikdortgen
        g.fillRect(200, 50, 30, 50); //ici dolu dikdortgen
        g.fill3DRect(400, 100, 60, 120, true);
        g.drawOval(200, 30, 200, 100);
        g.drawLine(300, 300, 200, 300);//Cizgi 
    }
    
}
