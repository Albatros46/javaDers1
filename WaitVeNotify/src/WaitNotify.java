
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WaitNotify {
    private Object log=new Object();
    
    public void th1Fonksiyonu(){
        synchronized(log){//sadece bu kod blogu anahtarlanmis olacak
            System.out.println("Thread 1 calisiyor...");
            System.out.println("Thread 2 tarafindan uyandirilmayi bekliyor........");
            
            try { 
        //T�ki baska bir thread tarafindan uyandirilana kadar anahtar wait de bekleyecek
        //Baska bir thread tarafinda notify edilmezse sonsuza kadar anahtar burada bekleyecektir.
                log.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Thread 1 uyandirildi. Islem Devam ediyor...");
        }
    }
    
    public void th2Fonksiyonu(){
        Scanner scanner=new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
        }
        synchronized(log){
            System.out.println("Thread 2 calisiyor...");
            System.out.println("Devam etmek icin bir tusa basiniz...");
            scanner.nextLine();//disaridan geri girilene kadar thread 1 calisacak
            
                log.notify(); //thread2 uyandirildi.
            
            //Bir yerde wait var ise kesinlikle tekrar dan notify edilmelidir 
            //aksi takdirde arada kalan kod blogu calismaz ilk kod blogu klitlenmis olur.
            
            System.out.println("Thread 1 uyandi isleme Thread 2 devam edecek... ");
            
        }
    }
}
