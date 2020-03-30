
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    private static ArrayList<Integer> icerik = new ArrayList<Integer>();
    
    public static void dosyaOku() {
        
        try {
            FileInputStream in = new FileInputStream("muzik.mp3");
            //FileInputStream ile dosyamizi okuduk
            
            int oku;
            
            while ((oku = in.read()) != -1){
                
                icerik.add(oku);
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public static  void kopyala(String dosyaismi) {
        //FileOutputStream ile okunan degeri cekiyoruz 
        try {
            FileOutputStream out = new FileOutputStream(dosyaismi);
            
            for (int deger : icerik) {
                
                out.write(deger);
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
    public static void main(String[] args) {
        dosyaOku();
       
        Thread thread1  = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("muzik1.mp3");
            }
        });
        Thread thread2  = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("muzik2.mp3");
            }
        });
        Thread thread3  = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("muzik3.mp3");
            }
        });
        
        long baslangic = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread3.start();
        
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        long bitis = System.currentTimeMillis();
        
        
        System.out.println("3 dosyan�n kopyalanmas� �u kadar s�rd� : " + ((bitis - baslangic)/ 1000) + "saniye");
        
    }
}
