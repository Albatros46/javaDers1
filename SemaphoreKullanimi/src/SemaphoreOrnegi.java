
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SemaphoreOrnegi {
    //ayni anda kac tane thread calisabilir/izin verilebilir
    //Semaphore bir nevi sayac gorevi gorecek sayac=3 olarak ayarladik 
    private Semaphore sem=new Semaphore(3); //ayni anda 3 tane thread calisacaktir.
    
    public void threadFonksiyonu(int id){
        try {
            //Semaphore daki sayac kontrol edecek
            sem.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreOrnegi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Thread basladi : "+id);
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreOrnegi.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread cikiyor : "+id);
        sem.release();
    }
}
