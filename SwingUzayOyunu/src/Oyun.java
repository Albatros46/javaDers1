
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

class Ates{
    /* ateslerin x y koortinatlari olacak her ates edildiginde
    ActionPerformed kullanilacak.
    */
    private int x; //x koordinati
    private int y; //y koordinati

    public Ates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
public class Oyun extends JPanel implements KeyListener,ActionListener{
/* timer her calistiginda ActionListener icindeki  actionperform kullacagiz 
*/
    Timer timer=new Timer(5,this);//timer e girilen degerler; timer n kadar süreyle calisacak, ActionPerform u implement eden obje
    private int gecenSure=0; //oyunda gecen sure icin
    private int harcananAtes=0; //kac kez ates etti
    private BufferedImage image; //ozayGemisi resmi icin
    
    private ArrayList<Ates> atesler=new ArrayList<Ates>();//birden farkli ates turleri olabilir.
    
    private int atesDirY=1; //her ates edildiginde timer caliyor olacak ve atesler Y koordinatinda yukari gidecek
    private int topX=0;//top ekranin üst kisminda saga sola hareket edecek baslangic olarak 0 koorinati alacak
    
    private int topDirX=2;//surekli topX e eklenecek ve top bir yere carptiginda saga yada sola donecek
    
    private int uzayGemisiX=0;//uzay gemisinin baslayacagi nokta
    private int dirUzayX=20;//klavyeden sag tusa veya sol tusa basildginda uzayGemisiX e 20 ekleyerek hareket edecek
    
    public boolean kontrolEt(){
        //Eger ates topu vurusa true deger donsun ve oyun bitsin false deger donerse oyun devam etsin
        for(Ates ates:atesler){
            if(new Rectangle(ates.getX(),ates.getY(),10,20).intersects(new Rectangle(topX,0,20,20))){
         //rectangle ile iki yeni  dikdortgen olusturduk o dikdortgenlerin biri ates ile beraber olacak digeri ise top ile 
         //intersects ile bu iki nesne carpismis mi kontrol edecegiz. biz bu nesneleri ekranda gormeyecegiz. 
         //top ve ates ile beraber hareket edecekler
                 return true; //eger iki nesne carpisirsa true deger donecek ve oyun bitecek
            }
        }
        return false;// iki obje carpismadiysa false deger donecek ve oyun devam edecek
    }
    
    public Oyun() {
        try {
            image=ImageIO.read(new FileImageInputStream(new File("uzayGemisi.png")));//uzay gemisi resmini ekrana cektik
        } catch (IOException ex) {
            Logger.getLogger(Oyun.class.getName()).log(Level.SEVERE, null, ex);
        }
        setBackground(Color.BLACK);// ekran arkapalni siyah yaptik
     timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        gecenSure+=5;//timer 5 mls ile calstigi icin oyun bittiginde gecen sureye 5 ekleyecek
        g.setColor(Color.red); //topun rengi
        g.fillOval(topX, 0, 20, 20); //topun boyutunu belirleyecegiz
        g.drawImage(image, uzayGemisiX, 490, image.getWidth()/10,image.getHeight()/10,this);//disaridan cekmis oldugumuz resmi ekrana konumlandirdik
                   //     x ekseninde 490 da duracak, resmin en ve boyunu 10 a bolerek ekranda kucuk yer kaplamasini sagladik
        //---Ates Bolumu
        for (Ates ates:atesler) {
            if (ates.getY()<0) {
                //eger atesler frame üst kısmına geldiyse silinsin, bir çok ates uretecegimiz icin programda yavaslamaya sebep olmasin
                atesler.remove(ates);
                
            }
        }
        g.setColor(Color.BLUE); //atesin rengi mavi olacak
        for(Ates ates:atesler){
            g.fillRect(ates.getX(), ates.getY(), 10, 20);//atesin X ekseni degismeyecek sadece Y koordinatinda yukari ilerleyecek
        }
        //-------------
        //atesle vurma kismi
        if(kontrolEt()){
            //Eger kontrolEt metodunda deger true donerde timer dursun oyun bitsin ve mesaj versin
            timer.stop();
            String mesaj="Kazandiniz \n"+ 
                    "Harcanan Ates : "+harcananAtes+
                    "\nGeçen Süre : "+gecenSure/1000.0f+" saniye";//gecen sure milisaniye cinsiden oldugu icin saniye cevirdik tam deger cikmasi icin float a cevirerek islem yaptik
            JOptionPane.showMessageDialog(this, mesaj);
            System.exit(0);//program kapansin
        }
    }
/* paint- repaint farki java oyun yazdigimizda repaint her cagirildiginda paint de caigriyor aslinda
    AcitonPerformed her cagirildiginda repaint de ekran tazelemesi yapiyor ve bu esnada paint de
    geri planda sabit nesler icin ekran tazeliyor.
*/
    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c=e.getKeyCode(); // c degeri klavyeden sag/sol yon tuslarina basildginda deger donecek
        if (c==KeyEvent.VK_LEFT) { //KeyEvent klavyden hangi tuslasrla giris yapildigini gostercegizmiz metod
            //sol tusa basildiginda yapilacak islemler
             if (uzayGemisiX<=0) {
                //uzay gemisi ekranin tam soluna dayandiysa frame disina cikmasin
                uzayGemisiX=0;
            }else{
                //Eger uzay gemisi tam frame kenarina degdi ise dirUzayX degeri kadar o koordinattan cikar diger tarafa yonlendir.
                uzayGemisiX-=dirUzayX; 
            }
            
        }else if (c==KeyEvent.VK_RIGHT) {
            //saga basildiginda
            if (uzayGemisiX>=720) {
            //Eger uzay gemisi 720 kooridanata geldiyse ordan saga gidemesin 
                uzayGemisiX=720;
                
            }else{
            //Eger uzay gemisi tam frame kenarina degdi ise dirUzayX degeri kadar o koordinattan topla diger tarafa yonlendir.
                uzayGemisiX+=dirUzayX; 
            }
        }else if(c==KeyEvent.VK_CONTROL){
            //Eger klavyeden CTRL tusuna basilirsa ates etsin.
            //Atesler class dan atesi cektik atesin baslangici uzaygemisi ile ayni yerde olacagindan koordinatlari uzay gemisi ile ayni yer girdik
            atesler.add(new Ates(uzayGemisiX+15,490));
            harcananAtes++; //Ates edildikce deger artacak(n kadar ates ettigimizi gormek icin)
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //----Ates kismi
        //her atas edildiginda ates y koordinatinda gidecegi icin, actionPerformed/timer her calistiginda koordinat yenilenecek
        for (Ates ates:atesler) {
            ates.setY(ates.getY()-atesDirY); //her ates edildiginde atesDirY kadar Y koordinatinda hareket edecek
            /*actionPerformed sonunda repaint caigiriliyor repaint de paint i cagiriyor biz paint de ates sekli cizecegiz*/
        }
        
        //------------------
        topX+=topDirX;
        if (topX>=750) { //top 750 koordinatina geldiyse
            topDirX=-topX; //topun buldugu koordinatdan topDirx kadar cikar yani top diger tarafa kayacak
        }
        if (topX<=0) { //top burada da diger tarafa degdi ise o konumuna topdirx kadar ekle diger tarafa gitsin
            topDirX=-topDirX;
        }
        repaint();
    }
    
}
