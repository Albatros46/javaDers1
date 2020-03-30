
package com.srvtkcdg.thread1;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Printer extends Thread{
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
