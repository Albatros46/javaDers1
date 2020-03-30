
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
Buyuk projelerde birden fazla 100 tane belki daha fazla Thread larimiz bulunabilir.
Butun threadlarin ayn� anda calismasi da bellekte gereksiz kullanim harcayacagindan 
ExecutorService ile biz bu thread lara calisma sartlari/siralari veya thread havuzlari olusturacagiz.
*/
public class Main {
    public static void main(String[] args){
        //thread havuzu olusturuldu ve de havuzda n kadar thread calisacagi belirtildi
        //Thread havuzunda ayn� anda sadece 2 tane thread calisabilecek
        System.out.println("Calisanlar Mesaiye Basladi");
        ExecutorService havuz=Executors.newFixedThreadPool(2);
        
        for (int i = 0; i < 5; i++) { 
        //dongu ile thread indexleri dongu degiskenine atandi.
            havuz.submit(new Worker(String.valueOf(i),i));
        }
        havuz.shutdown();//havuz kapatildi. shutdown edilmedigi surece program calismasi sonlanmayacaktir.
        System.out.println("Butun isler teslim edildi.");
        try {
            //Asagida yazmis oldugumuz kodlarin islerini bu sekilde yapabiliriz.
        	//islem en fazla awaitTermination da belirtilen kadar beklenir zaman yetmez ise alt 
            //satirdaki kodlarin calismasi devam eder diger thread lar beklenmez.
            havuz.awaitTermination(1, TimeUnit.DAYS);//islem sirasinda bekleme suresi 1 gun
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Butun isler tamamlandi.");
        
 /*       
        Thread t1=new Thread(new Worker("Servet",1));
        Thread t2=new Thread(new Worker("Ahmet",2));
        Thread t3=new Thread(new Worker("Akif",3));
        Thread t4=new Thread(new Worker("Oguz",4));
        Thread t5=new Thread(new Worker("Rukiye",5));
        //ilk olarak t1 ve t1 calissin sonra t3 ve t4 en son t5 calissin istiyoruz.
        
        System.out.println("Calisanlar mesaiye basladi...");
       
        t1.start(); t2.start(); //t1 ve t2 basladi
        
        try {//sonra t1 ve t2 bitene kadar main treadimiz bloklanmis oldu.
            t1.join(); t2.join(); 
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t3.start(); t4.start(); //t1 ve t2 basladi
        
        try {//sonra t3 ve t4 bitene kadar main treadimiz bloklanmis oldu.
            t3.join(); t4.join(); 
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t5.start();//t5 basladi
        try {//t5 bitene kadar main thread bloklandi.
            t5.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Butun isler tamamlandi.");
        
        */
    }

}
