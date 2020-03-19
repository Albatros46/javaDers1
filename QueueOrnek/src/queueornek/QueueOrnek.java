    /*
        Queue(Kuyruk):Interfacesini Implements eden LinkedList Class FIFO (Firs In First Out-Ilk Giren Ilk Cikar)
        add(Eleman)-->Elemani kuyruga ekler. Ekleyemez ise hata olusur.
        offer(Eleman)-->Elemani kuyruga ekler. Eklerse TRUE ekleyemezse FALSE deger doner.
        remove()-->Kuyrugun en basindaki elemani kuyruktan cikarir, kuyruk bos ise HATA verir.
        poll()-->Kuyrugun en basintaki elemani kuyruktan cikarir, kuyruk bos ise NULL deger doner.
        element()-->Kuyrugun en basindaki elemani dondurur, kuyruk bos ise HATA verir.
        peek()-->Kuyrugun en basindaki elemani dondurur, kuyruk bos ise NULL deger doner.
        
        Stack lerde -->LIFO(Last In First Out-Son Giren Ilk Cikar)
        Queue lerde -->FIFO(Firs In First Out-Ilk Giren Ilk Cikar)
    */
package queueornek;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueOrnek {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Ramazan Pidesi Kuyrugu...");
        Queue<String> PideKuyrugu=new LinkedList<String>();
        Random random = new Random();
        
        PideKuyrugu.offer("Servet"); PideKuyrugu.offer("Ahmet"); PideKuyrugu.offer("Akif");
        PideKuyrugu.offer("Oguz"); PideKuyrugu.offer("Rukiye"); PideKuyrugu.offer("Bekir");
        PideKuyrugu.offer("Serpil"); PideKuyrugu.offer("Ilknur"); PideKuyrugu.offer("Hatice");
        PideKuyrugu.offer("Ibrahim"); PideKuyrugu.offer("Cuma"); PideKuyrugu.offer("Emel");
        PideKuyrugu.offer("Yavuz"); PideKuyrugu.offer("Kenan"); PideKuyrugu.offer("Mesut");
         
        int pide_sayisi = 1 + random.nextInt(15);
        System.out.println("Pideler Çýkýyor...");
        System.out.println("Çýkan Pide Sayýsý : " + pide_sayisi);
        Thread.sleep(3000);//3 saniye bekleyecek
        
        while (pide_sayisi != 0) {
            
            System.out.println(PideKuyrugu.poll() + " pideyi aldý...");
            pide_sayisi--;
            Thread.sleep(1000);
            
        }
        
        System.out.println("Pide kalmadý...");
        
    }
    
}
