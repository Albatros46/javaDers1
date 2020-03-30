
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
Thread lari yarida kesme Interrupt etme.
*/
public class Main {
    public static void main(String[] args){
        List<Integer> list=new LinkedList<Integer>();
        
        Thread t=new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Thread Calisiyor...");
                for (int i = 0; i < 100000; i++) {
                    //Thread herhangi bir interrupt ile ugradiysa true donecek deger
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Thread Kesintiye ugradi...");
                        return;
                    }
                    list.add(i);
                }
                System.out.println("Thread Kesintiye ugramadan isini bitirdi....");
               /* for (int i =1 ; i <= 10; i++) {
                    System.out.println("Thread Yaziyor " +i);
                    try {
                        Thread.sleep(1000);
                        System.out.println("Calismanin "+i+". saniyesindeyim...");
                    } catch (InterruptedException ex) {
                        System.out.println("Tread Bolundu...");
                    }
                }  */
            }
            
        });
        t.start();
        try {
            Thread.sleep(3000);//2000 ms den sonra thread interrupt etsin istiyorum
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.interrupt();
      
            
    }
}
