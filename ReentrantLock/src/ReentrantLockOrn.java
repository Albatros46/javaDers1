
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReentrantLockOrn {
    private int say=0;
    private Lock log=new ReentrantLock(); //Lock bir interfaces ReentrantLock ise lock u implement eden class
    private Condition condition=log.newCondition(); //wait ve notify yapabilmek icin condition kullanmaliyiz.
    
    
    public void artir(){//say degiskenimiz 10000 defa kadar artacak
        for (int i = 0; i < 10000; i++) {
            say++;
        }
      
    }
    
    public void thread1Fonksiyonu(){
        log.lock();//anahtari kim aldiysa o calissin
            System.out.println("Thread 1 Uyandirilmayi Bekliyor...");
        try {
            condition.await();
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentrantLockOrn.class.getName()).log(Level.SEVERE, null, ex);
        }
            artir(); //eger kodumuz exception ile karsilasirsa finally blogu calissin
            System.out.println("Thread 1 Uyandirildi ve islemine devam ediyor...");
     
            log.unlock();//anahtar teslim edildi baska treadlar da artik erisebilir.
      
    }
    
    public void thread2Fonksiyonu(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentrantLockOrn.class.getName()).log(Level.SEVERE, null, ex);
        }
         Scanner scanner=new Scanner(System.in);
        
         log.lock();//anahtari kim aldiysa o calissin
            System.out.println("Thread 1 Calisiyor.");
            artir(); 
            System.out.println("Devam etmek icin bir tusa basin.");
            scanner.nextLine();
            condition.signal();
            System.out.println("Thread 1 uyandirildi. Eyvallah ben gider...");
            log.unlock();//anahtar teslim edildi baska treadlar da artik erisebilir.
      
    }
    
    public void threadOver(){
        System.out.println("Sayac : "+say);
    }
}
