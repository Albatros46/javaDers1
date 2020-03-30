
package com.srvtkcdg.thread2;
/*EGer bir class i bir tane thread olarak kullanmak istiyorsaniz
  implements Runnable yontemi ile runnable icindeki run metodu kullanilarak
  o class thread olarak kullanilabilir.
*/
public class Printer implements Runnable{
    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }
    
    @Override
    public void run() {
       System.out.println(isim+" Calisiyor...");
        
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(isim+" isim yaziyor "+i);
                Thread.sleep(1000);//Ekrana her yazdiginda 1 sn bekleyecek
            } catch (InterruptedException ex) {
                //Thread da bir hata olusursa sleep den uyandirilmasi gerektigi icin try-catch kullandik
                System.out.println("Thread Kesintiye ugradi.-InterruptedException");
            }
        }
        System.out.println("Servet AKCADAG islemi bitirdi...");
    }
    
}
