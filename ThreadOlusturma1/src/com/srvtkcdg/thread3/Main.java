
package com.srvtkcdg.thread3;

import java.util.logging.Level;
import java.util.logging.Logger;

/* Class icersinde de anonim Thread tanimlayabiliriz.
*/

public class Main {
    public static void main(String[] args){
        Thread araba1=new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Thread Calisiyor");
                for (int i = 0; i < 10; i++) {
                    System.out.println(" Yaziyor "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        
        });
        araba1.start();
        System.out.println("Anonim Thread Calisti...");
        
        
        //Burdaki kullanim ile de tek kullanimlik thread yazmis oluruz.
//        new Thread(new Runnable(){
//            @Override
//            public void run() {
//                System.out.println("Thread Calisiyor");
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(" Yaziyor "+i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//            }
//        
//        }).start();
       
    }
}
