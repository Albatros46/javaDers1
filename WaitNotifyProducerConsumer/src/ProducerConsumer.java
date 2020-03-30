
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProducerConsumer {
    Random random=new Random();
    Object lock=new Object();
    Queue<Integer> queue=new LinkedList<Integer>();
    private int limit=10;//linkedlist boyu 10 geçmeden calismasi icin limit olusturduk
    
    
    public void producer(){
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            /*Linklist imiz 10 olana kadar calisacak 10 oldugunda
            wait olarak bekleyecek.
            */
            synchronized(lock){
                if (queue.size()==limit) {
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }//eger linkedlist icerigi 10 olmadýysa rastgele sayý uret icerige
                Integer value=random.nextInt(1000);
                queue.offer(value);
                System.out.println("Producer Uretiyor : "+value);
                lock.notify();
            }
        }
    }
    
    public void consumer(){
        while(true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            synchronized(lock){
                if (queue.size()==0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }//Queue giren verileri cekecegiz.
                Integer value=queue.poll();
                System.out.println("Consumer Veri Cekiyor : "+value);
                System.out.println("Queu Size : "+queue.size());
                lock.notify();
            }
        }
    }
}
