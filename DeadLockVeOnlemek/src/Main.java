
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args){
        DeadLockOrnegi deadlock=new DeadLockOrnegi();
        
        Thread th1=new Thread(new Runnable(){
            @Override
            public void run() {
                deadlock.th1Fonksiyonu();
            }
            
        });
        
        Thread th2=new Thread(new Runnable(){
            @Override
            public void run() {
                deadlock.th2Fonksiyonu();
            }
        
        });
        
        th1.start(); th2.start(); //Thread lari baslattik
        
        try {
            th1.join();  //thread lari bosa cikardik
            th2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        deadlock.thOver();
    }
}
