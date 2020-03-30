
package com.srvtkcdg.thread1;

public class Main {
    public static void main(String[] args){
        /*Printer i Thread class in bir alt sinif olarak urettigimiz icin 
        artik printer objeleri kendi icinde bir tane thread gibi davranacak.
        objeleri calistirmak icin .start() metodu kullanacagiz.
        Uc tane thread olusturmus olduk birinci main class varsayilan thread 
        diger ikisi alt sinif olarak uretilen thread larimiz.
        */
    	 Printer printer1=new Printer("1 Numarali Yazici.");
         Printer printer2=new Printer("2 Numarali Yazici.");
         Printer printer3=new Printer("3 Numarali Yazici.");
         Printer printer4=new Printer("4 Numarali Yazici.");
         
         printer1.start();  printer3.start();
         printer2.start();  printer4.start();
        
        System.out.println("Main thread calisiyor....");
    }
}
