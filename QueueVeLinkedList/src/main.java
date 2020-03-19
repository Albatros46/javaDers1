
import java.util.LinkedList;
import java.util.Queue;


public class main {
    public static void main(String[] args){
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
    
        Queue<String> kuyruk=new LinkedList<String>();
        kuyruk.offer("Java"); kuyruk.offer("Python"); kuyruk.offer("Flutter"); 
        kuyruk.offer("C++"); kuyruk.offer("Go"); kuyruk.offer("C#"); 
        
        System.out.println("Kuyrugun Ilk Elemani :"+kuyruk.peek());
        System.out.println("----------------");
        for(String s:kuyruk){
            System.out.println(s);
        }
        System.out.println("Kuyruk Durumu "+kuyruk.isEmpty());//Kuyruk dolu ise False bos ise True deger donecek
        System.out.println("**************");
        System.out.println("Ilk Eleman : "+kuyruk.poll());
        for(String s:kuyruk){
            System.out.println(s);
        }
        while(!kuyruk.isEmpty()){
            System.out.println("Eleman Cikariliyor : "+kuyruk.poll());
        }
    }
}
