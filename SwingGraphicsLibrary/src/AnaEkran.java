
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class AnaEkran extends JFrame {

    public AnaEkran(String title) throws HeadlessException {
        super(title);
        
        
    }
       
    
    public static void main(String[] args) {
        GrafikKullanimi grafik=new GrafikKullanimi();
        
        AnaEkran ekran=new AnaEkran("Grafik Kullanımı");
        ekran.setVisible(true);//Ekran gorunsun
        ekran.setResizable(true);//Ekranın keranarından cekildiginde genislesin
        ekran.setSize(800,600);//ekran en-boy
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//X ya basildiginda kapansin
        ekran.setLocation(400, 170);//Ekranin konumlanacagi nokta /x,y
        
        ekran.add(grafik);
    }
}
