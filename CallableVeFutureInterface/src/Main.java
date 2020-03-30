
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    /* 
    Trehad lar da Runnable interface den run metodu kullanmistik. 
    fakat run metodu ile thread islemi bitirdikten sonra herhangi bir deger donemiyoruz. 
    Bunun alternatifi olarak Callable ve Future interface kullanacagiz.
    */
    public static void main(String[] args){
        //Thread havuzunda en fazla kac tane thread calisabilir onu belirledik.
        ExecutorService threadHavuz=Executors.newFixedThreadPool(1);
       /* 
        threadHavuz.submit(new Runnable(){
            @Override
            public void run() {
                Random random=new Random();
                System.out.println("Thread Calisiyor.");
                int sure=random.nextInt(1000)+2000;
                
                try {
                    Thread.sleep(sure);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Thread Cikiyor....");
            }
        }); */
        Future<Integer> future= threadHavuz.submit(new Callable<Integer>(){
        	//Future<?> seklinde kullanirsak, Callable<Integer> icerigi ne ise Future de ona gore calisacaktir.
            //Runnable metodunda exception verme gibi durum yokken 
            //Callable metodunda ise Exception verebileceginiz belirtecegiz.
            //Ayrica burda return sure seklinde deger dondurebilecegiz.
            @Override
            public Integer call() throws Exception {
               Random random=new Random();
                System.out.println("Thread Calisiyor.");
                int sure=random.nextInt(1000)+2000;
                if (sure>2500) {
                    throw new IOException("Sure 2500 mili saniyeyi ge�ti.");
                    //sure 2500 mls gecers hata olustur.
                }
                try {
                    Thread.sleep(sure);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Thread Cikiyor....");
                return sure;
            }
        });
        threadHavuz.shutdown();
        try {
            System.out.println("Donen Deger : "+future.get());
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            System.out.println(ex+"Thread uyuyor...");
            // ex.printStackTrace(); //java nin kendi hada kodlari gorunmesini istersek
        }
    }
}
