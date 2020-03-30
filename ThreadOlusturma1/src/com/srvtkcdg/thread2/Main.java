
package com.srvtkcdg.thread2;

public class Main {
    public static void main(String[] args){
        /*Printer i Thread class in bir alt sinif olarak urettigimiz icin 
        artik printer objeleri kendi icinde bir tane thread gibi davranacak.
        objeleri calistirmak icin .start() metodu kullanacagiz.
        Uc tane thread olusturmus olduk birinci main class varsayilan thread 
        diger ikisi alt sinif olarak uretilen thread larimiz.
        */
        Thread Printer1=new Thread(new Printer("1. Yazici "));
        Thread Printer2=new Thread(new Printer("2. Yazici "));
        Thread Printer3=new Thread(new Printer("3. Yazici "));
        Thread Printer4=new Thread(new Printer("4. Yazici "));
        
        Printer1.start();  Printer2.start();  Printer3.start();  Printer4.start();
        
        System.out.println("Main thread calisiyor....");
    }
}
