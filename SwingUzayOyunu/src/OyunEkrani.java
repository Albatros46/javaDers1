
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class OyunEkrani extends JFrame {
    public static void main(String[] args) {
        OyunEkrani ekran=new OyunEkrani("Uzay Oyunu v1.1");
        ekran.setResizable(false);//ekran 
        ekran.setFocusable(false);// yapilan islemler(klavyeden girildiginde) JFrame odaklanmasin (cunku jpanel e odaklayacagiz)
        ekran.setSize(800,600);//Ekran boyutu
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Kod yazim sirasina dikkat edilmeli aksi taktirde bazen klavyeden giris yapilamiyor
        
        Oyun  oyun=new Oyun();
        oyun.requestFocus();//Klavyeden girilen islemleri yaptirmak icin
        oyun.addKeyListener(oyun);//klavyeden islem girecegimizi belirtiyoruz.
        oyun.setFocusable(true);//fokuslanmayi JFramde false etmiştik şimdi burada JPanelde true ettik
        oyun.setFocusTraversalKeysEnabled(false);//JFrame nin klavye islemlerini anlamasi icin
        
        ekran.add(oyun);//JPanel i JFrame ye ekledik.
        
        ekran.setVisible(true);
        
    }

    public OyunEkrani(String title) throws HeadlessException {
        super(title);
        
    }
}
