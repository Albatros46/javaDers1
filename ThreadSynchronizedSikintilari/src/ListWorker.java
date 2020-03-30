
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ListWorker {
    private Object log1= new Object(); //artik kisa surede verinin tamamini aktarmak icin anahtar objesi urettik
    private Object log2= new Object(); //anahtar objeleri herhangi bir veri tipinde olabilir.
    
    
    Random random=new Random();
    ArrayList<Integer> list1=new ArrayList<Integer>();
    ArrayList<Integer> list2=new ArrayList<Integer>();
    
    public  void list1deger(){
         /*
        synchronized kullanmadan girdiðimizde süre kisaliyor fakat deger 2000 e gelmeden program kapaniyor
        bunun icin synchronized yaparak sadece bir tread yonlendirmis olduk.
        fakat bu kullanimda yine sure olarak fazla oldugu icin hem sureyi kisa tutmak ve 2000 tane degeri atamak icin
        iki farklý anahtar uretecegiz.
        */
         synchronized(log1){ // artik metodlarimizi degil sadece kod blogumuzu synchronized ettik.
        try {
            Thread.sleep(1);
            
        
        } catch (InterruptedException ex) {
            Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
        list1.add(random.nextInt(100)); //Random metodu ile 0-100 arasýnda rast gele deger atamasi yapacak
                
//        for (int i = 0; i < 2000; i++) {
//            list1.add(i); //2000 tane degeri list1 e atacak
//            try {
//                Thread.sleep(1); //1 milisaniye bekleyecek
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
;
         }
        
    }
    
    public  void list2deger(){
        /*
        synchronized kullanmadan girdiðimizde süre kisaliyor fakat deger 2000 e gelmeden program kapaniyor
        bunun icin synchronized yaparak sadece bir tread yonlendirmis olduk.
        fakat bu kullanimda yine sure olarak fazla oldugu icin hem sureyi kisa tutmak ve 2000 tane degeri atamak icin
        iki farklý anahtar uretecegiz.
        */
        synchronized(log2){ // artik metodlarimizi degil sadece kod blogumuzu synchronized ettik.
         try {
            Thread.sleep(1);
            
        
        } catch (InterruptedException ex) {
            Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
        list2.add(random.nextInt(100)); //Random metodu ile 0-100 arasýnda rast gele deger atamasi yapacak
        
//        for (int i = 0; i < 2000; i++) {
//            list2.add(i); //2000 tane degeri list1 e atacak
//            try {
//                Thread.sleep(1); //1 milisaniye bekleyecek
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
        }
    }
    
    public void degerAta(){
        for (int i = 0; i < 1000; i++) {
            //Listlere 1000 deger atandi
            list1deger();
            list2deger();
        }
        
        //System.out.println("List1-->"+list1.size()+" List2-->"+list2.size());
    }
    
    public void calistir(){
        //thread ler le degerAta cagirildi ve 1000 er deger tekrar atandi toplamda 2000 degere sahiplacaklar
        Thread thread1=new Thread(new Runnable(){
            @Override
            public void run() {
               degerAta();
            }
            
        });
        Thread thread2=new Thread(new Runnable(){
            @Override
            public void run() {
               degerAta();
            }
            
        });
        long baslangic=System.currentTimeMillis();//threadlar baslamadan onceki zaman
        thread1.start();//Threadlar calistirildi
        thread2.start();
        
        try {
            thread1.join();//Threarlarin calismasi bitmeden diger kodlara calismayacak.
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("List1-->"+list1.size()+" List2-->"+list2.size());
        long bitis=System.currentTimeMillis();//Threadlar bittigindeki zaman
        
        System.out.println("Gecen Sure : "+(bitis-baslangic)+" milisaniye...");
    }
}
